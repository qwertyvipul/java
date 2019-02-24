package autoboxing;

public class AutoBox {
	
	public static int unbox(Integer i) {
		return i;
	}

	public static void main(String[] args) {
		Integer iob = 100; //autobox an int
		int i = iob; //auto-unbox to int
		
		System.out.println(unbox(iob));
	}

}
