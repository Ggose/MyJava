package p09_interfaces;

/*
 * 인터페이스의 다중 상속
 * -부모인터페이스가 2개 이상인 인터페이스
 * -두 부모의 추상메소드를 모두 물려받는다.
 * 
 */
public interface F1 {
	void aa(); // 추상메소드
}

interface F2 {
	void bb();
}

// 인터페이스의 다중상속
interface F3 extends F1, F2 {
	// aa();
	// bb();
	void cc(); // 추가
}

// 다중상속이든 단일상속이드 상속을 받게 되면 다 받을수 있다.
// 다중삭속 받은 인터페이스의 구현체도 메소드 구현. 다중상속,다중 인터페이스도 가능하다.
//인터페이스는 메소드리스트이기 때문에 메소드를 가지고 있는 인터페이스를 메소드 만큼 구현을 해주면됨
class F4 implements F3 {

	@Override
	public void bb() {
		System.out.println("bb 메소드");
		// TODO Auto-generated method stub

	}

	@Override
	public void aa() {
		System.out.println("aa 메소드");
		// TODO Auto-generated method stub

	}

	@Override
	public void cc() {
		System.out.println("cc 메소드");
		// TODO Auto-generated method stub

	}

}
//두개 이상의 인터페이스로 부터 구현한 구현체를 만들수 있음.
class F5 implements F1,F2{

	@Override
	public void bb() {
		// TODO Auto-generated method stub
		System.out.println("F5 bb메소드 ");
	}

	@Override
	public void aa() {
		// TODO Auto-generated method stub
		System.out.println("F5 aa메소드 ");

		
	}
	
}
