package p01.operations;
/*
 * �񱳿����� (==,!=,>,<,>=,<=)
 */
public class OperExample4 {

	public static void main(String[] args) {
		//��ġ����
		System.out.println(4<3);	//���ͷ�<���ͷ� => true/false
		System.out.println(10>20.0);//���ͷ�>���ͷ� => true/false
		System.out.println(12.5f<=11);//���ͷ�<=���ͷ� => true/false
		System.out.println(7>=7);//���ͷ�<���ͷ� => true/false
		//�񱳿�����(==)
		int num1= 5;//���ͷ�5
		int num2=2+3;//���ͷ�2+���ͷ�3�� �������� num2�� ����
		
		if(num1==num2)	//if()������ ����(==)�� ����� true
			System.out.println("num1 �� num2�� ����");
		else
			System.out.println("���� �ʴ�");
		
		if((num1!=num2)==false)	//����� true
			System.out.println("num1�� num2�� �ٸ��ٰ� �Ҽ� ����");
		
		double num3 = 1.1+2.2;	//doubleŸ���� literal1.1�� 2.2�� ���������� ������� num3�� ����
		double num4 = 3.3;
		
		if(num3==num4)	//if()num3==num4�� ������� true�̸� "����",false�̸� "����"
			System.out.println("����");	//if���� {}������ ��ɹ��� �ϳ��̸� ��������
		else
			System.out.println("����");
		
		int a=3,b=4,c=3,d=5;
		if((a==2|a==c)&!(c>d)&(1==b^c!=d))
			System.out.println("true");
		else
			System.out.println("false");
		
		System.out.println(a==2|a==c);
		System.out.println(!(c>d));
		//System.out.println(1==b^c);
		
		
	}
}
