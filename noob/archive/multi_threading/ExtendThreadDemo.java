package multi_threading;

class ExtendThread extends Thread{
	ExtendThread(){
		super("Extend Thread");
		System.out.println("Creating Child Thread: " + this);
		start();
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

public class ExtendThreadDemo {

	public static void main(String[] args) {
		new ExtendThread();
		
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
