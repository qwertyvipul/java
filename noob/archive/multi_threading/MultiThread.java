package multi_threading;

import java.lang.InterruptedException;

class ANewThread implements Runnable{
	String name;
	Thread t;
	
	ANewThread(String name){
		this.name = name;
		t = new Thread(this, name);
		System.out.println("Creating thread: " + t);
		t.start();
	}
	
	public void run() {
		try {
			for(int i=5; i>0; i--) {
				System.out.println(name + ": " + i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {
			System.out.println(name + " Interrupted!");
		}
		
		System.out.println("Exiting " + name);
	}
}

public class MultiThread {

	public static void main(String[] args) {
		new ANewThread("One");
		new ANewThread("Two");
		new ANewThread("Three");
		
		try {
			//wait long enough for all threads to finish
			Thread.sleep(10000);
		}catch(InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
		
		System.out.println("Exiting Main Thread!");
	}

}
