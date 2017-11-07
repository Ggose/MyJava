package p01_references;
/*
 * 참조변수 -
 * 		배열,객체,인터페이스 등을 참조하는 변수
 * 		cf.기본데이터타입변수에는 실제값이 저장
 */
public class Arr01Example {

	public static void main(String[] args) {
		//배열
		int [] a = null; //배열의 초기값을 null로 초기화 현재 참조하는 객체가 없는 상태
		a= new int[5];//길이가 5개인 int타입의 배열 객체 생성 후 참조변수 a에 객체의 번지를 저장.
		a[0] = 7;
		a[1] = 34;
		a[2] = 67;
		a[3] = 6;
		a[4] =234;
		System.out.println("배열의 갯수 :"+a.length); //배열의 길이를 구할수있다.(배열의 요소갯)
		
		for(int i= 0;i<a.length;i++) {
			System.out.println("a["+i+"] = "+a[i]);
		}
	}
}
