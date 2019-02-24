package multi_threading;

import java.lang.InterruptedException;

class UPrintClass{
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

class UPrintThread implements Runnable{
	String name;
	UPrintClass uprint;
	String message;
	Thread t;
	
	UPrintThread(String name, UPrintClass uprint, String message){
		this.name = name;
		this.message = message;
		this.uprint = uprint;
		t = new Thread(this, name);
		t.start();
	}
	
	public void run() {
		uprint.print(message);
	}
}


public class UnsynchronizedThread {
	public static void main(String[] args) {
		UPrintClass uprint = new UPrintClass();
		UPrintThread hello = new UPrintThread("hello", uprint, "Hello");
		UPrintThread awesome = new UPrintThread("awesome", uprint, "Awesome");
		UPrintThread world = new UPrintThread("world", uprint, "world");
		
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
