package p01.switches;

import java.util.Scanner;

public class Switch3Example {

	public static void main(String[] args) {
		//���� �����
		//�� 1 op �� 2
		int arg1 = 0 , arg2 = 0;
		double result = 0.0;
		char op = ' ';
		//Ű���尪�� �Է¹޴� scanner��ü ����
		Scanner keyboard = new Scanner(System.in);
		System.out.println("���� ���α׷� ��1 op ��2 ���� ");
		System.out.println("ù��° ���� �Է��ϼ��� :");
		arg1 = keyboard.nextInt();
		System.out.println("�����ڸ� �Է��ϼ��� (+,-,��,/)");
		op = keyboard.next().charAt(0);
		System.out.println("�ι�° ���� �Է��ϼ��� :");
		arg2 = keyboard.nextInt();
		//switch()��
		
		switch(op) {
		case '+' :
			result = arg1+arg2;
			break;
		case '-' :
			result = arg1-arg2;
			break;
		case '*' :
			result = arg1*arg2;
			break;
		case '/' :
			result = arg1/arg2;
			break;
		}
		System.out.println("���"+arg1+"��"+arg2+"�� ��������  ="+result);
	
	}
}
