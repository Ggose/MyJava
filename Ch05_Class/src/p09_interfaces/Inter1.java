package p09_interfaces;

public interface Inter1 {

	int a = 3; //public static final이 생략나으
	void display(); //public 새얅
	public void print();
}
class D1 implements Inter1{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("구현체 D1");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("구현체 d1의 print");
	}
	
}

class D2 extends D1{

	@Override
	public void display() {	//인터페이스를 구현한 구현체도 상속후 메소드 재정의 가능
		System.out.println("D1을 상속 받은 D2");
		
	}

	@Override
	public void print() {
	
		System.out.println("D1dmf tkdthrqkedmsD2");
	}
	
}