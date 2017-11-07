package p03.dataTypes;

/*
 * 데이터 타입
 * -자바 프로그램에서 연산은 반드시 동일한 타입끼리 연산을 해야함.
 * 연산은 반드시 동일한 타입끼리 연산을 함.
 * -변수 선언시 초기값으로 입력한 값을 literal이라고함.
 * literal도 데이터타입을 가짐
 * -연산증가값도 타입을 가짐,연산중간결과도 타입 변환됨.
 * 타입변화될때는 작은 타입데이터 타입이 큰 데이터 타입으로 자동변환됨.
 * byte->short->int->long->
 */
public class DataType3Example {

	public static void main(String[] args) {
		
		double result;
		int a= 1;	//'='산자 1 이라는 정수타입의 리터럴을 정수타입의 변수 a에 대입하라는 의미
		int b=2;	//연산자(=)를 기준으로 왼쪽과 오른쪽 타입이 같아야 한다.
		double c= 0.5;//0.5더블타입값을 더블타입의 변수 c에 대입하라는 의미
		result =(a+b)*c;	//int타입 a와b가 연산을 함.
							//()안의 연산을 한 결과는 int값과*연산을 하는 c는 double임.
							//*연산을 기준으로 왼쪽은 int  오른쪽은 double
							//이때 int가 double로 타입이 자동변경된다.
							//double*double형식으로 바뀌어서 double이 됨.
		System.out.println("result ="+result);
	}
}
