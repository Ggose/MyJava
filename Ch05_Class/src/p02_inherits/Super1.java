package p02_inherits;

public class Super1 {
/*
 * Ŭ��������(Ŭ������.java)���� publicŬ������ �ϳ� �� ����
 * , public �ƴ� Ŭ������ ������ ����
 * ��� -
 * 	�θ�� �ڽ��� ���� �����̸� �ڽ��� ������ �����(�θ��� ���� ������)
 * 	�ڽĿ��� ������ �θ��� ������ ����Ϸ��� super.������
 * 	�ڽ��� ���������� this.�� ������.
 * 	�ڽ�Ŭ�������� �θ��� Ŭ������ �������ϴ°��� override�����
 * override�� �޼ҵ�� override�� �ä����� �����
 */
	public static void main(String[] args) {
		
		B2 b= new B2();
		b.print();
		b.display();
		System.out.println(b.a);
		System.out.println(b.b);
		b.print();
	}//superŬ������ ��
}
	class B1{
		//�ʵ�(�Ӽ�)
		int a = 7;//B1�� a
		int b= 7;
		//�޼ҵ�
		void display() {
			System.out.println("B1�� �޼ҵ�");
		}
		void print() {System.out.println("�θ��� �޼ҵ�");}
		
	}//B1Ŭ���� ��
	//�θ�Ŭ������ B1Ŭ������ ��ӹ޾Ƽ� B2Ŭ������ ����
	//�ڽ�Ŭ����(B2) extends �θ�Ŭ����(B)1
	class B2 extends B1{
		int a= 10;//B2�� a //�ڽ� Ŭ�������� �ʵ带 �������ϸ� �θ��ʵ��� ���� ������.
	
		void print() {	//�޼ҵ� ������(override)
			super.print();// �θ�޼ҵ��� print()�޼ҵ带 ���
			System.out.println("-----------------------");
			System.out.println("�ڽ� �޼ҵ� , a = "+a); //�ڽ��� �ʵ尪 ���
			System.out.println("�θ��� �ʵ� a�� �� ="+super.a); //�θ��� �ʵ尪 ���
			System.out.println("b�� �� ="+b); //�θ��� �� ���
		}
	}

