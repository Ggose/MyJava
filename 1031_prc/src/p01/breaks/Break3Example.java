package p01.breaks;
/*
 * break��
 */
public class Break3Example {

	public static void main(String[] args) {
		
		int i = 0; int j = 0;
		while(true) {//�ٱ��� while()����
			i++;
			while(true) {//���� while�� ����
				System.out.println(j+"\t");
				if(j==5)break;//���� while�� ���� j++���������ʰ� ����������
				j++;
			}//���� while�� ��
			System.out.println("i ="+i);
			if(i==10)break;//�ٱ� while�� ����
		}//�ٱ��� while�� ��
		System.out.println("����");
	}
}
