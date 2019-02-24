package multi_threading;

import java.lang.InterruptedException;

class SPrintClass{
	void print(String message) {
		System.out.print("[" + message);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println("Thread Interrupted!");
		}
		System.out.println("]");
	}
}

class SPrintThread implements Runnable{
	String name;
	SPrintClass sprint;
	String message;
	Thread t;
	
	SPrintThread(String name, SPrintClass sprint, String message){
		this.name = name;
		this.message = message;
		this.sprint = sprint;
		t = new Thread(this, name);
		t.start();
	}
	
	public void run() {
		synchronized(sprint) {
			sprint.print(message);
		}
	}
}


public class SynchronizedThread {
	public static void main(String[] args) {
		SPrintClass sprint = new SPrintClass();
		SPrintThread hello = new SPrintThread("hello", sprint, "Hello");
		SPrintThread awesome = new SPrintThread("awesome", sprint, "Awesome");
		SPrintThread world = new SPrintThread("world", sprint, "world");
		
		try {
			//wait for threads to finish
			hello.t.join();
			awesome.t.join();
			world.t.join();
		}catch(InterruptedException e) {
			System.out.println("Main Thread Interrupted");
		}
	}
}
