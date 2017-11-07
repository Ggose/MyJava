package p03.methods;
/*
 * 동일 클래스내의 메소드 호출
 * -외부객체에서 매소드호출시 참조변수.메소드명()하지않고.
 * 메소드명()으로 호출 ,결과값을 사용할수도 있음
 */
public class Calculator2 {

	//int타입
	int plus(int x, int y) {
		int result = x+y;
		return result;
	}
	//dobule타입
	double avg(int x, int y) {
		double sum = plus(x,y); //동일클래스내의 plus()메소드 호출
		double result = sum/2;
		return result;
	}
	//void타입
	void execute() {
		double result = avg(7,10);//동일클래스내의 avg()메소드 호출
		println("실행결과 :"+result); //동일클래스내의 println()메소드 호출
	}
	//void타입 
	void println(String message) {
	System.out.println(message);	
	}
}
