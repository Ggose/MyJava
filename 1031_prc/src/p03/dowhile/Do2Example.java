package p03.dowhile;
/*
 * ���� ~do ~while()��
 */
public class Do2Example {

	public static void main(String[] args) {
		int i = 1, j =2;
		
		do {
			do {
					System.out.print(j+"x"+i+"="+j*i+"\t");
					j++;//������
			}while(j<=9); //���ǽ�
			System.out.println();
			i++;//�ٱ��� do while���� ������
			j=2;//���� do~while()���� ���� ���� j �ʱ�ȭ
		}while(i<=9);
		System.out.println("i ="+i);
	}
}
