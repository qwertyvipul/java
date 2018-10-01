package multi_threading;

import java.lang.InterruptedException;

class AClass{
	synchronized void foo(BClass b) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered A.foo");
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println("A Interrupted");
		}
		
		System.out.println(name + " trying to call B.last()");
		b.last();
	}
	
	synchronized void last() {
		System.out.println("Inside A.last()");
	}
}

class BClass{
	synchronized void bar(AClass a) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered B.bar");
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println("B Interrupted");
		}
		
		System.out.println(name + " trying to call A.last()");
		a.last();
	}
	
	synchronized void last() {
		System.out.println("Inside B.last()");
	}
}

public class DeadlockDemo implements Runnable{
	AClass a = new AClass();
	BClass b = new BClass();
	
	DeadlockDemo(){
		Thread.currentThread().setName("Main Thread");
		Thread t = new Thread(this, "Racing Thread");
		t.start();
		
		a.foo(b);
		System.out.println("Back in Main Thread");
	}
	
	public void run() {
		b.bar(a);
		System.out.println("Back in other thread");
	}
	
	public static void main(String args[]) {
		new DeadlockDemo();
	}
}
