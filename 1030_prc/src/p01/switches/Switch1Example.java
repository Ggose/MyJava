package p01.switches;

import java.util.Scanner;

public class Switch1Example {
/*
 * ���ǹ� -Swtich��
 * 	switch(����) - ���ǿ� ���� �̸� ������ �۾��� �б��س��� ���
 */
	public static void main(String[] args) {
		
		int score = 0;
		
		String grade = "";
		boolean isContinue = true;
		//case�� ���� �б�
		//98->98/10 => 9.8 (int)Ÿ���̹Ƿ� 9�� ��,
		while(isContinue) {
		Scanner keyborder = new Scanner(System.in);
		score = keyborder.nextInt();
		switch(score/10) {
		case 10://break���� ������ �Ʒ� case������ �����
		case 9: grade = "A";break;//break���� �־ �ش� case���� �����ϰ� swtich()���� ���
		case 8: grade = "B";break;//break���� �־ �ش� case���� �����ϰ� swtich()���� ���
		case 7: grade = "C";break;//break���� �־ �ش� case���� �����ϰ� swtich()���� ���
		case 6: grade = "D";break;//break���� �־ �ش� case���� �����ϰ� swtich()���� ���
		default: grade = "F";
		}
		
		if(score >= 60&& score<100) {
			if(score%10>7)grade+="+";
			else if(score%10<4)grade+="-";
			else grade +="0";
		}
		System.out.println("�����"+grade);
		System.out.println("����ұ�� ?");
		//charŸ���� ���� 'y'�� �񱳿�����(==)�� ��
		if(keyborder.next().equalsIgnoreCase("y")) //���ڿ��� ����
			//equalsIgnoreCase("���ڿ�") -���ڿ� �� �żҵ�
			isContinue = true;
		else
			isContinue=false;
		}
		System.out.println("����");
	}
}
