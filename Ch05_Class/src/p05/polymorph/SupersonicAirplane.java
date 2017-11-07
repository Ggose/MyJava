package p05.polymorph;

/*
 * final 필드 ->상수 , 수정 불가
 */
public class SupersonicAirplane extends Airplane {
   public static final int NORMAL = 1;// 상수 final 필드 => 상수
   public static final int SUPERSONIC = 2;
   // 필드
   public int flyMdoe = NORMAL;

   @Override
   public void fly() {
      if (flyMdoe == SUPERSONIC) {
         System.out.println("슈퍼소닉비행");
      } else
         super.fly();
   }

}