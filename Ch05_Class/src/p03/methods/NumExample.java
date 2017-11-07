package p03.methods;

public class NumExample {
	public static void main(String[] args) {

		C1 c1 = new C1(); c1.print();
		C1 c2 = new C1(); c2.print();
		C1 c3 = new C1(); c3.print();
	}
}

class C1 {
	// 필드
	int num1;// 인스턴스필드
	static int num2; // static 필드
	// 생성자

	C1() {
		num1++; // 인스턴스변수 증가
		num2++; // static 변수 증가
	}

	// 메소드
	void print() {
		System.out.println("num1 = " + num1 + " ,num2 = " + num2);
	}

}
