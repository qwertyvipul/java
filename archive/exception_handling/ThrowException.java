package exception_handling;

public class ThrowException {
	
	static void demofunc() {
		try {
			//throw new NullPointerException(); //This works as well
			throw new NullPointerException("Demo");
		}catch(NullPointerException e) {
			System.out.println("Exception inside demofunc");
			throw e;
		}
	}

	public static void main(String[] args) {
		try {
			demofunc();
		}catch(NullPointerException e) {
			System.out.println("Recaught " + e);
		}
	}

}
