package p01.fors;

public class ForExample4 {
	/*
	 * for 반복문(초기값;체크;증감)
	 */
	public static void main(String[] args) {
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------");
		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------");
		for (int i = 4; i >= 0; i--) {
			for (int j = i; j >= 0; j--) {
				System.out.print(" ");
			}
			System.out.println("*");
		}

	}
}
