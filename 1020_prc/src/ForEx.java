
public class ForEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i =0;i<5;i++) {
			System.out.println(i);
		}
		
		for(int i =0;i<5;i++) {
			if(i==3) {
				break;
			}
			System.out.println(i);
		}
		
		for(int i =0;i<5;i++) {
			if(i==3) {
				continue;
			}
			System.out.println(i);
		}
		
		int [] array = {2,3,4,5};
		
		for(int i = 0; i< array.length;i++) {
			System.out.println(array[i]);
		}
		
		String[][] strArray2 = {
				{"Mr","Mz","Mx"},{"Sr","Sc","Sn"}
				};
		for (int i = 0; i < strArray2.length; i++) {
			for(int j =0;j<strArray2[i].length;j++) {
				System.out.println(strArray2[i][j]);
			}
		}
//		이렇게 스는 for문도 있다
		for(String[] innerName: strArray2) {
			for(String strArray:innerName) {
				System.out.println(strArray2);
			}
		}
		
		int age = 20;
		
		String str = age>15? "too old" : "too young";
		System.out.println(str);
	}

}
