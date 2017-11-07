package p01_ifs;

import java.util.Scanner;

/*
 * if-else if-else : �� ���ϳ����� ��찡 �ƴ� �ټ��� ��찡 �߻��ϴ� ���
 */
public class If3Example {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		String grade = ""; // ���
		try {
			while (true) {
				System.out.println("������ �Է��ϼ��� :");
				int score = keyboard.nextInt(); // StringŸ������ �Էµ� ���������ڿ��� ���ڷ� ��ȯ
				if (score >= 90) {
					grade = "A";
				} // 90�̻��̸� ����
				else if (score >= 80) {
					grade = "B";
				} // ���� if()���� ������ 90�̸� 80�̻�{}����
				else if (score >= 70) {
					grade = "C";
				} // ���� else if()���� ������ (80�̸�70�̻�){����}
				else if (score >= 60) {
					grade = "D";
				} // �ٷ��� else if()�� ������ (70�̸�60�̻�){}����
				else
					grade = "F";// �� �ܴ� {}����

				System.out.println("�Է��� ������" + grade + "����Դϴ�.");

				System.out.println("����Ͻðڽ��ϰ�?");
				String yessNo = keyboard.next();
				if (!(yessNo.charAt(0) == 'y' || yessNo.charAt(0) == 'Y')) {
					break;
				}
			}
		} catch (java.util.InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}
}
