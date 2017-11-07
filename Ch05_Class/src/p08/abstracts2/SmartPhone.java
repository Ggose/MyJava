package p08.abstracts2;

public class SmartPhone extends Phone {

	//추상클래스도 클래스이므로
	//반드시 생성자가 있어야함
	//기본 생성자가 없으면 컴파일시 추가됨
	//생성된 자식의 생성자에서 부모 생성자
	//호출은 super() 메소드를 이용하여 호출
	public SmartPhone(String owner) {
		super(owner); //super()메소드는 반드시 첫줄에 작성
		// TODO Auto-generated constructor stub
	}
	//메소드
	//클래스의 상속처럼
	//자시클래스에서 필요한 메소드 추가 기능
	//Phone p = new SmartPhone();//프로모션
	//internetSearch() 사용불가
	public void internetSearch() {
		System.out.println("인터넷 서핑...");
	}

	
}
