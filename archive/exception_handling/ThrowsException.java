package exception_handling;

public class ThrowsException {
	
	static void demofunc() throws NullPointerException{
		throw new NullPointerException();
	}

	public static void main(String[] args) {
		try {
			demofunc();
		}catch(NullPointerException e) {
			System.out.println("Caught " + e);
		}
	}

}
