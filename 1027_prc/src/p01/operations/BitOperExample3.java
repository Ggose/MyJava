package p01.operations;
/*
 * 비트연산 - shift(<<,>>,>>>)
 */
public class BitOperExample3 {

	public static void main(String[] args) {
		
		int num1 = 0xFF00FF01;
		System.out.println("num1 = "+Integer.toBinaryString(num1));
		int result1 = num1<<3;	//왼쪽으로 3bit이동 오른쪽 3bit는 0 으로 채워짐
		int result2 = num1>>3;	//오른쪽으로 3bit이동 왼쪽3bit는 부호 bit로 채워짐
		int result3 = num1>>>3;	//오른쪽으로 3bit이동 왼쪽 3bit는 0으로 채워짐.

		System.out.println("result1 = "+Integer.toBinaryString(result1));
		System.out.println("result2 = "+Integer.toBinaryString(result2));
		System.out.println("result3 = "+Integer.toBinaryString(result3));
		
		//printf
		System.out.printf("%08x %n",result1);
		System.out.printf("%08x %n",result2);
		System.out.printf("%08x %n",result3);

	}
}
