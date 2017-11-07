package p01.operations;

import java.util.Scanner; //ScannerŬ���� java.util��Ű���� ����

public class ConstExample2 {
	public static void main(String[] args) {
		// ���ǳ��� ���ϱ�
		// ���� ���� ������*������*PI

		final double PI = 3.14D;
		Scanner scanner = new Scanner(System.in);
		// �ַܼκ��� �Է¹ޱ� ���� ��ü ����
		try {
			while (true) {

				System.out.println("���ϴ� ���� �������� �Է��ϼ��� :");

				int r = scanner.nextInt();
				System.out.println("���� ���̴� :" + r * r * PI);
				System.out.println("����Ͻðڽ��ϱ�?");

				String yessNo = scanner.next(); // String���� �Էµ� ���� String ���� ��ȯ

				if (!(yessNo.charAt(0) == 'y' || yessNo.charAt(0) == 'Y'))
					break; // �ݺ����� ���������� ��ɹ�

				else
					continue; // �������
			}
			System.out.println("����");
			//�ڹٿ����� ����(Exception)�� ��ü
		} catch (java.util.InputMismatchException e) {
			System.out.println("�����߻� " + e.getMessage());
		} // try{������ ��ɾ� } catch(�߻��� ����){���ܼ� ó���� }
			// �ڹٿ��� ���ܴ� �ΰ���
			//-1.checked Exception : �������� ������ �����Ͻ� üũ
			//-2.unChecked Exception(RuntimeException) : ������ ������ ���� ���α׷� ����� 
														//�Է����� �̷ư� ����,���� ���������� �߻��ϴ� ����
	}
}