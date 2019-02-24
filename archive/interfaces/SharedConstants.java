package interfaces;

/*
 * Just like #define in C++
 * */
interface Nums{
	int ONE = 1;
	int TWO = 2;
}

public class SharedConstants implements Nums{
	public static void main(String[] args) {
		System.out.println(ONE);
		System.out.println(TWO);
	}
}
