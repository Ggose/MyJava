package p03.dataTypes;

public class DataType2Example {

	public static void main(String[] args) {
		
		int i = Integer.MAX_VALUE;	//int�� �ְ�
		int j = Integer.MAX_VALUE;	//int�� �ְ�
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(i+j);
		
		//byteŸ���� �ּҰ��� -128,�ִ밪�� 127
		//-128���� 127���� ��� �ݺ���.
		byte var1 =127;
		
		for(int k =1; k<=500;k++) {
			System.out.println(var1++);
		}
	}
}
