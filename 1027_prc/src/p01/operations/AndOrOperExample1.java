package p01.operations;

/*
 * or����
 * -| :�����ǿ������� ���� true�̴��� ������ �ǿ������� ���� ���� �� | ������ �� 
 *- || : �����ǿ����ڰ� true�̸� or������ Ư���� ������ �ǿ������� true/false
 *		 ���ο� ������� true�̹Ƿ� ������ �ߴ��ϰ� ��������� �����Ѵ�.
 *		T or T = T 
 *		T or F = T
 *		F or T = T
 *		F or F = F
 */
public class AndOrOperExample1 {

	public static void main(String[] args) {
		
		int num1=0,num2=0;
		
		if(++num1>0 | ++num2>0)	//���� 1����>0 : true , ������ 1 ���� >0 : true  Ʈ���̹Ƿ� ������ɾ� ����
			System.out.println("num1�� 0����ũ�ų� num2�� 0���� Ů�ϴ�. ");
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		
		num1=0;
		num2=0;
		
		if(++num1>0||++num2>0)
			System.out.println("num1�� 0���� ũ�ų� num2�� 0���� Ů�ϴ�.");
		System.out.println("num1 ="+num1);
		System.out.println("num2 ="+num2);
		
	}
}
