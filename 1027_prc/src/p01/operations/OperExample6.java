package p01.operations;

import java.util.Scanner;

/*
 * ���׿�����
 *  ���ǽ� ? �� : ��¢
 *  			���ǽ� ? �� : ��¢	
 *  						���ǽ� ? �� : ��¢
 *  									���ǽ�? �� : ��¢
 */
public class OperExample6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean isContinue = true; //ó���� true�� ���� �׷��� while������ �۵��ȴ�
		while(isContinue) {		//booleanŸ���� ���� ���(�ݺ���)�� ��� ���
		System.out.println("������ �Է��ϼ��� :");
		//next() Ű����� �Էµ� ���ڿ� ���� ���ڿ��� �����ϴ� �޼ҵ�
		//Integer.parsInt(scanner.next()); �̷������� �ص� �ȴ�.
		int score = scanner.nextInt();	
		char grade = ' '; //charŸ���� �ʱ�ȭ�� ���ڴ�  ' ' �������� �ʱ�ȭ �ؾ��Ѵ�.
		
		grade = score >90 ? 'A':(score>80 ?'B':score>70?'C':'F');
		System.out.println("���"+grade);
		
		System.out.println("����Ͻðڽ��ϴ� ? ");
		//charAt(index) �޼ҵ�� ���ڿ����� �ش� index������ �����ϳ��� �����ϴ� �޼ҵ�
		char yesNo = scanner.next().charAt(0);
		
		
		isContinue= (yesNo == 'y'||yesNo == 'Y')?true:false;		
		
		}
		System.out.println("����");
	}
}
