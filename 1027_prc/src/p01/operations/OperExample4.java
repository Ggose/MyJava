package p01.operations;
/*
 * 비교연산자 (==,!=,>,<,>=,<=)
 */
public class OperExample4 {

	public static void main(String[] args) {
		//수치연산
		System.out.println(4<3);	//리터럴<리터럴 => true/false
		System.out.println(10>20.0);//리터럴>리터럴 => true/false
		System.out.println(12.5f<=11);//리터럴<=리터럴 => true/false
		System.out.println(7>=7);//리터럴<리터럴 => true/false
		//비교연산자(==)
		int num1= 5;//리터럴5
		int num2=2+3;//리터럴2+리터럴3의 연산결과가 num2에 대입
		
		if(num1==num2)	//if()문내의 연산(==)의 결과가 true
			System.out.println("num1 과 num2가 같다");
		else
			System.out.println("같지 않다");
		
		if((num1!=num2)==false)	//결과는 true
			System.out.println("num1과 num2는 다르다고 할수 없다");
		
		double num3 = 1.1+2.2;	//double타입의 literal1.1과 2.2의 덧셈연산의 결과값을 num3의 대입
		double num4 = 3.3;
		
		if(num3==num4)	//if()num3==num4의 결과값이 true이면 "같음",false이면 "다음"
			System.out.println("같음");	//if문의 {}블러내의 명령문이 하나이면 생략가능
		else
			System.out.println("다음");
		
		int a=3,b=4,c=3,d=5;
		if((a==2|a==c)&!(c>d)&(1==b^c!=d))
			System.out.println("true");
		else
			System.out.println("false");
		
		System.out.println(a==2|a==c);
		System.out.println(!(c>d));
		//System.out.println(1==b^c);
		
		
	}
}
