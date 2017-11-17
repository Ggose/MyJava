package test;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
/**
 * Thread-safe: 멀티쓰레드환경에서 자료를 보호할수있는 구조
 * */
public class HashTableExam {
	static Scanner scanner = new Scanner(System.in);
	static Map<String,String> map = new Hashtable<>();
	static boolean yesNo=true;
	public static void main(String[] args) {
		///1.회원가입 2.로그인 3. 종료
		// 1.회원가입 - scanner로 입력받아서 저장
		// 반복 저장 종료.
		//2.로그인시 패스워드가 5회 실패면 프로그램종료
		//  아이디 없으면 가
		
		while(true) {
		System.out.println("메뉴");
		System.out.println("--------------------------");
		System.out.println("|1.회원가입 | 2.로그인| 3.종료");
		System.out.println("--------------------------");
		int selectNum = scanner.nextInt();
		switch(selectNum) {
		case 1:
			   subscribe();//회원가입
			   break;
		case 2:
			   login();//로그인 메소드
			   break;
		case 3: System.out.println("종료");
				System.exit(0);//프로그램 종료
			    break;
		 }
		}

	}//main메소드 끝.
	//회원가입
	static void subscribe() {
			 do{
				System.out.print("아이디:");
				String id= scanner.next();
				System.out.print("패스워드:");
				String password = scanner.next();
				map.put(id, password);
				System.out.println("계속하시겠습니까?");
				if(isConfirm()) yesNo=true;
				else yesNo=false;
			}while(yesNo);
	}
	//로그인 처리
	static void  login() {
		System.out.println("아이디와 패스워드를 입력하세요");
		System.out.print("아이디:");
		String id = scanner.next();
		
		if(map.containsKey(id)) {//<키,값>저장된 자료에서 키부분만 검색
			int cnt=0;
			while(true) {
				System.out.print("패스워드:");
				String password = scanner.next();
			if(map.get(id).equals(password)) {
				System.out.println("로그인 완료");
				System.exit(0);
			}else {//password가 맞지않을때 cnt++;
				System.out.println("비밀번호가 일치하지않아요\n"+
			                        ++cnt+"회 오류 --* ");
				if(cnt==5) {
					System.out.println("로그인 실패");
					System.exit(0);//프로그램 종료
				}
			}
			}//while끝
		}else
			System.out.println("입력한 아이디가 존재하지않습니다.");
		    System.out.println("회원가입하시겠습니까?(y/n)");
		    if(isConfirm()) subscribe();//호출한 isConfirm()값이 true면 회원가입
	}
	//계속 진행 여부 확인 메소드
 private static boolean isConfirm() {
	char c = scanner.next().charAt(0);
	if(c=='y'||c=='Y') return true;
	 else 
		return false;
	}
}
