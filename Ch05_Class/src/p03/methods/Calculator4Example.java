package p03.methods;
/*
 * static����� ȣ�� =>Ŭ������.�޼ҵ�() 
 * instance����� ȣ�� => new Ŭ������(); �� 
 * 					���� ����
 */
public class Calculator4Example {

	public static void main(String[] args) {
		int result1= Calculator4.plus(10, 20); //��ü�� ���������ʰ� �ٷ� ��밡��
		int result2 =Calculator4.minus(20, 10);
		System.out.println("result1 = "+result1);
		System.out.println("result2 = "+result2);
		Calculator4 calculator4 = new Calculator4();
		calculator4.setColor("����");
		System.out.println(calculator4.color);
	}
}
