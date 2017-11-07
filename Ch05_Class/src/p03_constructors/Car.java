package p03_constructors;
/*
 * Ŭ���� ������ 3��� : �ʵ�, ������ , �޼ҵ�
 * -������ �����ε�
 * - ������ �̸��� �����ڸ� ������ �����(���� : �Ű������� Ÿ�� ������ �޶����)
 * -this()�޼ҵ�
 * 		:������ Ŭ���� ������ �ٸ� �����ڸ� ȣ���ϴ� �޼ҵ�
 * 		:this()�޼ҵ�� �ݵ�� ������� ù�ٿ� ����Ǿ���.
 * -�����ڸ� ������ ���� ����ϴ� ���� 
 * 		: ��ü�� ����� ���� �ʱ� �������� ���� �޶����� �ִ� ��Ȳ
 */
public class Car {
	
	//�ʵ�(�ɹ�����, ����������� ��)
	//-Ŭ������ �����Ӽ�,���� ����,��ǰ��ü�� �����ϴ� ����
	String company;//�����Ӽ�
	String model;//�����Ӽ�
	int maxSpeed;//�����Ӽ�
	int productYear;//�����Ӽ�
	int currentSpeed;//�������
	boolean engineStart;//�������
	//������
	//-�����ڴ� Ŭ������� ���� �̸��� ���� �޼ҵ��̸�,����Ÿ�� Ű���尡 ����
	//-�������� ������ �ʵ���� ���� �ʱ�ȭ�ϴ� ����
	Car(){}	//�Ű��������� default����
	Car(String company){
		this.company = company;
		} //�Ű����� 1���� ������
	Car(String company,String model){
		this(company); 	//�Ű����� 1��¥�� ������ ȣ���Ͽ� ����Ҽ���  �ִ�
		//this.company = company; 
		this.model = model;
		} //�Ű����� 2���� ������
	Car(String company,String model,int maxSpeed){
		this(company,model);
		//this.company= company; 
		//this.model = model;
		this.maxSpeed = maxSpeed;
		}
	//�Ű����� 3��¥�� ������
	Car(String company,String model,int maxSpeed,int productYear){
		this(company,model,maxSpeed);
		//this.company= company; 
		//this.model = model;
		//this.maxSpeed = maxSpeed;
		this.productYear = productYear;
	} //�Ű����� 4��¥�� ������
	
	//�޼ҵ�
	void speedUp(int speed) {
		if(engineStart == false)engineStart=true;
		currentSpeed+=speed;
	}
	void speedDown(int speed) {
		if(currentSpeed -speed <0)currentSpeed = 0;
		currentSpeed-=speed;
	}
	void stop() {
		currentSpeed =0;
		engineStart=false;
	}
}
