package exception_handling;

class MyException extends Exception{
	int data;
	
	MyException(int data){
		this.data = data;
	}
	
	public String toString() {
		return "MyException[" + data + "]";
	}
}

public class CustomException {

	static void printData(int data) throws MyException{
		System.out.println("DATA = " + data);
		throw new MyException(data);
	}
	
	public static void main(String[] args) {
		try {
			printData(10);
		}catch(MyException e) {
			System.out.println(e);
		}
	}

}
