package p06.promotion;

/*
 * 객체의 다형성 - 최상위 객체 참조변수에는 상속을 받은 자식들의 instance객체가
 *                   대입 가능하며 .
 *                   대입연산시 자동으로 부모타입으로 형변환 (promotion).
 */
public class PromotionEx {

   public static void main(String[] args) {

      B b = new B();
      C c = new C();
      D d = new D();
      E e = new E();
      // 최상위(A) 참조변수에 대입

      A a1 = b; /*
                * A=>B A=>B 
                * B=>D C=>E A=최상위
                */
      A a2 = c;
      A a3 = d;
      A a4 = e;

      B b1 = d;
      C c1 = e;

   }

}