package p01_references;
/*
 * �������� -
 * 		�迭,��ü,�������̽� ���� �����ϴ� ����
 * 		cf.�⺻������Ÿ�Ժ������� �������� ����
 */
public class Arr01Example {

	public static void main(String[] args) {
		//�迭
		int [] a = null; //�迭�� �ʱⰪ�� null�� �ʱ�ȭ ���� �����ϴ� ��ü�� ���� ����
		a= new int[5];//���̰� 5���� intŸ���� �迭 ��ü ���� �� �������� a�� ��ü�� ������ ����.
		a[0] = 7;
		a[1] = 34;
		a[2] = 67;
		a[3] = 6;
		a[4] =234;
		System.out.println("�迭�� ���� :"+a.length); //�迭�� ���̸� ���Ҽ��ִ�.(�迭�� ��Ұ�)
		
		for(int i= 0;i<a.length;i++) {
			System.out.println("a["+i+"] = "+a[i]);
		}
	}
}
