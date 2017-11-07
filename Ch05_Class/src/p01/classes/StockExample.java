package p01.classes;

import java.util.Scanner;

public class StockExample {

	public static void main(String[] args) {
		
		Stock stck;
		stck = new Stock();
		
		Scanner scanner = new Scanner(System.in);
		
		stck.setName("홍길동");
		stck.setQty(5);
		
		System.out.println("이름 :"+stck.getName()+" "+"수량 :"+stck.getQty());

		System.out.println("입고 수량 입력");
		int x = scanner.nextInt();
		
		stck.addQty(x);
		System.out.println("입고된 수량 :"+stck.getQty());
		
		System.out.println("출고 수량 : ");
		int y = scanner.nextInt();
		stck.pushQty(y);
		System.out.println("출고 된 수량 :"+stck.getQty());
	}
}
