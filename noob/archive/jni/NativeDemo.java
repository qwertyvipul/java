package jni;

public class NativeDemo {
	int i;
	public static void main(String[] args) {
		NativeDemo n = new NativeDemo();
		n.i = 10;
		System.out.println("i before native method = " + n.i);
		n.test();
		System.out.println("i after native method = " + n.i);
	}
	
	//native method
	public native void test();
	
	//load DLL that contains static method
	static {
		System.loadLibrary("NativeDemo");
	}
}
