package p01_ifs;

import java.util.Scanner;

/*
 * if-else if-else : 둘 중하나만인 경우가 아닌 다수의 경우가 발생하는 경우
 */
public class If3Example {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		String grade = ""; // 등급
		try {
			while (true) {
				System.out.println("점수를 입력하세요 :");
				int score = keyboard.nextInt(); // String타입으로 입력된 숫자형문자열을 숫자로 반환
				if (score >= 90) {
					grade = "A";
				} // 90이상이면 실행
				else if (score >= 80) {
					grade = "B";
				} // 위의 if()문을 제외한 90미만 80이상{}실행
				else if (score >= 70) {
					grade = "C";
				} // 위의 else if()문을 제외한 (80미만70이상){실행}
				else if (score >= 60) {
					grade = "D";
				} // 바로위 else if()문 제외한 (70미만60이상){}실행
				else
					grade = "F";// 그 외는 {}실행

				System.out.println("입력한 점수는" + grade + "등급입니다.");

				System.out.println("계속하시겠습니가?");
				String yessNo = keyboard.next();
				if (!(yessNo.charAt(0) == 'y' || yessNo.charAt(0) == 'Y')) {
					break;
				}
			}
		} catch (java.util.InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}
}
