package p01.breaks;
/*
 * break��
 */
public class Break2Example {

	public static void main(String[] args) {
		float f = 1252;
		System.out.println(f);
		double d = 25.5;
		System.out.println(d);
		int num=0,sum=0;
		
		while(true) {
			num++;
			sum+=num;
			if(num==100)break;	//while()���� �������������� ��ɹ�
		}
		System.out.println("�հ� "+sum);
		System.out.println("����");
	}
}
