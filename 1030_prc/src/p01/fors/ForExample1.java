package p01.fors;

public class ForExample1 {

	public static void main(String[] args) {
		//1~10������ �� ���ϱ�
		int sum=0;
		for(int i= 1; i<=10;i++) {
			sum+=i;
		}
		System.out.println("sum = "+sum);
		
		int j =1;//�ʱ��
		for(;j<=10;) { //if(i<=1)�� true�̸� ���� ->while(j<=10){}
			sum = sum+j;
			j++; //������
			
		}
		
	}
}
