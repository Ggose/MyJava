package testTeacher;

import java.util.Scanner;

public class MemberServiceExample {
	static Member[] memberArray = new Member[100];
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		//객체 생성
		System.out.println("아이디와 패스워드입력하세요");
		String id = scanner.next();//id
		String password = scanner.next();//패스워드
		Member member = findMember(id,password);
		if(member==null) {
			System.out.println("회원가입하세요");
		    id = scanner.next();
		    password = scanner.next();
		    String name = scanner.next();
		    member = new Member(id,password,name);
		    for(int i=0;i<memberArray.length;i++) {
		    	if(memberArray[i]==null) {
		    		memberArray[i]=member;
		    		System.out.println("회원가입성공");
		    		break;
		    	}
		    }
		}else {//id와 password에 맞는 회원 존재
			System.out.println(member.getName()+"님 로그인 환영합니다.");
		}
	}
	private static Member findMember(String id, String password) {
		Member member =null;
		//for();;;
		return member;
	}

}
