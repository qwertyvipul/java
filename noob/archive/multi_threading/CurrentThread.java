/*
 * When java programs starts one thread starts running immediately
 * This is usually the main thread
 * 
 * We can obtain reference of main thread calling the method currentThread()
 * It is a public static member of Thread
 * */

package multi_threading;

import java.lang.InterruptedException;

public class CurrentThread {
	public static void main(String args[]) {
		Thread t = Thread.currentThread();
		System.out.println("Current thread: " + t);
		
		//change the name of the thread
		t.setName("New Thread");
		System.out.println("After name change: " + t);
		
		try {
			for(int n=5; n>0; n--) {
				System.out.println(n);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			System.out.println("Main thread interrupted!");
		}
	}
}
