package p01.tryCatchfinally;

public class LimitOutException extends Exception{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "가격 변동제한 폭을 벗어났습니다.";
	}

}
