package p01.operations;

import java.util.Scanner; //Scanner클래스 java.util패키지에 있음

public class ConstExample2 {
	public static void main(String[] args) {
		// 원의넓이 구하기
		// 원의 넓이 반지름*반지름*PI

		final double PI = 3.14D;
		Scanner scanner = new Scanner(System.in);
		// 콘솔로부터 입력받기 위한 객체 생성
		try {
			while (true) {

				System.out.println("원하는 원의 반지름을 입력하세요 :");

				int r = scanner.nextInt();
				System.out.println("원의 넓이는 :" + r * r * PI);
				System.out.println("계속하시겠습니까?");

				String yessNo = scanner.next(); // String으로 입력된 값을 String 으로 변환

				if (!(yessNo.charAt(0) == 'y' || yessNo.charAt(0) == 'Y'))
					break; // 반복문을 빠져나가는 명령문

				else
					continue; // 계속진행
			}
			System.out.println("종료");
			//자바에서는 예외(Exception)도 객체
		} catch (java.util.InputMismatchException e) {
			System.out.println("오류발생 " + e.getMessage());
		} // try{실행할 명령어 } catch(발생할 예외){예외서 처리문 }
			// 자바에서 예외는 두가지
			//-1.checked Exception : 문법관련 오류를 컴파일시 체크
			//-2.unChecked Exception(RuntimeException) : 문법적 오류는 없은 프로그램 실행시 
														//입력자의 이렵값 오류,연산 오류에의해 발생하는 예외
	}
}