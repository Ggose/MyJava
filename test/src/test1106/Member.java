package test1106;

/*id 와 pass가 맞으면 로그인 메시지 출력~  홍길동이 로그인 하였습니다
 * id와 passw가 안맞으면 회원가입 하시겠습니까? (배열만들어서 100개짜리) 
 */
public class Member {
   //필드
   
   String id;
   String password;
   String name;
   
   //생성자
   public Member(String id, String password, String name) {
      super();
      this.id = id;
      this.password = password;
      this.name = name;
   }
   
   //메소드
   public String getId() {
      return id;
   }
   public void setId(String id) {
      this.id = id;
   }
   public String getPassword() {
      return password;
   }
   public void setPassword(String password) {
      this.password = password;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   

   
}
