package p01_ifs;


public class If2Example {
/*
 * 
 */
	public static void main(String[] args) {
		int a = Integer.parseInt(args[2]); //main�� �Ű����� ��
		
		if(a>0) {
			System.out.println(a+"�� �������� �Դϴ�.");
		}
		else {
			System.out.println(a+"�� �����Դϴ�.");
		}
		System.out.println(a+"�� ���밪��"+Math.abs(a)+"�Դϴ�.");
	}
}
