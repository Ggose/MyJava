package p01.tryCatchfinally;

public class Stock {

	private String goodsName;
	private String company;
	private int qty;
	public Stock(String goodsName, String company, int qty) {
		super();
		this.goodsName = goodsName;
		this.company = company;
		this.qty = qty;
	}
	
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	//입고처리 메소드
	void inStock(int qty) { //매개변수 : 원하는 수량을 메소드에 넘겨주는 역할  
		this.qty+=qty; //기존필드에 매개변수로 넘어온 값을 누적
	}
	//출고 처리 메소드
	//메소드 앞에 타입(int,byte,long,boolean,객체)이 있으면 실행부{}안에 return문이 필요하다.
	int outStock(int qty) throws Exception  { //매개변수 - 원하는 수량을 메소드에 넘기는 역할
		if(this.qty < qty) //처리
			throw new OutOfBalanceException(qty);
		this.qty -=qty; //필드의 역할(현재상태저장) : 현재고수량에서 원하는 양(qty)를 빼주는것
		return qty;
	}
	
}
