package p02.varaiables;
/*
 * -static �޼ҵ忡�� ���� ������ �ݵ�� static ���� ����Ǿ����,
 * -Ŭ���������� ����� ���������� �ʱ�ȭ ���������� �ش� ������ Ÿ���� �ʱⰪ���� �ʱ�ȭ��
 * int �� 0, String��  null ,�迭 null�� �ʱ�ȭ��.
 * - ���� ���� �޼ҵ� ������ ����Ǵ� �������� �ݵ�� �ʱ�ȭ �������.
 */
public class VariableScopeEx2 {

	//�������� ����
	static int i;	//instance����,���������� �ʱ�ȭ�� ���������� �ش絥���� Ÿ���� �ʱⰪ���� �ʱ�ȭ ��.
	
	public static void main(String[] args) {
	
	//���ú���
	int j = 0;
	System.out.println("i = "+i);	//�����߻� 
	System.out.println("j ="+j);
		
	}
}
