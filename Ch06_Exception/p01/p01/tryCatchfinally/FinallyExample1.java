package p01.tryCatchfinally;
/*
 * try ~ catch~ finally
 * --실행할 명령문은 try{} 에 기술
 * --예외 처리는 catch(){}에 기술
 * --finally{}에는 p/g 종료시 반드시 처리해야하는 명령문 기술
 * --finally{}에 명령문을 기술하면
 *  program이 정상종료 되거나 예외발생하여 비정상 종료가 되어도 
 *  finally{}절은 반드시 처리하고 종료됨
 */
import javax.management.RuntimeOperationsException;

public class FinallyExample1 {

	static void method(boolean b) {
		
		try {
			
			System.out.println(1);
			//if(b) == if(b==true)
			if(b) throw new ArithmeticException();	//RuntimeException을 상속받은 Exception()이다
			System.out.println(2);
		}catch(RuntimeException re) {	//catch()절을 여러개 연결하여 사용가능
			//이때 우선순위는 최상위 예외객체가 가장 아래로 가게 함.
			System.out.println(3);
			return;	//메소드의 return 문은 더이상 진행을 하지 않고 호출한쪽으로 제어가 이동됨(메소드가 종료)
		}catch(Exception e) {
			System.out.println(4);
			return;
		}finally {//finally절은 반드시 처리해야하는 명령문 기술
			System.out.println(5);
			
		}
		System.out.println(6);
	}

	public static void main(String[] args) {
		
		//method(true); //비 정상처리
		method(false); //정상처리
	}

}
