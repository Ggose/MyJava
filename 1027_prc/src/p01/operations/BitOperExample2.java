package p01.operations;
/*
 * 비트연산
 * -자바의 특성상
 * 두 피연산자가 모두 int타입보다 좁은 타입이면 둘다 int타입으로 자동형변환 한 후 연산이 처리됨	
 * &,| 비트연산자를 하면 int 형을변환된다.
 */
public class BitOperExample2 {

	public static void main(String[] args) {
		byte num1 = 1,num2 = 2;
		short num3 = 3;
		char ch = 'A';
		
		byte result = (byte) (num1 & num2); //byte타입 & byte타입의 결과는 int.
		short result2 = (short) (num2 | num3);//byte타입 | byte타입의 결과는 int
		int result3 = num3^ch;	//short^char 의 결과는 int
		byte result4 = (byte) ~num1;	//~byte의 결과는 int
	}
}
