package p03.methods;

/*
 * �����޼ҵ�
 * 	-Ŭ������ Ŭ�����δ��� ���� �޸𸮿� ����ɶ�
 * Ŭ���������� �ľ��ϰ� staticŰ���� �ִ� �ʵ峪 �޼ҵ��
 * ���� ��� static(����)�������� �ε���.
 * -�ν��Ͻ� �ʵ� , �޼ҵ�� Ŭ�������� �״�� ��.
 * =>static��� Ŭ����.����� ȣ��
 * =>instance����� ��ü�� ���� �� ���ٰ���
 */
public class Calculator4 {

	String color; //�ν��Ͻ� �ʵ�
	
	void setColor(String color) {	//�ν��Ͻ� �޼ҵ�
		this.color =color;
	}
	static int plus(int x,int y) {
		return x+y;
	}
	static int minus(int x, int y) {
		return x-y;
	}
}
