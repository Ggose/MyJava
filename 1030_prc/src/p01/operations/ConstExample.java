package p01.operations;

/*
 * ������ ���
 * -������ �޸� ������ ���� ��� �ٲ�� �ִ� �Ӽ�,
 * 	����� �޸� ������ �� �ѹ� �ʱ�ȭ ���� ��� �ٲ��� �ʴ� �Ӽ�
 * 		final ��� ������ = ��;	//���� ��������� ��������� �պκп� final�� �����ϸ� ����� �����ȴ�.
 * 
 *	-����� ������ �����ϱ� ���� �ַ� �빮�ڷ� ǥ����.
 *	-final�̶�� Ű����� ���̻� �ٲܼ� ���� �ǹ�.
 */

public class ConstExample {

	public static void main(String[] args) {
		int result = 0; //intŸ���� ���� ������ ��(�޸𸮰���) 0 ������
		result+=5;//result��� ����(�޸𸮰���)�� ���� 0->5�� �ٲ�
		
		System.out.println("result"+result);
		
		final double PI = 3.14d; //����Ÿ���� ���ͷ� 3.14�� PI��� ����� ����
		//pi+=5; /����� �ѹ� �ʱ�ȭ �ϸ� ���̻� ���� �ٲܼ� ���� ����
		
		System.out.println("PI"+PI);
	}
	
}
