package p02.enums;

import java.util.Scanner;

public class EnumMethodExample2 {

	public static void main(String[] args) {
		
		Gender gender = null;
		System.out.println("�������� ��������???");
		System.out.println("MALE Ȥ�� FEMALE �θ� ������ּ���");
		Scanner scanner = new Scanner(System.in);
		//�����̸� "���� �Դϴ�."
		//�����̸� "���� �Դϴ�."
		
		gender = Gender.valueOf(scanner.next());
		//������.valueOf(���ڿ�) => �Է��� ���ڿ���
		//���Ż���� ��ȯ�ϴ� �޼ҵ�
		
			if(gender == Gender.MALE) {
				System.out.println("���� �Դϴ�.");
			}
			
			else {
				System.out.println("���� �Դϴ�.");
			}
		
		
	}
}
