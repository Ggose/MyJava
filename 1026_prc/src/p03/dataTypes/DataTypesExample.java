package p03.dataTypes;

public class DataTypesExample {

	/*
	 * ������ Ÿ�� 
	 * -�⺻������ Ÿ��
	 */
	public static void main(String[] args) {
		
		//���ú���
		byte var1 = 127;//byteŸ��-���� 1byte
		char  c= 'A';//charŸ��-���� 2byte
		int a = 100;//intŸ�� 4byte
		double d = 34.53;//doubleŸ�� 8byte
		
		System.out.println(var1+1);//byteŸ���� �� �� intŸ���� �� 1�� ����
		System.out.println(c);//�����߻� ������ Ÿ�� ������ ��� ���� ���ԵǹǷ� ����
		System.out.println(a);
		System.out.println(d);
		//������ Ÿ���� ����
		System.out.println(Byte.MIN_VALUE+"<=byteŸ���� ���� ����<="+Byte.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE+"<=intŸ���� ���� ����<="+Integer.MAX_VALUE);
		System.out.println(Double.MIN_VALUE+"<=doubleŸ���� ���� ����<="+Double.MAX_VALUE);
		System.out.println(Float.MIN_VALUE+"<=floatŸ���� ���� ����<="+Float.MAX_VALUE);
	}
}
