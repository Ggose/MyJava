package p01.fors.exam;

public class ForExample6 {

	public static void main(String[] args) {
		for(int i = 1; i<=10;i++) {
			int num1 = (int)(Math.random()*6+1);
			int num2 = (int)(Math.random()*6+1);
			int total = 0;
			//System.out.println("num1 = "+num1);
			//System.out.println("num1 = "+num2);
			
			total = num1+num2;
			//System.out.println("num1+num2 = "+(num1+num2));
			
			//�μ��� ���� 6�϶��� ��µǵ���
			
			if(total ==6) {
				System.out.println(num1+"��"+num2);
				System.out.println("���� = "+total);
			}
			
		}
	}
}
