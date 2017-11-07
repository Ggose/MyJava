package p01.classes;

public class Stock {

	private String goodsName;
	private int qty;

	Stock() {
	}

	Stock(String goodsName, int qty) {
		this.goodsName = goodsName;
		this.qty = qty;
	}

	public void setName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getName() {
		return goodsName;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getQty() {
		return qty;
	}

	public void addQty(int amount) { // 입고
		this.qty += amount;
	}

	public int pushQty(int amount) { // 출고
		if (this.qty - amount < 0) {
			return 0;
		}
		else {
			this.qty-=amount;
			return amount;
		}
		
	}

}
