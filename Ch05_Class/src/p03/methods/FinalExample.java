package p03.methods;

/*
 * �ڹ� ��� => final
 */
public class FinalExample {
	public static void main(String[] args) {

		F1 f1 = new F1(); // instance����
		f1.a1 = 15;	//a1�� ���������� ���� �ʵ��̹Ƿ� 15�� ������ ����
		//f1.A2 = 15;	//A2�� ����� ������ ���� �ʵ��̱� ������ �����Ҽ� ����
	}
}
class F1 {
	//�ʵ�
	int a1 = 7; //������ ������ ���� �ʵ� �ҹ��� ǥ��
	final int A2 = 10; //����� ���� ���� �ʵ� �빮�� ǥ��
}
