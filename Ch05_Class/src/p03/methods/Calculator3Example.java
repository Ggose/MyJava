package p03.methods;

public class Calculator3Example {

	public static void main(String[] args) {
		Calculator3 myCal = new Calculator3();
		
		double result1;
		double result2;
		result1 = myCal.areaRectagl1(10);
		result2 =myCal.areaRectagl1(10,20);
		
		System.out.println("���簢����  ���� : "+result1);
		System.out.println("���簢����  ���� : "+result2);
	}
}
