package p03.methods;

/*
 * 정적메소드
 * 	-클래스가 클래스로더에 의해 메모리에 정재될때
 * 클래스내용을 파악하고 static키워드 있는 필드나 메소드는
 * 따로 떼어서 static(정적)영역으로 로드함.
 * -인스턴스 필드 , 메소드는 클래스내에 그대로 둠.
 * =>static멤버 클래스.멤버로 호출
 * =>instance멤버는 객체를 생성 후 접근가능
 */
public class Calculator4 {

	String color; //인스턴스 필드
	
	void setColor(String color) {	//인스턴스 메소드
		this.color =color;
	}
	static int plus(int x,int y) {
		return x+y;
	}
	static int minus(int x, int y) {
		return x-y;
	}
}
