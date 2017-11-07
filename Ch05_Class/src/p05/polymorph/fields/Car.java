package p05.polymorph.fields;

public class Car { //필드의 다양성

	//
	// 필드(Car의 부품으로써의 필드) 
	Tire [] tires = { //배열로 하는방법
			new Tire("앞쪽 왼쪽 타이어", 6), 
			new Tire("앞쪽 오른쪽 타이어", 2),
			new Tire("뒤쪽 왼쪽 타이어", 3),
			 new Tire("뒤쪽 오른쪽 타이어", 4)
	};
	/*  따로따로 하는 방법
	Tire forntLeftTire = new Tire("앞쪽 왼쪽 타이어", 6); //운전석쪽
	Tire forntRightTire = new Tire("앞쪽 오른쪽 타이어", 2);//
	Tire rearLeftTire = new Tire("뒤쪽 왼쪽 타이어", 3);
	Tire rearRightTire = new Tire("뒤쪽 오른쪽 타이어", 4);
	*/

	//메소드
	int run() {
		System.out.println("자동차 달림.");
		for(int i = 0 ; i<tires.length;i++) {
			if(tires[i].roll() == false) {
				stop();
			return (i+1);
			}
		}
		return 0;
	}
		/*
		if(forntLeftTire.roll() == false) {stop();return 1;}
		if(forntRightTire.roll() == false) {stop();return 2;}
		if(rearLeftTire.roll() == false) {stop();return 3;}
		if(rearRightTire.roll() == false) {stop();return 4;}
		return 0;
		*/


	
	private void stop() {
		System.out.println("자동차 멈춤");
	}
}
