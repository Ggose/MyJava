package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MyAppByteIO {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("untitled.txt");
		FileOutputStream fos = new FileOutputStream("untitled2.txt");
		int b= 0;
		
		while((b=fis.read()) != -1) {
			fos.write(b);
		}
		
		System.out.println(b);
		
		fis.close();
		fos.close();
	}
}
