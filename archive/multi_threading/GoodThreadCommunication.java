package multi_threading;

import java.lang.InterruptedException;

class ValueClass{
	int n;
	boolean valueset = false;
	
	synchronized int get() {
		while(!valueset) {
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println("Get Interrupted");
			}
		}
		System.out.println("Get: " + n);
		valueset = false;
		notify();
		return n;
	}
	
	synchronized void put(int n) {
		while(valueset) {
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println("Put Interrupted");
			}
		}
		
		this.n= n;
		valueset = true;
		System.out.println("Put: " + n);
		notify();
	}
}

class Alpha implements Runnable{
	ValueClass v;
	
	Alpha(ValueClass v){
		this.v = v;
		new Thread(this, "First").start();
	}
	
	public void run() {
		int i=0;
		while(true) {
			v.put(i++);
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				System.out.println("Interrupt - 2");
			}
		}
	}
}

class Beta implements Runnable{
	ValueClass v;
	
	Beta(ValueClass v){
		this.v = v;
		new Thread(this, "Second").start();
	}
	
	public void run() {
		int i=0;
		while(true) {
			v.get();
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				System.out.println("Interrupt - 2");
			}
		}
	}
}

public class GoodThreadCommunication {
	public static void main(String[] args) {
		ValueClass v = new ValueClass();
		new Alpha(v);
		new Beta(v);
		
		System.out.println("Press CTRL+C to stop!");
	}
}
