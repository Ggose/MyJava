package p05.polymorph;

/*
 * 상속 클래스명 extends 부모클래스
 */
public class SportsCar extends car {

   @Override
   public void speedUp() {
      super.speedUp();// 부모클래스의 메소드 사용: super.메소드();
      speed += 10; // 재정의 부모메소드에서 1씩 증가 한 메소드를 10으로 재정의
   }

   // 부모클래스에서 final로 지정된 메소드이므로 자식클래스에서
   // 재정의 불가

   /*
    * private void stop() { System.out.println("자식메소드에서 재정의"); speed = 0;
    * 
    * }
    */
}