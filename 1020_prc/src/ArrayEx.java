
public class ArrayEx {

	public static void main(String[] args) {			//jvm�� ���� �Ϸ��� �̰� �ʿ��ϳ�
		// TODO Auto-generated method stub
		
		int[] myArray = new int[5];
		byte[] byteArray = new byte[3];
		int [] myArray2 = {2,3,4};

		String str = "���� ������ �ʹ� ����.";
		String[]strArray = new String[3];
		String[][] strArray2 = {
				{"Mr","Mz","Mx"},{"Sr","Sc","Sn"}
				};
		
		byteArray[0] = 100;
		
		strArray[0] = "������";
		strArray[1] = "ȭ����";
		strArray[2] = "������";
		
		myArray[0] = 4;
		myArray[1] = 14;
		myArray[2] = 24;
		myArray[3] = 34;
		myArray[4] = 44;
		
		System.out.println(myArray[0]);
		System.out.println(myArray[1]);
		System.out.println(myArray[2]);
		System.out.println(myArray[3]);
//		System.out.println(myArray[4]);
		
		System.out.println(byteArray[0]);
		
		System.out.println(myArray2.length);
		
		System.out.println(strArray2[1][0]);
	}

}







