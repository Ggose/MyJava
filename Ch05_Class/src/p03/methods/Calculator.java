package p03.methods;

/*
 * �޼ҵ� ����
 * 	����Ÿ�� �޼ҵ��(�Ű�����){�����; return��;}
 * 	-����Ÿ���� ���� �żҵ�
 * 		:void �޼ҵ��(�Ű�����){�����;}
 */
public class Calculator {

	//�޼ҵ�
	void powerOn() {
		System.out.println("������ �մϴ�");
	}
	//���� Ÿ���� int�̹Ƿ� �����{}���� ���Ϲ�;�� ����
	int plus(int x,int y) {
		int result = x+y;
		return result;
	}
	//���� Ÿ���� double�̹Ƿ� �����{}���� ���Ϲ��� ����.
	double devide(int x, int y) {
		double result = (double)x/(double)y;
		return result;
	}
	//����Ÿ���� �����Ƿ� ����� {}���� ���Ϲ��� ����.
	void powerOff() {
		System.out.println("������ ���ϴ�");
	}
	
}
