package p03_dataTypes;

public class DataType05Example {

	public static void main(String[] args) {
		
		int var1 = 10;	//10���� ���ͷ�
		int var2 = 010;	//8���� ���ͷ�	 =>8*1+0
		int var3 = 0x10;//16���� ���ͷ� =>16*1+0
		
		System.out.println("var1 ="+var1);
		System.out.println("var2 ="+var2);
		System.out.println("var3 ="+var3);
		//32�� ���
		int var4 = 10;
		int var5 = 012;
		int var6 =0x0a;
		
		System.out.println("var4 = "+var4);
		System.out.println("var5 = "+var5);
		System.out.println("var6 = "+var6);
	}
}
