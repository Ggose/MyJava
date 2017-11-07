package p02.enums;

import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] args) {
		  //���Ű�ü ����
			Week today = null; //today�� ����Ÿ���� ��������
			
			//Calendar�� �� PC�� �ý���Ÿ���� �����Ͽ� ���� ������ ��¥�� �����ϴ� ��ü
			Calendar cal = Calendar.getInstance();//Ķ������ü�� ����
			int week = cal.get(Calendar.DAY_OF_WEEK);//Calendar��ü�κ��� ���� ������ ����.
			
			
			//Calemdar��ü����
			//������ ������ 1�� �Ͽ���, 2�� ������, 3�� ������...., 7�� ����� ��.
			
			System.out.println("week�� ��ȣ:"+week);
			String str = "";
			switch(week) {
			case 1: today=Week.SUNDAY;
					str="�Ͽ���";
					break;
			case 2: today=Week.MONDAY;
					str="������";
					break;
			case 3: today=Week.TUESDAY; 
					str="ȭ����";
					break;
			case 4: today=Week.WEDNESDAY; 
					str="������";
					break;
			case 5: today=Week.THURSDAY;
					str="�����";
					break;
			case 6: today=Week.FRIDAY; 
					str="�ݿ���";
					break;
			case 7: today=Week.SATURDAY;
					str="�����";
					break;
			}
			
			System.out.println("������ ������:"+today);
			System.out.println("������ ������:"+str);
			
			if(today == Week.SUNDAY) {
				System.out.println("������ ���ϴ�..!");
			}
			
			else {
				System.out.println("������ ���θ� �մϴ�..!");
			}
				
			
			
			
			
			
		}
}
