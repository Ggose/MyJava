package p01.tryCatchfinally;

public class GoodsExample {

	public static void main(String[] args) {
		try {
		//객체생성
		Goods goods = new Goods("새우깡", 1000);
		
		System.out.println(goods.getGoodsName()+"의 현재 가격은 "+goods.getPrice()+"원 입니다.");
		
		//가격인상
		
		goods.upPrice(200);
		System.out.println(goods.getGoodsName()+"의 현재 가격은 "+goods.getPrice()+"원 입니다.");
		goods.upPrice(300);	//LIMIT보다 큰 가격 예외발생함
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
