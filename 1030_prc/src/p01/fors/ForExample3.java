package p01.fors;

public class ForExample3 {

	public static void main(String[] args) {
		for(int i= 0;i<=10;i++) //�ʱⰪ 0 , ������ : 10 , ����
			System.out.println(i+"\t");//tab��ŭ ���鼭 ���
	
		System.out.println();//�ƹ��͵� ��������ʰ� ���ο��ٷ� �̵�
		
		for(int i=10;i>=0;i--) {	//�ʱⰪ 0 , ������ 0,�����ϴ� ������
			
			System.out.println(10-i+"\t");
		}
		System.out.println();
		
		for(int i=0;i<=10;i+=2) { //2�� ���� i = i+2;
			System.out.println(i+"\t");
		}
		System.out.println();
		for(int i =1; i<=10;i*=2) { //i = i*2
			System.out.println(i+"\t");
		}
	
	}
}
