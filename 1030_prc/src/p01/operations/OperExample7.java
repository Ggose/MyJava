package p01.operations;

public class OperExample7 extends Object{
	//������(default ������)
	//java�� �ݵ�� �����ڰ� �־�� ��ü�� �����Ҽ� �ִ�.
	//��� Ŭ������ �����ڰ� �����ϴµ�
	//�����ڰ� �����ڸ� ǥ������ ������ �����Ϸ��� �����Ͻ� �Ű������� ����,���� ���뵵 ����
	//default �����ڸ� �߰��Ͽ� �������Ѵ�.
	OperExample7(){}

	public static void main(String[] args) {
	
		//�ݺ���
		int sum=0;	//���ú��� ���� �� �ʱ�ȭ
		int temp=0;
		for(int i=0;i<10;i++) {
			//sum������ ���� i�� ���� ���� ������� �ٽ� sum�� �����ϴ� ���Թ�
			//sum+=i;	//�ѹ��� �ݺ��ϸ鼭 �հ�(sum)�� ���� �߰��ϴ� ��ɹ�
			temp=sum+i;//sum�� ���� i�� ���� ���� ����� temp�� ����(���Թ�)
			sum = temp;//������ temp�� ���� �ٽ� sum�� ����(���Թ�)
		}
		System.out.println("�հ�"+sum);
		for(int i =1; i<=10;i++) {
			sum+=i;//sum�� ���� i�� ���� ���� ����� �ٽ� sum�� �����ϴ� ���մ��Թ�
		}
	}


}
