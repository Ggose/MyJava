package p01.switches;

import java.util.Scanner;

public class Switch3Example {

	public static void main(String[] args) {
		//계산기 만들기
		//값 1 op 값 2
		int arg1 = 0 , arg2 = 0;
		double result = 0.0;
		char op = ' ';
		//키보드값을 입력받는 scanner객체 생성
		Scanner keyboard = new Scanner(System.in);
		System.out.println("계산기 프로그램 값1 op 값2 형태 ");
		System.out.println("첫번째 값을 입력하세요 :");
		arg1 = keyboard.nextInt();
		System.out.println("연산자를 입력하세요 (+,-,ㅌ,/)");
		op = keyboard.next().charAt(0);
		System.out.println("두번째 값을 입력하세요 :");
		arg2 = keyboard.nextInt();
		//switch()문
		
		switch(op) {
		case '+' :
			result = arg1+arg2;
			break;
		case '-' :
			result = arg1-arg2;
			break;
		case '*' :
			result = arg1*arg2;
			break;
		case '/' :
			result = arg1/arg2;
			break;
		}
		System.out.println("결과"+arg1+"과"+arg2+"의 연산결과는  ="+result);
	
	}
}
