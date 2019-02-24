package string;

import java.util.Arrays;

public class StringSplit {
	public static void main(String[] args) {
		String myString = "Ram x Gopal x Rahul x Mohan";
		String names[] = myString.split("x");
		
		System.out.println(Arrays.toString(names));
	}
}
