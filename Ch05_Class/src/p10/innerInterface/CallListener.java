package p10.innerInterface;
/**
 * 중첩인터페이스로 구현된 클래스
 *  클래스 implements 바깥클래스.인터페이스명{ }
 * */
public class CallListener implements Button.OnClickListener {
	@Override
	public void onClick() {
			System.out.println("전화를 겁니다");
	}
}
