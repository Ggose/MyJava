package p01.operations;

import java.util.Scanner;

public class OperExample2 {

	public static void main(String[] args) {
		//콘솔로부터 값을 입력받기 위한 객체(instance)생성
		
		Scanner scanner = new Scanner(System.in);	//System.in입력 스트립
		
		System.out.println("x값을 입력하세요");
		int x = scanner.nextInt();	//입력받은 문자열타입의 값을 int타입으로 변환해서 출력
		
		System.out.println("y값을 입력하세요");
		int y = Integer.parseInt(scanner.next());	//scanner.next()는 입력받은 문자열을 문자열로 출력
													//입력받은 문자열을 Integer.parseInt()를 사용해 숫자로 출력.
		//입력받은 값으로 사칙연산
		//"문자열"+(문자열이 아닌 식의 결과값 , 문자열이 아닌값) 의 결과는 "문자열"
		//"x*y ="+x*y => "x*y="+x=>"x*y=x"+y=>"x*y=xy"
		//()연산자의 우선순위가 가장 높음. "문자열"+(x*y) => "문자열"+x*y의 결과값
		//"문자열+x*y의 결과값"
		
		System.out.println(2);		////int타입의 리터럴이 문자열"2" 바뀌어서 println()메소드의 매개변수로 전달
		System.out.println("x*y ="+(x*y));	
		System.out.println("x/y ="+(x/y));
		System.out.println("x+y ="+(x+y));
		System.out.println("x-y ="+(x-y));
		
	}
}
