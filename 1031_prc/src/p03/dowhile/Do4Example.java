package p03.dowhile;

import java.util.Scanner;

/*
 * do~while()��
 * ���ð��� - �ݺ�Ƚ���� ���ؼ� (5ȸ) �ݺ�Ƚ����
 * 			5ȸ�̻��̸� ����p/g���� �����ϼ��� .
 * 			��� if() break;
 */
public class Do4Example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0,num;
		int answer = (int)(Math.random()*100)+1;
		
		do {
			System.out.println("1~100������ �� �� ����� �ϱ��?");
			num = sc.nextInt();
			if(answer==num) {
			System.out.println(cnt+"ȸ ���� ���� !");
			break;
			}else if(answer>num) {
				System.out.println("�� ū���� �Է��ϼ���");
			}else
				System.out.println("�� ���� ���� �Է��ϼ���");
			cnt++;//Ƚ�� ����
		}while(true); //������ true�̹Ƿ� ���ѹݺ�
		sc.close(); //scanner ��ü �ڿ� ����
		
	}
}
