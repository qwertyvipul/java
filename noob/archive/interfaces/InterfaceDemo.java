package interfaces;

interface IClassA{
	void print();
	
	default void getNum() {
		System.out.println("getNum() not implemented.");
	}
	
	static void getDefaultNum() {
		System.out.println(0);
	}
}

class ClassB2 implements IClassA{
	@Override
	public void print() {
		System.out.println("Class B");
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		IClassA.getDefaultNum();
		ClassB2 b = new ClassB2();
		b.print();
		b.getNum();
	}

}
