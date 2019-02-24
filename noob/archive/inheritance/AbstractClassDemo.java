/*
 * An abstract class cannot be declared directly with the new keyword
 * Any subclass of abstract class must implement all methods of abstract class
 * or should itself be abstract
 * 
 * Also there cannot be abstract constructors or abstract static methods 
 * */

package inheritance;

abstract class ParentA{
	abstract void abstractFunc();
	void concreteFunc() {
		System.out.println("Concrete function called.");
	}
}

class ChildA extends ParentA{

	@Override
	void abstractFunc() {
		System.out.println("Abstract function - Child A");
	}
	
}

class ChildB extends ParentA{

	@Override
	void abstractFunc() {
		System.out.println("Abstract function - Child B");
	}
	
}

public class AbstractClassDemo {
	
	public static void print(ParentA a) {
		a.abstractFunc();
	}

	public static void main(String[] args) {
		ChildA a = new ChildA();
		ChildB b = new ChildB();
		print(a);
		print(b);
	}

}
