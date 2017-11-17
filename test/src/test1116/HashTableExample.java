package test1116;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
/**
 * Thread-safe: 멀티쓰레드환경에서 자료를 보호할수있는 구조
 * */
public class HashTableExample {
	public static void main(String[] args) {
		//1.회원가입 2.로그인 3.종료
		//1.회원가입 -scanner로 입력받아서 저장
		//반복 저장 종료.
		//2.로그인시 패스워드가 5회 실패하면 프로그램 종료
		//아이디가 없으면 가입
		Map<String,String> map = new Hashtable<>();
		map.put("spring", "1234");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("아이디와 패스워드를 입력하세요");
			System.out.print("아이디 :");
			String id = scanner.next();
			
			System.out.print("패스워드 :");
			String password = scanner.next();
			
			if(map.containsKey(id)) {	//<키,값>저장된 자료에서 키부분만 검색
				if(map.get(id).equals(password)) {
					System.out.println("로그인 완료");
					break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
				
			}else
				System.out.println("입력한 아이디가 존재하지 않습니다.");
		}
		
		

	}

}
