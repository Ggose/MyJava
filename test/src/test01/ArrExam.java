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

		// ����Ÿ��/ ��������/ = new �ļ���(�ʱⰪ);
		// Scanner/ scanner/ = new Scanner(System.in)
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println();
			System.out.println("---------------------------------");
			System.out.println("1.�л���|2.�����Է�|3.��������Ʈ|4.�м�|5.����");
			System.out.println("---------------------------------");
			System.out.print("����>");
			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				// �Է��� ���� ������ 1���� �迭 ����
				// ex) 5�� �Է��ߴٸ� 5���� ������ 1���� �迭 ����
				// scores = {1,2,3,4,5}
				System.out.println("�� �л����� �Է��ϼ���!!(���ڷθ�)");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];

			} else if (selectNo == 2) {
				// ���� �Է�
				for (int i = 0; i < scores.length; i++) {
					System.out.println((i + 1) + "��° �л��� ������ �Է����ּ���");
					scores[i] = scanner.nextInt();
				}
			}

			else if (selectNo == 3) {
				// ���� ����Ʈ ���
				for (int j : scores) {
					++counter;
					System.out.println(counter + "��° �л��� ������ " + j);
				}

			} else if (selectNo == 4) {

				while (run1) {
					System.out.println("--------------------------------");
					System.out.println("1.��������|2.��������|3.��� ���|4.����");
					System.out.println("--------------------------------");
					System.out.print("����>");

					
					int selectNo2 = scanner.nextInt();

					if (selectNo2 == 1) {
						Arrays.sort(scores);

						System.out.print("���� �� :");
						for (int j : scores) {
							System.out.print(j + " ");
						}
						System.out.println();
					} else if (selectNo2 == 2) {

						System.out.print("��������");
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
				run = false; // ����
			}
		} // while�� ����
		System.out.println("����");
	}
}
