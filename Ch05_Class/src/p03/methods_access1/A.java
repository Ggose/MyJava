package p03.methods_access1;

public class A {

	//�ʵ�
	public int field1;
	int field2; //default
	private int field3;
	
	//������
	public A() { //���� Ŭ������������ �������Ѱ� ������� ���ٰ���
		field1 =1;
		field2 =1;
		field3 =1;
	}
	//�޼ҵ�
	public void method1() {}
	void method2() {}
	private void method3(){}
}
