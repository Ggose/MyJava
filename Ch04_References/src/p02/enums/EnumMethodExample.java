package p02.enums;

/* *
 * ������ Ÿ���� �޼ҵ� ���
 * */


public class EnumMethodExample {

	public static void main(String[] args) {
		// name()�޼ҵ�    
		// sunday�� �������
		// week�� ������ Ÿ��
		// ������ ����
		
		
		Week today = Week.SUNDAY; //������ ������ ���� �� �ʱ�ȭ
		String name = today.name();
		System.out.println(name);
		
		
		//ordinal()�޼ҵ� - ������ ����� index���� ����
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		
		//compareTo()�޼ҵ�
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		
		int result1 = day1.compareTo(day2); //�ڽ��� �񱳴����� ������
		int result2 = day2.compareTo(day1);
		
		//compareTo()�� �����
		//�������� ����
		//a.compareTo(b); a<b �̸� ���� �� ����(a,b ���� �Ӽ� ������ ��)
		//				  a==b�̸� 0�� ����
		//				  a>b�̸� ���� �� ����
		System.out.println(result1);
		System.out.println(result2);
		
		
		//valueOf()�޼ҵ�
		   if(args.length==1) {
			   String strDay = args[0];
			   Week weekDay = Week.valueOf(strDay);
			   
			   if(weekDay ==Week.SATURDAY||weekDay==Week.SUNDAY) {
				   System.out.println("�ָ��Դϴ�.");
			   }
			   
			   else {
				   System.out.println("�����Դϴ�");
			   }
		   }
		
		   
		//values()�޼ҵ�
		Week[] days = Week.values();
		for(Week day:days) {
			System.out.print(day+ "\t");
		}
		   
   
	}
}
