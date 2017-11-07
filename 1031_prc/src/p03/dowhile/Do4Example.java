package p03.dowhile;

import java.util.Scanner;

/*
 * do~while()문
 * 오늘과제 - 반복횟수를 정해서 (5회) 반복횟수가
 * 			5회이상이면 종료p/g으로 수정하세요 .
 * 			제어문 if() break;
 */
public class Do4Example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0,num;
		int answer = (int)(Math.random()*100)+1;
		
		do {
			System.out.println("1~100까지의 수 중 어느수 일까요?");
			num = sc.nextInt();
			if(answer==num) {
			System.out.println(cnt+"회 만에 성공 !");
			break;
			}else if(answer>num) {
				System.out.println("더 큰값을 입력하세요");
			}else
				System.out.println("더 작은 값을 입력하세요");
			cnt++;//횟수 증가
		}while(true); //조건이 true이므로 무한반복
		sc.close(); //scanner 객체 자원 해제
		
	}
}
