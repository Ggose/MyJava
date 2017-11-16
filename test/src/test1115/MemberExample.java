package test1115;
import java.util.Scanner;
import java.util.regex.Pattern;
/**
 * 회원가입 id:5~20자의 영문 소문자, 숫자와 특수기호(_),(-)만 사용 가능합니다 
 * password:6~16자 영문 대 소문자, 숫자,
 * 특수문자를 사용하세요. name:5자이하 한글
 */
public class MemberExample {
	public static void main(String[] args) {
		String idReg = "[a-z|0-9|_|-]{5,20}";
		String passwordReg = "[a-zA-Z0-9|~!@#$%^&*]{6,16}";
		String nameReg = "[ㄱ-ㅎ|ㅏ-ㅣ|가-휳]{1,5}";
		System.out.println("회원가입 하시겠습니까?");
		Scanner scanner = new Scanner(System.in);
		System.out.print("id>");
		String id = scanner.next();
		System.out.print("password>");
		String password = scanner.next();
		System.out.print("name>");
		String name = scanner.next();
		// id체크 Pattern.matches();
		boolean idT = Pattern.matches(idReg, id);
		System.out.println(idT);
		// 패스워드 체크
		boolean idT2 = Pattern.matches(passwordReg, password);
		System.out.println(idT2);
		// 이름 체크
		boolean idT3 = Pattern.matches(nameReg, name);
		System.out.println(idT3);
	  if(idT==true && idT2==true && idT3==true) {
			Member member = new Member(id, password, name);
			System.out.println("가입완료");
			System.out.println(member);
	  }else
		  System.out.println("가입실패");
	}
}
