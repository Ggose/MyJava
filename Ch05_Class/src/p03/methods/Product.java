package p03.methods;

public class Product {

	//�ʵ�
	//static �ʵ�� �ַ� �������� ���Ǵ� ��� ����
	static int count = 0; //static�ʵ� (����)
	int seriaNo;	//instance�ʵ� 
	//�ʱ�ȭ ��
	{
		
		++count;	//count�� 1���� ��
		seriaNo = count;//�ν��Ͻ� ������ seriaNo�� ���� 
	}
	//������
	Product(){}
	//�޼ҵ�
	void print() {
		System.out.println("count = "+count);
	}
}
