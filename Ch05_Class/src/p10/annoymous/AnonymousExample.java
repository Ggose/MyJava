package p10.annoymous;

public class AnonymousExample {
	public static void main(String[] args) {
		//객체생성
		Aonymous2 anony = new Aonymous2();
	/*   //익명객체 필드 사용
	 anony.field
	 //익명 객체 로컬변수 사용
	 anony.method1();*/
	 //익명 객체 매개값 사용
	 //①  인터페이스 구현체 만들기 구현체 implements 인터페이스
	 //②  구현체의 메소드 재정의 
	 //③  인터페이스 타입으로 선언하고 구현체를 생성하여 대입 rc = new SmartControl();
	 //④  rc는 인터페이스타입으로 Promotion(자동형변환)
	 //⑤  method2()의 매개변수로 넘김.
	 RemoteControl rc =  new SmartControl();
	   anony.method2(rc);
	 RemoteControl rc2 = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("SmartTv를 켭니다");
		}
		@Override
		public void turnOff() {
			System.out.println("SmartTv를 끕니다.");	
		}
	};//끝
	anony.method2(rc2);
	anony.method2(new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("SmartTv를 켭니다");
		}
		@Override
		public void turnOff() {
			System.out.println("SmartTv를 끕니다.");	
		}
	});
	   
	
	}
}
