package p01.operations;

public class NotOperExample1 {

	/*
	 * ������ ���� |
	 * -true = false , false -> true
	 * -���ǹ� if()�� ()���� ���� true,()���� ���� ����� true�̸�true
	 */
	public static void main(String[] args) {
		
		boolean stop = false; //�ʱⰪ�� false
		
		if(!stop) {		//stop���� true�� �ȴ�. !+false =>true
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		
		//(false!=true)�� ����� true
		if(stop!=true) {	//stop == true=> stop != true
			System.out.println("����");
		}else {
			System.out.println("����");
		}
		
	}
}
