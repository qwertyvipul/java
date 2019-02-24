package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinyEditor {
	public static void main(String[] args) throws IOException {
		//Character Stream
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = new String[100];
		System.out.println("Enter your lines ('stop' to quit): ");
		int i=0;
		while(i<100) {
			str[i] = br.readLine();
			if(str[i].equals("stop")) break;
			i++;
		}
		
		System.out.println("-----------YOUR FILE-----------");
		int n = 0;
		while(n<i) {
			System.out.println(str[n]);
			n++;
		}
	}
}
