package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AutoClose {
	public static void main(String[] args) {
		String original = "test.txt";
		String copy = "copy.txt";
		
		try(FileInputStream fin = new FileInputStream(original); 
				FileOutputStream fout = new FileOutputStream(copy))
		{
			int i;
			do {
				i = fin.read();
				if(i != -1) fout.write(i);
			}while(i != -1);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
