package p03.methods;

/*
 * 자바 상수 => final
 */
public class FinalExample {
	public static void main(String[] args) {

		F1 f1 = new F1(); // instance생성
		f1.a1 = 15;	//a1은 변수성격을 가진 필드이므로 15로 변경이 가능
		//f1.A2 = 15;	//A2는 상수의 성격을 가진 필드이기 때문에 변경할수 없다
	}
}
class F1 {
	//필드
	int a1 = 7; //변수의 성격을 가진 필드 소문자 표시
	final int A2 = 10; //상수의 성격 가진 필드 대문자 표시
}
