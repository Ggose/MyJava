package p01.operations;
/*
 * ��Ʈ����
 * -�ڹ��� Ư����
 * �� �ǿ����ڰ� ��� intŸ�Ժ��� ���� Ÿ���̸� �Ѵ� intŸ������ �ڵ�����ȯ �� �� ������ ó����	
 * &,| ��Ʈ�����ڸ� �ϸ� int ������ȯ�ȴ�.
 */
public class BitOperExample2 {

	public static void main(String[] args) {
		byte num1 = 1,num2 = 2;
		short num3 = 3;
		char ch = 'A';
		
		byte result = (byte) (num1 & num2); //byteŸ�� & byteŸ���� ����� int.
		short result2 = (short) (num2 | num3);//byteŸ�� | byteŸ���� ����� int
		int result3 = num3^ch;	//short^char �� ����� int
		byte result4 = (byte) ~num1;	//~byte�� ����� int
	}
}
