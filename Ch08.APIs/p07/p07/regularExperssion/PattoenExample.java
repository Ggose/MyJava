package p07.regularExperssion;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PattoenExample {

	public static void main(String[] args) {
		// (그룹핑), \뒤 특수문자 -> +\ \d : 숫자한개
		// {3.4} {n,n} 최소 3개 최대 4개
		// \d{4} 정확히 4개
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);

		if (result)
			System.out.println("정규식과 일치합니다");
		else
			System.out.println("정규식과 일치하지 않습니다.");
		// 정규식을 사용하지 않을때

		String str1 = data.substring(0, data.indexOf("-") - 1);
		String str2 = data.substring(data.indexOf("-") + 1, data.lastIndexOf("-"));
		String str3 = data.substring(data.indexOf("-") + 1);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

		boolean result1 = false, result2 = false, result3 = false;

		if (str1.length() >= 2 && str1.length() <= 3)
			result1 = true;
		if (str2.length() >= 3 && str2.length() <= 4)
			result2 = true;
		if (str3.length() == 4)
			result3 = true;
		if (result1 == true && result2 == true && result3 == true)
			System.out.println("자릿수가 맞습니다");
		else
			System.out.println("자릿수가 맞지 않습니다.");
		Scanner scanner = new Scanner(System.in);
		// 패스워드 앞에 특수문자1,알파벳 3 + 숫자2 =>패스워드 체프 표현식
		regExp = "[~!@#$%^&*()][a-zA-Z]{3}\\d{2}";
		int cnt = 0;

		while (true) {
			if (cnt >= 5) {
				System.out.println("종료");
				System.exit(0);
			} else {
				System.out.println("비밀번호를 입력하세요 :");
				data = scanner.next();
				result = Pattern.matches(regExp, data);
				if (result) {
					System.out.println("로그인 성공");
					System.exit(0);
				} else {
					System.out.println("로그인 실패");
					++cnt;
				}
			}
		}

	}
}
