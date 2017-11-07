
public class ArrayEx {

	public static void main(String[] args) {			//jvm을 실행 하려면 이게 필요하넋
		// TODO Auto-generated method stub
		
		int[] myArray = new int[5];
		byte[] byteArray = new byte[3];
		int [] myArray2 = {2,3,4};

		String str = "오늘 날씨가 너무 좋다.";
		String[]strArray = new String[3];
		String[][] strArray2 = {
				{"Mr","Mz","Mx"},{"Sr","Sc","Sn"}
				};
		
		byteArray[0] = 100;
		
		strArray[0] = "월요일";
		strArray[1] = "화요일";
		strArray[2] = "수요일";
		
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







