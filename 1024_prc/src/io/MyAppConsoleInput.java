package io;

import java.util.Scanner;

public class MyAppConsoleInput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�ؽ�Ʈ�� �Է��ϼ��� :");
		String str = scanner.next();
		
		System.out.println("�Է¹��� ���� : "+str);
		
		scanner.close();
	}
}
