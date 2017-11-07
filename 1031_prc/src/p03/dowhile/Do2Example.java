package p03.dowhile;
/*
 * 이중 ~do ~while()문
 */
public class Do2Example {

	public static void main(String[] args) {
		int i = 1, j =2;
		
		do {
			do {
					System.out.print(j+"x"+i+"="+j*i+"\t");
					j++;//증가식
			}while(j<=9); //조건식
			System.out.println();
			i++;//바깥쪽 do while문의 증가식
			j=2;//안쪽 do~while()문에 사용될 변수 j 초기화
		}while(i<=9);
		System.out.println("i ="+i);
	}
}
