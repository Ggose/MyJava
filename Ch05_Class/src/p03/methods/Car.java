package p03.methods;

public class Car {

	//�ʵ�
	int gas;
	//������
	Car(){}
	
	//�޼ҵ�
	void setGas(int gas) {		//���Ϲ��� ���� voidŸ��
		this.gas =gas;
	}
	boolean isLeftGas() {	//booleanŸ���� �����ϴ� booleanŸ�� �޼ҵ�
		if(gas ==0) {
			System.out.println("gas�� �����ϴ�");
			return false;
		}
		System.out.println("gas�� �ֽ��ϴ�");
			return true;
	}
	void run() {	//���Ϲ��� ���� void Ÿ���� �޼ҵ�
		while(true) {
			if(gas>0) {
				System.out.println("�޸��ϴ�.(gas�ܷ� :"+gas+")");
				gas -=1; //gas--;
			}else {
				System.out.println("����ϴ�.(gas :"+gas+")");
				return;	//���⼭�� return ���� ������ ���� �����ϴ� �뵵�� �ƴϰ� ,
						//�޼ҵ��� ������ �����ϴ� ����
			}
		}
	}
}
