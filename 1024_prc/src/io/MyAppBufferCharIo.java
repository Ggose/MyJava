package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class MyAppBufferCharIo {

	public static void main(String[] args) throws Exception{
		
		FileReader fr = new FileReader("untitled.txt");
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter fw = new FileWriter("untitled5.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		char [] c = new char[10];
		int flag = 0;
		
		while((flag = br.read(c))!=-1) {
			bw.write(c,0,flag);
		}
		fw.close();
		br.close();
		fw.close();
		bw.close();
		
	}
}
