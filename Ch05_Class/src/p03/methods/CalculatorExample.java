package p03.methods;
/*
 * ����Ÿ�� �޼ҵ��(�Ű�����){�����;}
 *  �޼ҵ� ȣ�� => ��������.�޼ҵ��(������);   <-�޼ҵ��� ����θ� ȣ��;
 */
public class CalculatorExample {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		//�޼ҵ� ȣ�� - CalculatorExample �̶�� �ܺΰ�ü�� Calculator
		//������ plus()�޼ҵ带 ȣ�� => ��������.�޼ҵ�(������,������);
		cal.powerOn();//voidŸ���� �޼ҵ� ȣ��
		int result = 0;
		
		result = cal.plus(10, 20);
		System.out.println("��� ="+result);//����Ÿ���� �ִ� �޼ҵ�� ������� �޾� 
		cal.devide(10, 5);	//����Ÿ���� �޼ҵ��� ������� �����ʾƵ���
		cal.powerOff();	//voidŸ���� �޼ҵ� ȣ��
	}
}
