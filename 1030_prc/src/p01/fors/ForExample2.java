package p01.fors;

import java.util.Scanner;

public class ForExample2 {

	public static void main(String[] args) {
		int num= 0;
		int vertical = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("����� �������� �� ���� �Է��ϼ��� :");		
		num = keyboard.nextInt();
		System.out.println("����� ����(���� :1,����:2)�� �Է��ϼ���");

		vertical = keyboard.nextInt();
		if(vertical==1)//����
		if(num>=2&&num<=9)
			for(int i=1;i<=9;i++)
			System.out.print(num+"x"+i+"="+num*i+"\t");//tab��ŭ �������
		if(vertical==2)//����
			for(int i=1;i<=9;i++)
				System.out.println(num+"x"+i+"="+num*i+"\t");//tab��ŭ �������
			
	}
}
