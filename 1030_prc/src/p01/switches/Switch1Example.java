package p01.switches;

import java.util.Scanner;

public class Switch1Example {
/*
 * 조건문 -Swtich문
 * 	switch(조건) - 조건에 따라 미리 실행할 작업을 분기해놓은 제어문
 */
	public static void main(String[] args) {
		
		int score = 0;
		
		String grade = "";
		boolean isContinue = true;
		//case에 따라 분기
		//98->98/10 => 9.8 (int)타입이므로 9가 됨,
		while(isContinue) {
		Scanner keyborder = new Scanner(System.in);
		score = keyborder.nextInt();
		switch(score/10) {
		case 10://break문이 없으면 아래 case문까지 실행됨
		case 9: grade = "A";break;//break문이 있어서 해당 case문만 실행하고 swtich()문을 벗어남
		case 8: grade = "B";break;//break문이 있어서 해당 case문만 실행하고 swtich()문을 벗어남
		case 7: grade = "C";break;//break문이 있어서 해당 case문만 실행하고 swtich()문을 벗어남
		case 6: grade = "D";break;//break문이 있어서 해당 case문만 실행하고 swtich()문을 벗어남
		default: grade = "F";
		}
		
		if(score >= 60&& score<100) {
			if(score%10>7)grade+="+";
			else if(score%10<4)grade+="-";
			else grade +="0";
		}
		System.out.println("등급은"+grade);
		System.out.println("계속할까요 ?");
		//char타입의 값을 'y'와 비교연산자(==)로 비교
		if(keyborder.next().equalsIgnoreCase("y")) //문자열로 받음
			//equalsIgnoreCase("문자열") -문자열 비교 매소드
			isContinue = true;
		else
			isContinue=false;
		}
		System.out.println("종료");
	}
}
