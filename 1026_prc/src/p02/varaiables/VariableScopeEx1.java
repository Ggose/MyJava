package p02.varaiables;

/*������ scope
 * -Ŭ���� ���� : ����  ����
 * -�������� : static����/instance����
 * -static������ �޸��� static(�޼ҵ�)������ �ε�ǰ�,
 * instance������ Ŭ������ instance��ü�� ��������� ����Ҽ� �ִ� ����
 * -���� : static������ Ŭ������.������ �����ϰ�,
 * instance������ 
 * 
 * 
 */






public class VariableScopeEx1 {
	//�Ű��������� default ������
	VariableScopeEx1(){}
	
	static int a; //��������,static����(��ü�� �������� ��밡��)
	int f;	//�������� , instance����(�ݵ��,��ü�� ���� �� ��밡��)
	//�޼ҵ�
	public static void main(String[] args) {	//�޼ҵ� ��� ����
		
		
		int v1= 15;	//���� ����
		int v2 = 0;
		
		if(v1>10) {	//��� ����� ����
			v2 = v1-10;
			System.out.println(v2);	//��� ��� ��
		}
		int v3 = v1+v2+5;
		
		System.out.println(v3);
		System.out.println(v1);
		System.out.println(VariableScopeEx1.a); //static ������ ��ü�� ���� Ŭ������.���������� ����
		VariableScopeEx1 ve = new VariableScopeEx1(); 	//��ä ���� 
		System.out.println(ve);
		System.out.println(ve.f);	//instance ������ �����ϱ� ���ؼ� ������ ��ü�� ��������.���������� ����
		
		
	}//�޼ҵ� ��
}//Ŭ���� ��
