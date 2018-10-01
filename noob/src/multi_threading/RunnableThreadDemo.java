package multi_threading;

import java.lang.InterruptedException;

class RunnableThread implements Runnable{
	Thread t;
	
	RunnableThread(){
		t = new Thread(this, "Runnable Thread");
		System.out.println("Creating Child Thread: " + t);
		t.start();
	}
	
	public void run() {
		try {
			for(int i=5; i>0; i--) {
				System.out.println("Child Thread: " + i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {
			System.out.println("Child Thread Interrupted!");
		}
		
		System.out.println("Exiting Child Thread!");
	}
}

public class RunnableThreadDemo{

	public static void main(String[] args) {
		new RunnableThread();
		
		try {
			for(int i=5; i>0; i--) {
				System.out.println("Main Thread: " + i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {
			System.out.println("Main Thread Interrupted!");
		}
		
		System.out.println("Exiting Main Thread!");
	}

}
