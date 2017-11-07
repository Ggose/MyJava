package p01_references;

public class Arr04Example {

	public static void main(String[] args) {
		int []a = {85,90,75,100,95};
		int sum = 0;
		double avg;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		
		avg = sum/a.length; //합계/배열의 요소갯수
		
		System.out.println("합계 :"+sum);
		System.out.println("평균 :"+avg);
	
		//향상된 for문
		
		sum = 0;
		for(int s:a) { //(타입 변수 : 객체) 선언된 변수는 {여기서 사용}
			sum+=s;
		}
		avg = sum/a.length;
		System.out.println("sum ="+sum);
		System.out.println("avg = "+avg);
	}
}
