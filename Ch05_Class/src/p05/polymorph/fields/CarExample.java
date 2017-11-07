package p05.polymorph.fields;

public class CarExample {

	public static void main(String[] args) {
		//Car 객체 생성
		Car car = new Car();
		for(int i = 1; i<=5;i++) {
			int problemLocation = car.run();
			
			if(problemLocation!=0) {
				if((problemLocation-1)%2 ==0) {
				System.out.println(car.tires[problemLocation-1].location+"HankookTire 교체");
				car.tires[problemLocation-1] = 
						new HankookTire(car.tires[problemLocation-1].location, 15);
			}else {
				
					System.out.println(car.tires[problemLocation-1].location+"KumhoTire 교체");
					car.tires[problemLocation-1] = 
							new KumhoTire(car.tires[problemLocation-1].location, 15);
			}
			}
			/*
			switch(problemLocation) {
			
			case 1:
				System.out.println("앞 왼쪽 HankookTire로 교체");
				car.forntLeftTire = new HankookTire("앞 왼쪽", 15);
				break;
			case 2:
				System.out.println("앞 오른쪽 KumhoTire로 교체");
				car.forntRightTire = new KumhoTire("앞 오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤 왼쪽 HankookTire로 교체");
				car.rearLeftTire = new HankookTire("뒤 왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤 오른쪽 KumhoTire로 교체");
				car.rearRightTire = new KumhoTire("뒤 오른쪽", 17);
				break;
				
			}
			*/
			System.out.println("-----------------------------------------");
		}
	}
}
