package p03.dowhile;
/*
 * do~while(���ǽ�);
 * -while���� ���
 * ���� 1ȸ ���� �� ���� �˻縦 ��
 * 

 */
public class Do1Example {

	public static void main(String[] args) {
		int sum=0,i=1;
		
		do {
			
			sum = sum+i; //�հ���ϱ� ���๮
			i++;	//i������

			System.out.println("i"+i);
		}while(i<=10); //i�� 10���� �۰ų� ���� ��� �ݺ�
	
		System.out.println("i"+i);
		System.out.println("sum�ɰ� :"+sum);
	}
}
