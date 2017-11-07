package p01.fors;

public class ForExample1 {

	public static void main(String[] args) {
		//1~10까지의 합 구하기
		int sum=0;
		for(int i= 1; i<=10;i++) {
			sum+=i;
		}
		System.out.println("sum = "+sum);
		
		int j =1;//초기식
		for(;j<=10;) { //if(i<=1)이 true이면 실행 ->while(j<=10){}
			sum = sum+j;
			j++; //증가식
			
		}
		
	}
}
