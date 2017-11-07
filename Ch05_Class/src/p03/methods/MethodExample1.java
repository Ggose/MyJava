package p03.methods;
/*
 * ...
 * 매개변수로 ...를 사용하면
 * 여러개의 동일한 데이터를 매개변수로 받기위해서는
 * 배열을 생성하는 문장이 있어야 하는데,
 * ...를 사용하면 배열을 만들지 않고도 실행시에
 * 값을 여러개 입력하여 결과를 리턴받을 수 있음.
 */
public class MethodExample1 {

	public static void main(String[] args) {
		
		Computer com = new Computer(); //instance생성
		int [] intArr = new int[5]; //5개의 int타입의 값을 저장
		for(int i=0;i<intArr.length;i++)
			intArr[i]=++i;
		int sum= 0;
		sum = com.sum1(intArr); //호출
		System.out.println("결과 : "+sum);
		
		int result = com.sum2(1,2,3,5,4,8);
		System.out.println("결과 :"+result);
	}
}
class Computer{
	//메소드 - 리턴타입 메소드명(매개변수){실행부;리턴문}
	int sum1(int []values) {	//배열객체가 매개변수로 넘어옴
		int sum = 0;
		for(int i = 0; i<values.length;i++)
			sum+=values[i];
		return sum;
		}
		//동일한타입의 값을 매개변수로 받을때
		//값의 갯수가 정해져있지 않을 경우?
		//매개변수의 갯수가 정해져있지않으므로 호출시에
		//매개변수의 갯수만큼의 배열이 생성딤
	int sum2(int ... values) {	//배열객체가 매개변수로 넘어옴
		int sum = 0;
		for(int i = 0; i<values.length;i++)
			sum+=values[i];
		return sum;
		}
	}

