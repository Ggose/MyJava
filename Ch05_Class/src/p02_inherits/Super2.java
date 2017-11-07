package p02_inherits;
/*
 * ��۹��� �ڽ��� Ŭ�������� �⺻�����ڰ� �ƴ� �ٸ� �����ڸ� �̿��Ͽ� 
 * �ڽ��� �����Ϸ��Ҷ�
 * super(�Ű�����) �����ڸ� �̿��Ͽ� �����.
 */
public class Super2 {

	public static void main(String[] args) {
		//������ �θ� ������ ���� ���� �� �ڽ� ������ �����
		C2 c = new C2(); //C2 ��ü ����
		c.c2();
		c.c1();
	}
}

class C1{
	//C1(){} �� ��� super�� ����� Error�� ����
	//�Ű������� �ϳ��� ������
	C1(String str){
		System.out.println("�θ������ �Ű����� 1�� :"+str);
	}
	//�޼ҵ�
	void c1() {
		System.out.println("�����");
	}
}
class C2 extends C1{
	//������
	C2(){
		//super() : �θ������ ȣǮ �޼ҵ�� �׻� �ڽĻ�������
		//			�����{}�� ù�ٿ� ����ؾ���.
		super("�θ������ ȣ��");	//new C1("�θ������ȣ��"){}
		System.out.println("�Ű������� ���� �ڽ� ������");
	}
	//�޼ҵ�
	void c2() {
		System.out.println("�ڽĸ޼ҵ�");
	}
}