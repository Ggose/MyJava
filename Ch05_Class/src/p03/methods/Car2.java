package p03.methods;

public class Car2 {
	//�����ʵ�
	static int field1;
	static void method1() {
		System.out.println("���� �޼ҵ�");
	}
	//�ν��Ͻ��ʵ�
	int field2;
	void method2() {
		System.out.println("�ν��Ͻ� �޼ҵ�");
	}
	//�ν��Ͻ� �ʱ�ȭ ��
	{
		field1=10;
		field2 = 10;
		method1();
		method2();
	}
	//static �ʱ�ȭ ��
	static {
		field1 = 10;
		//field2 = 10; //instance�ʵ�� static�ʱ�ȭ ���� �ü� ����
		method1();
		//method2(); //instance �޼ҵ嵵 static �ʱ�ȭ ���� �ü� ����.
	}
}
