package p01.breaks;

public class Break4Example {

	/*
	 * ���� �ݸ��� ���������� break;��
	 * Lable : �� ������ break; Lable
	 */
	public static void main(String[] args) {
		int i= 0;
		int j = 0;
		
		kk:while(true) {
			i++;
			while(true) {
				System.out.println("j="+j+"\t");
				if(j==5)break kk; //���� kk�� ����� �ݺ����� �ھ
				j++;
			}
			//System.out.println("i="+i);
			//if(i==10)break;
		}
		System.out.println("����");
	}
}
