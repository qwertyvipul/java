/*
 * Diamond inheritance of non-interface classes is not possible in Java
 * */

package inheritance;

class ClassA2{
	void print() {
		System.out.println("Class A");
	}
}

class ClassB2 extends ClassA2{
	void print() {
		System.out.println("Class B");
	}
}

class ClassC2 extends ClassA2{
	void print() {
		System.out.println("Class C");
	}
}



public class DiamondInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
