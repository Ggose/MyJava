package test1106;
import java.util.Scanner;

public class MemberServiceExample {
   static Member[] memberArray = new Member[100];
   static Scanner sc = new Scanner(System.in);

   public static void main(String[] args) {
      boolean run = true;
      while (run) {
         System.out.println("----------------------------");
         System.out.println("1.로그인|2.회원가입목록|3.종료|");
         System.out.println("----------------------------");
         System.out.print("선택>");
         int selectNo = sc.nextInt();
         switch (selectNo) {
         case 1:
            Login();
            break;
         case 2:
            LoginList();
            break;
         case 3:
            run = false;
            break;
         }
      }
      System.out.println("프로그램 종료");
   }

   private static void LoginList() {
      
               for(int i=0;i<memberArray.length;i++) {
            if(memberArray[i]!=null) {
               System.out.println("id : "+memberArray[i].getId()+"password : "+memberArray[i].getPassword()+" Name :"+memberArray[i].getName());
            }
         }
   
   }

   private static void Login() {
      // 객체 생성
      System.out.println("아이디와 패스워드를 입력하시오: ");
      String id = sc.next();
      String password = sc.next();
      Member member = find(id, password);
      if (member == null) {
         System.out.println("회원가입을 하시오(id,password,name 순으로 적으세요):");
         id = sc.next();
         password = sc.next();
         String name = sc.next();
         member = new Member(id, password, name);
         for (int i = 0; i < memberArray.length; i++) {
            if (memberArray[i] == null) {
               memberArray[i] = member;
               System.out.println("회원가입성공");
               break;
            }
         }
      } else {
         System.out.println(member.getName() + "님 로그인 환영합니다.");
      }
   }

   // 입력된 id 정보 조회
   private static Member find(String id, String password) {

      Member member = null;
      for (int i = 0; i < memberArray.length; i++) {
         if (memberArray[i] != null)
            if (memberArray[i].getId().equals(id) && memberArray[i].getPassword().equals(password)) {
               // 문자열 내용비교 문자열1.equals(문자열2)
               member = memberArray[i];
            }
      }

      return member;

   }
}
