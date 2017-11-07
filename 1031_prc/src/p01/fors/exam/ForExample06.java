package p01.fors.exam;

import java.util.Scanner;

public class ForExample06 {
	public static void main(String[] args) {
		// 값을 입력받아서 2단부터 입력받은 단수까지 구구단 세로출력

		Scanner scanner = new Scanner(System.in);

		int result = 0;
		
		while (true) {
			System.out.println("단 입력:");
			int num = scanner.nextInt();
			for (int i = 2; i <= num; i++) {
				for (int j = 1; j <= 9; j++) {
					result = i * j;
					System.out.println(i + "*" + j + "=" + result+"\t");

				}
				System.out.println();
			}
			System.out.println("계속하시겠습니까?");
			char c = scanner.next().charAt(0);
			if (!(c == 'y' || c == 'Y'))
				break;

		}

		System.out.println("종료");
	}

}
