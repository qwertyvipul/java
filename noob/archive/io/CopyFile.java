package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	public static void main(String[] args) {
		String original = "test.txt";
		String copy = "copy.txt";
		
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		try {
			fin = new FileInputStream(original);
			fout = new FileOutputStream(copy);
			
			int i;
			do {
				i = fin.read();
				if(i != -1) fout.write(i);
			}while(i != -1);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fin != null) fin.close();
				if(fout != null) fin.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
