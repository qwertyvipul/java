package noob;

/*
 * PrintWriter makes our real world application easier to internationalize
 * 
 * */

import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, true);
		pw.println("This is a String.");
		
		//There is also one more amateur way
		//System.out.write("This a low level string.");
	}
}
