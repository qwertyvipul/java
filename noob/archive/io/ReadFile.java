package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) {
		String fileName = "test.txt";
		FileInputStream fin = null;
		try {
			fin = new FileInputStream(fileName);
			int i;
			do {
				i = fin.read();
				if(i != -1) System.out.println((char)i);
			}while(i != -1);
		}catch(FileNotFoundException e) {
			System.out.println("File not found!");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fin!=null) fin.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
