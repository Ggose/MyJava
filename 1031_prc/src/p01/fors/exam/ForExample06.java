package p01.fors.exam;

import java.util.Scanner;

public class ForExample06 {
	public static void main(String[] args) {
		// ���� �Է¹޾Ƽ� 2�ܺ��� �Է¹��� �ܼ����� ������ �������

		Scanner scanner = new Scanner(System.in);

		int result = 0;
		
		while (true) {
			System.out.println("�� �Է�:");
			int num = scanner.nextInt();
			for (int i = 2; i <= num; i++) {
				for (int j = 1; j <= 9; j++) {
					result = i * j;
					System.out.println(i + "*" + j + "=" + result+"\t");

				}
				System.out.println();
			}
			System.out.println("����Ͻðڽ��ϱ�?");
			char c = scanner.next().charAt(0);
			if (!(c == 'y' || c == 'Y'))
				break;

		}

		System.out.println("����");
	}

}
