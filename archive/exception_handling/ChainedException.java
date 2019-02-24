package exception_handling;

public class ChainedException {
	
	static void demoFunc() {
		NullPointerException e = new NullPointerException("Top Layer");
		e.initCause(new ArithmeticException("Cause"));
		throw e;
	}

	public static void main(String[] args) {
		try {
			demoFunc();
		}catch(NullPointerException e) {
			System.out.println("Caught: " + e);
			System.out.println("Original Cause: " + e.getCause());
		}
	}

}
