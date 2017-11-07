package p09_ploymorph2;

public class Bus implements Vehicle {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName()+"가 달립니다.");
	}

	//추가된매소드는 프로모션되면 사용할수없다. 그래서 강제로 BUS로 Casting를 해줘야함
	//메소드 추가
	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}

}
