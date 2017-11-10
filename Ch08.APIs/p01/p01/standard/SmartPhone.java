package p01.standard;

public class SmartPhone {

	private String company;
	private String os;
	public SmartPhone(String company, String os) {
		super();
		this.company = company;
		this.os = os;
	}
	
	//Object 클래스의 toString()메소드 재정의
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "제조사는 "+company+"os는 :"+os;
	}
	
	
}
