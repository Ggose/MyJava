package p08.abstracts;

/*
 * 추상클래스
 * -실체가 없는 클래스
 * -메소드들은 선언부만 존재하고, 실행부는 없는 추상 메소드가 존재
 * -추상클래스는 자신을 new 생성자()로 하여 객체를 생성할수 없음
 *  ->상속을 받은 자식의 클래스로 객체를 생성할수 있음.
 * -추상메소드 상속받은 자식클래스에서 반드시 재정의 해야함.
 */
public abstract class Animal {

	// 메소드 선언
	public abstract void sing(); // 운다기능은 이 메소드를 사용

	public abstract void fly(); // 난다기능은 이 메소드를 사용

	public abstract void eat(); // 먹다라는기능은 이 메소드를 사용
}
