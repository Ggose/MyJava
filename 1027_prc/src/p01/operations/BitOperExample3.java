package p01.operations;
/*
 * ��Ʈ���� - shift(<<,>>,>>>)
 */
public class BitOperExample3 {

	public static void main(String[] args) {
		
		int num1 = 0xFF00FF01;
		System.out.println("num1 = "+Integer.toBinaryString(num1));
		int result1 = num1<<3;	//�������� 3bit�̵� ������ 3bit�� 0 ���� ä����
		int result2 = num1>>3;	//���������� 3bit�̵� ����3bit�� ��ȣ bit�� ä����
		int result3 = num1>>>3;	//���������� 3bit�̵� ���� 3bit�� 0���� ä����.

		System.out.println("result1 = "+Integer.toBinaryString(result1));
		System.out.println("result2 = "+Integer.toBinaryString(result2));
		System.out.println("result3 = "+Integer.toBinaryString(result3));
		
		//printf
		System.out.printf("%08x %n",result1);
		System.out.printf("%08x %n",result2);
		System.out.printf("%08x %n",result3);

	}
}
