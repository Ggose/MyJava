package p05.polymorph;

public class SupersonicEx {

	   public static void main(String[] args) {
	      SupersonicAirplane sa = new SupersonicAirplane();
	      sa.takeoff();// 이륙메소드 호출
	      sa.fly();// 비행메소드 호출
	      sa.flyMdoe = SupersonicAirplane.SUPERSONIC;
	      sa.fly();// 오버라이드된 메소드 호출
	      sa.flyMdoe = SupersonicAirplane.NORMAL;
	      sa.fly();
	      sa.land();
	   }

	}