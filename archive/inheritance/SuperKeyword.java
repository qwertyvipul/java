package inheritance;

class SuperA{
	int num;
	
	SuperA(int num){
		this.num = num;
	}
	
	void print() {
		System.out.println("SuperA");
	}
}

class SuperB extends SuperA{
	int num;
	
	SuperB(int num){
		super(num*10); //Calling the super constructor using the super keyword
		this.num = num;
	}
	
	void print() {
		super.print();
		System.out.println("SuperB");
		System.out.println(super.num);
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		SuperB b = new SuperB(10);
		System.out.println(b.num);
		b.print();
	}

}
