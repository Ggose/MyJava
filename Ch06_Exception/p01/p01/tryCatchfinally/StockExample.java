package p01.tryCatchfinally;

public class StockExample {

	public static void main(String[] args) {
		// 객체 생성
		Stock stock = new Stock("새우깡", "농심", 50);

		System.out.println(stock.getGoodsName() + "의 현 재고는 =" + stock.getQty());

		// 입고처리
		stock.inStock(20); // inStock()메소드 호출(실제값);
		System.out.println(stock.getGoodsName() + "의 현 재고는 =" + stock.getQty());

		// 출고처리
		try {
			
			stock.outStock(80);
			System.out.println("출고 수량 후:" + stock.getQty());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("수고했쪙");
			}

	}
}
