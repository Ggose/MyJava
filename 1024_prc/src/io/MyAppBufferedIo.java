package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MyAppBufferedIo {

	public static void main(String[] args) throws Exception{
		
		FileInputStream fis = new FileInputStream("untitled.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream("untitled3.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		byte[] buffer = new byte[10];
		int num = 0;
		
		while((fis.read(buffer))!=-1) {
			bos.write(buffer,0,num);
		}
		
		bis.close();
		fis.close();
		bos.close();
		fos.close();
	}
}
