package p03_constructors;
/*
 * �������� �����ε�
 * -�������� �̸��� �����ϰ�
 * -�Ű������� Ÿ�԰� ���������� �ٸ� ����
 * -Ŭ������(Ÿ��1 ����1,Ÿ��2 ����2 , Ÿ��3 ���� 3 ......) <- signature�����.
 * {}
 * -�������� �̸��� �����ϰ�
 * -�Ű������� Ÿ�԰� ���������� �ٸ�����
 */
public class CarConstExample1 {

	public static void main(String[] args) {
		Car car1 = new Car();//instance����
		Car car2 = new Car("�����ڵ���");
		Car car3 = new Car("���", "�ҷ���");
		Car car4 = new Car("������", "������", 300);
		Car car5 = new Car("����", "�ƹݶ�", 280, 2017);
		
		Car [] car = new Car[5];
		car[0] = car1;
		car[1] = car2;
		car[2] = car3;
		car[3] = car4;
		car[4] = car5;
		
		for(int i=0;i<car.length;i++) {
			System.out.println((i+1)+" : "+car[i].company 
					+" : "+car[i].model
					+" : "+car[i].maxSpeed
					+" : "+car[i].productYear);
		}
		System.out.println("====================================");
		car1.company = "�����ڵ���";
		car1.model = "�׷���";
		car1.maxSpeed = 450;
		car1.productYear = 2018;
		
		car2.model = "�׷���";
		car2.maxSpeed = 450;
		car2.productYear =2018;
		
		car3.maxSpeed=350;
		car3.productYear=2018;
	/*	
		car[0] = car1;
		car[1] = car2;
		car[2] = car3;
		car[3] = car4;
		car[4] = car5;
		*/
		for(int i=0;i<car.length;i++) {
			System.out.println((i+1)+" : "+car[i].company 
					+" : "+car[i].model
					+" : "+car[i].maxSpeed
					+" : "+car[i].productYear);
		}
		
		
	}
}
