package p03.dataTypes;

public class DataTypesExample {

	/*
	 * 데이터 타입 
	 * -기본데이터 타입
	 */
	public static void main(String[] args) {
		
		//로컬변수
		byte var1 = 127;//byte타입-길이 1byte
		char  c= 'A';//char타입-길이 2byte
		int a = 100;//int타입 4byte
		double d = 34.53;//double타입 8byte
		
		System.out.println(var1+1);//byte타입의 값 과 int타입의 값 1의 연산
		System.out.println(c);//오류발생 변수의 타입 범위를 벗어난 값이 대입되므로 오류
		System.out.println(a);
		System.out.println(d);
		//데이터 타입의 범쉬
		System.out.println(Byte.MIN_VALUE+"<=byte타입의 값의 범위<="+Byte.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE+"<=int타입의 값의 범위<="+Integer.MAX_VALUE);
		System.out.println(Double.MIN_VALUE+"<=double타입의 값의 범위<="+Double.MAX_VALUE);
		System.out.println(Float.MIN_VALUE+"<=float타입의 값의 범위<="+Float.MAX_VALUE);
	}
}
