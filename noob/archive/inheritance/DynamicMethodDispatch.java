package inheritance;

class ClassA{
	void print() {
		System.out.println("Class A");
	}
}

class ClassB extends ClassA{
	void print() {
		System.out.println("Class B");
	}
}

class ClassC extends ClassB{
	void print() {
		System.out.println("Class C");
	}
}

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		ClassB b = new ClassB();
		ClassC c = new ClassC();
		ClassA a = new ClassA();
		
		ClassA r; //reference of type A
		
		r = a;
		r.print();
		
		r = b;
		r.print();
		
		r = c;
		r.print();
	}

}
