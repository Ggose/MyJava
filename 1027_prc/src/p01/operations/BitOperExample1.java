package p01.operations;
/*
 * 비트연산자(&,|,^,~)
 */
public class BitOperExample1 {

	public static void main(String[] args) {
		int num1 = 0xFFFF0000;
		int num2 = 0XFF00FF00;
		
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		System.out.println(Integer.toBinaryString(num1));
		System.out.println(Integer.toBinaryString(num2));
		
		
		
		System.out.println(Integer.toBinaryString(num1&num2));
		System.out.println(Integer.toBinaryString(num1|num2));
		System.out.println(Integer.toBinaryString(num1^num2));
		System.out.println(Integer.toBinaryString(~num1));
		System.out.println(Integer.toBinaryString(~num2));
	}
}
