package p01.operations;

import java.util.Scanner;

public class OperExample2 {

	public static void main(String[] args) {
		//�ַܼκ��� ���� �Է¹ޱ� ���� ��ü(instance)����
		
		Scanner scanner = new Scanner(System.in);	//System.in�Է� ��Ʈ��
		
		System.out.println("x���� �Է��ϼ���");
		int x = scanner.nextInt();	//�Է¹��� ���ڿ�Ÿ���� ���� intŸ������ ��ȯ�ؼ� ���
		
		System.out.println("y���� �Է��ϼ���");
		int y = Integer.parseInt(scanner.next());	//scanner.next()�� �Է¹��� ���ڿ��� ���ڿ��� ���
													//�Է¹��� ���ڿ��� Integer.parseInt()�� ����� ���ڷ� ���.
		//�Է¹��� ������ ��Ģ����
		//"���ڿ�"+(���ڿ��� �ƴ� ���� ����� , ���ڿ��� �ƴѰ�) �� ����� "���ڿ�"
		//"x*y ="+x*y => "x*y="+x=>"x*y=x"+y=>"x*y=xy"
		//()�������� �켱������ ���� ����. "���ڿ�"+(x*y) => "���ڿ�"+x*y�� �����
		//"���ڿ�+x*y�� �����"
		
		System.out.println(2);		////intŸ���� ���ͷ��� ���ڿ�"2" �ٲ� println()�޼ҵ��� �Ű������� ����
		System.out.println("x*y ="+(x*y));	
		System.out.println("x/y ="+(x/y));
		System.out.println("x+y ="+(x+y));
		System.out.println("x-y ="+(x-y));
		
	}
}
