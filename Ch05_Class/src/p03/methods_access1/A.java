package p03.methods_access1;

public class A {

	//필드
	public int field1;
	int field2; //default
	private int field3;
	
	//생성자
	public A() { //동일 클래스내에서는 접근제한과 상관없이 접근가능
		field1 =1;
		field2 =1;
		field3 =1;
	}
	//메소드
	public void method1() {}
	void method2() {}
	private void method3(){}
}
