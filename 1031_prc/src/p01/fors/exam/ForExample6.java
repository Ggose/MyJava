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
			
			//두수의 합이 6일때만 출력되도록
			
			if(total ==6) {
				System.out.println(num1+"과"+num2);
				System.out.println("합은 = "+total);
			}
			
		}
	}
}
