package p01_ifs;


public class If2Example {
/*
 * 
 */
	public static void main(String[] args) {
		int a = Integer.parseInt(args[2]); //main의 매개변수 값
		
		if(a>0) {
			System.out.println(a+"는 양의정수 입니다.");
		}
		else {
			System.out.println(a+"는 음수입니다.");
		}
		System.out.println(a+"의 절대값은"+Math.abs(a)+"입니다.");
	}
}
