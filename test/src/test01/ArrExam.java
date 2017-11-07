package test01;

import java.awt.List;
import java.util.Arrays;
import java.util.Scanner;

public class ArrExam {
	public static void main(String[] args) {
		boolean run = true;
		boolean run1 = true;
		int studentNum = 0;
		int[] scores = null;
		int counter = 0;

		/*
		 * Scanner scanner; scanner = new Scanner(value);
		 */

		// 참조타입/ 참조변수/ = new 셍성자(초기값);
		// Scanner/ scanner/ = new Scanner(System.in)
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println();
			System.out.println("---------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("---------------------------------");
			System.out.print("선택>");
			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				// 입력한 숫자 길이의 1차원 배열 생성
				// ex) 5를 입력했다면 5개의 길이의 1차원 배열 생성
				// scores = {1,2,3,4,5}
				System.out.println("총 학생수를 입력하세요!!(숫자로만)");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];

			} else if (selectNo == 2) {
				// 점수 입력
				for (int i = 0; i < scores.length; i++) {
					System.out.println((i + 1) + "번째 학생의 점수를 입력해주세요");
					scores[i] = scanner.nextInt();
				}
			}

			else if (selectNo == 3) {
				// 점수 리스트 출력
				for (int j : scores) {
					++counter;
					System.out.println(counter + "번째 학생의 점수는 " + j);
				}

			} else if (selectNo == 4) {

				while (run1) {
					System.out.println("--------------------------------");
					System.out.println("1.오름차순|2.내림차순|3.등급 출력|4.종료");
					System.out.println("--------------------------------");
					System.out.print("선택>");

					
					int selectNo2 = scanner.nextInt();

					if (selectNo2 == 1) {
						Arrays.sort(scores);

						System.out.print("정렬 후 :");
						for (int j : scores) {
							System.out.print(j + " ");
						}
						System.out.println();
					} else if (selectNo2 == 2) {

						System.out.print("내림차순");
						for (int i = scores.length - 1; i >= 0; i--) {
							System.out.print(scores[i] + " ");
						}
						System.out.println();
					}
					else if(selectNo2 ==3) {
						
						char grade = ' ';
						for(int j : scores) {
							switch(j/10) {
							
							case 9:
								grade = 'A';
								break;
							case 8:
								grade = 'B';
								break;
							case 7:
								grade = 'C';
								break;
							case 6:
								grade = 'D';
								break;
							default :
								grade = 'F';
								break;	
							}
							System.out.print(grade+" ");
						}
						System.out.println();
					}
					else if(selectNo2 == 4) {
						run1  =false;
					}

				}

			} else if (selectNo == 5) {
				run = false; // 종료
			}
		} // while문 종료
		System.out.println("종료");
	}
}
