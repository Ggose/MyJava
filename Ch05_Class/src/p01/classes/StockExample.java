package p01.classes;

import java.util.Scanner;

public class StockExample {

	public static void main(String[] args) {
		
		Stock stck;
		stck = new Stock();
		
		Scanner scanner = new Scanner(System.in);
		
		stck.setName("ȫ�浿");
		stck.setQty(5);
		
		System.out.println("�̸� :"+stck.getName()+" "+"���� :"+stck.getQty());

		System.out.println("�԰� ���� �Է�");
		int x = scanner.nextInt();
		
		stck.addQty(x);
		System.out.println("�԰�� ���� :"+stck.getQty());
		
		System.out.println("��� ���� : ");
		int y = scanner.nextInt();
		stck.pushQty(y);
		System.out.println("��� �� ���� :"+stck.getQty());
	}
}
