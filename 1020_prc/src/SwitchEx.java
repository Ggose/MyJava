
public class SwitchEx {
	public static void main(String args[]) {
		
		int month = 2;
		switch(month) {
		
		case 1:
			System.out.println("1���� ���");
			break;
		case 2:
			System.out.println("2���� ���");
			break;
		case 3:
			System.out.println("3���� �����ϴ�");
			break;
		default :
			break;
		}
		
		String str = "������ ��";
		switch(str) {
		
		case "�߿� ��":
			System.out.println("1��,2��");
			break;
		case "������ ��":
			System.out.println("3,4��");
			break;
		default :
			break;
			
		}
		
		if(month ==1) {
			System.out.println("1���� ���");
		}
		else if(month == 3) {
			System.out.println("3���� �����ϴ�");
		}
		else {
			System.out.println("�߸� �Է�");
		}
	}
}
