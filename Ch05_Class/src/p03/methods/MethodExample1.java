package p03.methods;
/*
 * ...
 * �Ű������� ...�� ����ϸ�
 * �������� ������ �����͸� �Ű������� �ޱ����ؼ���
 * �迭�� �����ϴ� ������ �־�� �ϴµ�,
 * ...�� ����ϸ� �迭�� ������ �ʰ� ����ÿ�
 * ���� ������ �Է��Ͽ� ����� ���Ϲ��� �� ����.
 */
public class MethodExample1 {

	public static void main(String[] args) {
		
		Computer com = new Computer(); //instance����
		int [] intArr = new int[5]; //5���� intŸ���� ���� ����
		for(int i=0;i<intArr.length;i++)
			intArr[i]=++i;
		int sum= 0;
		sum = com.sum1(intArr); //ȣ��
		System.out.println("��� : "+sum);
		
		int result = com.sum2(1,2,3,5,4,8);
		System.out.println("��� :"+result);
	}
}
class Computer{
	//�޼ҵ� - ����Ÿ�� �޼ҵ��(�Ű�����){�����;���Ϲ�}
	int sum1(int []values) {	//�迭��ü�� �Ű������� �Ѿ��
		int sum = 0;
		for(int i = 0; i<values.length;i++)
			sum+=values[i];
		return sum;
		}
		//������Ÿ���� ���� �Ű������� ������
		//���� ������ ���������� ���� ���?
		//�Ű������� ������ ���������������Ƿ� ȣ��ÿ�
		//�Ű������� ������ŭ�� �迭�� ������
	int sum2(int ... values) {	//�迭��ü�� �Ű������� �Ѿ��
		int sum = 0;
		for(int i = 0; i<values.length;i++)
			sum+=values[i];
		return sum;
		}
	}

