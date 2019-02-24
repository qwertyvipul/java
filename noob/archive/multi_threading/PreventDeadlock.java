package multi_threading;

import java.lang.InterruptedException;

class NewThread2 implements Runnable{

	String name;
	Thread t;
	boolean suspendFlag;
	
	NewThread2(String name){
		this.name = name;
		t = new Thread();
		System.out.println("New thread created: " + t);
		suspendFlag = false;
		t.start();
	}
	
	@Override
	public void run() {
		try {
			for(int i=0; i<15; i++) {
				System.out.println(name + ": " + i);
				Thread.sleep(500);
				synchronized(this) {
					while(suspendFlag) {
						wait();
					}
				}
			}
		}catch(InterruptedException e) {
			System.out.println(name + " interrupted.");
		}
		System.out.println(name + " exiting.");
	}
	
	synchronized void suspendThread() {
		suspendFlag = true;
	}
	
	synchronized void resumeThread() {
		suspendFlag = false;
		notify();
	}
	
}

public class PreventDeadlock {

	public static void main(String[] args) {
		NewThread2 n1 = new NewThread2("First");
		NewThread2 n2 = new NewThread2("Second");
		
		try {
			Thread.sleep(1000);
			System.out.println("Suspending thread - 1");
			n1.suspendThread();
			
			Thread.sleep(1000);
			System.out.println("Resuming thread - 1");
			n1.resumeThread();
			
			Thread.sleep(1000);
			System.out.println("Suspending thread - 2");
			n2.suspendThread();
			
			Thread.sleep(1000);
			System.out.println("Resuming thread - 2");
			n2.resumeThread();
			
		}catch(InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
		
		try {
			System.out.println("Waiting for threads to finish!");
			n1.t.join();
			n2.t.join();
		}catch(InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
		
		System.out.println("Exiting main thread.");
	}
}
