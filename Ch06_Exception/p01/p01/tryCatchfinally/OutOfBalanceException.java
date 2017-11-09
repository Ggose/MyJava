package p01.tryCatchfinally;

public class OutOfBalanceException extends Exception{

	int outQnt;
	public OutOfBalanceException(int outQnt) {
		this.outQnt = outQnt;
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "초과했어 수량은"+outQnt;
	}

}
