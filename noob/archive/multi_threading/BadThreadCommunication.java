package multi_threading;

import java.lang.InterruptedException;

class A{
	int n;
	
	synchronized int get() {
		System.out.println("A Get: " + n);
		return n;
	}
	
	synchronized void put(int n) {
		this.n = n;
		System.out.println("A Put: " + n);
	}
}

class First implements Runnable{
	A a;
	
	First(A a){
		this.a = a;
		new Thread(this, "First").start();
	}
	
	public void run() {
		int i=0;
		while(true) {
			a.put(i++);
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				System.out.println("Interrupt - 2");
			}
		}
	}
}

class Second implements Runnable{
	A a;
	
	Second(A a){
		this.a = a;
		new Thread(this, "Second").start();
	}
	
	public void run() {
		int i=0;
		while(true) {
			a.get();
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				System.out.println("Interrupt - 2");
			}
		}
	}
}

public class BadThreadCommunication {

	public static void main(String[] args) {
		A a = new A();
		new First(a);
		new Second(a);
		
		System.out.println("Press CTRL+C to stop!");
	}

}
