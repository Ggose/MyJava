package p03.dowhile;

import java.util.Scanner;

/*
 * do~while()��
 */
public class Do3Example {

	public static void main(String[] args) {
		
		int num = 0, i=1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("���α׷��� �����Ϸ��� 'a'�� �Է��ϼ��� ");
		do {
			System.out.println("���ڸ� �Է��ϼ��� :");
			//num = System.in.read()-'0';// read()�޼ҵ�� ���Ͻ� "\n"���� ���
			//System.in.read(); //CR
			//System.in.read(); //LF		3���� �ϳ��� ��Ʈ�� ǥ��!
			//next() �޼ҵ�� Ű����� �Է��� StringŸ���� ���ڰ�+"\n"�� �о����
			//next() �޼ҵ�� ���Ͻ� "\n"���ڴ� �����ϰ� �Է��� ���ڰ��� ���
			num = (int)scanner.next().charAt(0)-'0'; //char->intŸ������ �ڵ�����ȯ
			System.out.println("num ="+num);
			if(num>=2 && num<=9) {
				while(i<=9) {
					System.out.println(num+"x"+i+"="+num*i);
					i++;
				}
			}
			i = 1;
		}while(num!=49); //�Է� ���� ���� 'a'�̸� ����
		System.out.println("���α׷� ����");
	}
}
