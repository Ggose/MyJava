package p01.operations;

import java.util.Scanner;

/*
 * 삼항연산자
 *  조건식 ? 참 : 거짖
 *  			조건식 ? 참 : 거짖	
 *  						조건식 ? 참 : 거짖
 *  									조건식? 참 : 거짖
 */
public class OperExample6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean isContinue = true; //처음의 true으 설정 그래와 while문에서 작동된다
		while(isContinue) {		//boolean타입의 값은 제어문(반복문)의 제어에 사용
		System.out.println("점수를 입력하세요 :");
		//next() 키보드로 입력된 문자열 값을 문자열로 리턴하는 메소드
		//Integer.parsInt(scanner.next()); 이런식으로 해도 된다.
		int score = scanner.nextInt();	
		char grade = ' '; //char타입의 초기화시 빈문자는  ' ' 공백으로 초기화 해야한다.
		
		grade = score >90 ? 'A':(score>80 ?'B':score>70?'C':'F');
		System.out.println("등급"+grade);
		
		System.out.println("계속하시겠습니다 ? ");
		//charAt(index) 메소드는 문자열에서 해당 index번지의 문자하나를 추출하는 메소드
		char yesNo = scanner.next().charAt(0);
		
		
		isContinue= (yesNo == 'y'||yesNo == 'Y')?true:false;		
		
		}
		System.out.println("종료");
	}
}
