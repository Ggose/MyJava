package p09_ploymorph2;

public class Taxi implements Vehicle {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName()+"가 달립니다.");
	}

}
