package p01.switches;

import java.util.Scanner;

public class Switch2Example {
/*
 * Switch()�� - break; ���� ������ ������ ���� case���� ��� ������.
 */
	public static void main(String[] args) {
		
		int calNum = -1;
		String season = "";
		
		Scanner keyboard = new Scanner(System.in);
		calNum = keyboard.nextInt();
		switch(calNum){
		case 12:
		case 1:
		case 2: season = "�ܿ�";break;
		case 3:
		case 4:
		case 5: season = "��";break;
		case 6:
		case 7:
		case 8: season = "����";break;
		case 9:
		case 10:
		case 11: season = "����";break;
		}
		System.out.println("�ش���� "+season+"�� ���մϴ�.");
		
	}
}
