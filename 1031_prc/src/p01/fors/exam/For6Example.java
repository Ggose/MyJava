package p01.fors.exam;

public class For6Example {

	/*
	 * for(①초기식;②조건식;④증감식){
	 * 
	 *	③실행문; 
	 * }
	 */
	public static void main(String[] args) {
		
		//구구단출력
		int result=0;
		for(int i = 2 ; i <=9 ; i++) {
			for(int j = 1; j<=9;j++) {
				result = i*j;
				System.out.print(i+"*"+j+"="+result+"\t");
			}
			System.out.println("");
		}
		System.out.println("============================================");
		int result1=0;
		for(int i = 1 ; i <=9 ; i++) {
			for(int j = 2; j<=9;j++) {
				result1 = i*j;
				System.out.print(j+"*"+i+"="+result1+"\t");
			}
			System.out.println();
		}
	}
}
