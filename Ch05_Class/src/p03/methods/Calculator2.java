package p03.methods;
/*
 * ���� Ŭ�������� �޼ҵ� ȣ��
 * -�ܺΰ�ü���� �żҵ�ȣ��� ��������.�޼ҵ��()�����ʰ�.
 * �޼ҵ��()���� ȣ�� ,������� ����Ҽ��� ����
 */
public class Calculator2 {

	//intŸ��
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	//dobuleŸ��
	double avg(int x, int y) {
		double sum = plus(x,y); //����Ŭ�������� plus()�޼ҵ� ȣ��
		double result = sum/2;
		return result;
	}
	//voidŸ��
	void execute() {
		double result = avg(7,10);//����Ŭ�������� avg()�޼ҵ� ȣ��
		println("������ :"+result); //����Ŭ�������� println()�޼ҵ� ȣ��
	}
	//voidŸ�� 
	void println(String message) {
	System.out.println(message);	
	}
}
