package p03.methods;

public class Car2 {
	//정적필드
	static int field1;
	static void method1() {
		System.out.println("정적 메소드");
	}
	//인스턴스필드
	int field2;
	void method2() {
		System.out.println("인스턴스 메소드");
	}
	//인스턴스 초기화 블럭
	{
		field1=10;
		field2 = 10;
		method1();
		method2();
	}
	//static 초기화 블럭
	static {
		field1 = 10;
		//field2 = 10; //instance필드는 static초기화 블럭에 올수 없다
		method1();
		//method2(); //instance 메소드도 static 초기화 블럭에 올수 없다.
	}
}
