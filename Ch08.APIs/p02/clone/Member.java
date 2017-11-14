package clone;

import java.util.Arrays;

/*
 * 객체의 복제는 Cloneable인터페이스로 구현된 객체만 복제가 가능하다.
 */
public class Member implements Cloneable/*extends Object*/{

	//필드
	public String name; //String타입 필드
	public int age;		//기본타입 필드
	public int [] scores;//배열타입 필드
	public Car car;//개체타입 필드

	//생성자 -필드의 초기화
	public Member(String name, int age, int[] scores, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	//메소드
	@Override
	protected Object clone() throws CloneNotSupportedException {
	//얕은 복사
		// 기본테ㅣ터 타입은 실제 값이 복사
		// 참조테이터 타입은 객체의주소값이 복제(원본과 복하본이 같은  객체를 공유하게됨
		// 복사본의 객체를 수정하면 원본의 객체도 수정되어야 복제가 무의미 되어짐
		//그래서,객체가 멤버인 경우 객체껍데기를 새로 만ㄷ르어서 내용을 다시 복제는깊은 복제 작업을 해주어야 서로 다른 객체가 됨
		
		
		Member cloned = (Member)super.clone(); //clone()메소드 리턴값은 Object이므로 Member타입으로 Casting하여 대입.
	//scores 복제
	//copyOf(소스,복사할 길이) : 값을 복제하여 넘김
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
	// car복제
	//새로운 객체를 생성하여 생성자의 매개변수로 값을 넘김
		cloned.car = new Car(this.car.model);
		//깊은 복제된 Member객체를 리턴
		return cloned;
	}
	public Member getMember() {
		Member cloned = null;
		try {
			cloned =(Member)clone(); //getMember()메소드에서clone()메소드 호출
		}catch(CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}
		return cloned;
	}
	
		
}
