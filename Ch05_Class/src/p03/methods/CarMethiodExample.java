package p03.methods;

public class CarMethiodExample {

	public static void main(String[] args) {
		Car mycar = new Car(); //car instance���� �� �������� ����.
		mycar.setGas(5); //��������.�޼ҵ�(������); <-�޼ҵ� ȣ��
		System.out.println("�ʱ� �� :"+mycar.gas);
		
		boolean gasState = mycar.isLeftGas();//inLeftGas()�޼ҵ尡 booleanŸ���� �����ϹǷ�
											//���ϰ��� �޴� ������ booleanŸ���� ����
		
		if(gasState) {
			System.out.println("���");
			mycar.run(); //mycar�� run()�޼ҵ� ȣ��
		}
		if(mycar.isLeftGas()) {	//if()���� ���� true�̸�
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�");
		}else {
			System.out.println("gas�� �����ϼ��� :");
		}
	}
	

}
