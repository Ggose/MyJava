package p01.operations;

public class NotOperExample1 {

	/*
	 * 논리연산 부전 |
	 * -true = false , false -> true
	 * -조건문 if()는 ()안의 값이 true,()안의 식의 결과가 true이면true
	 */
	public static void main(String[] args) {
		
		boolean stop = false; //초기값이 false
		
		if(!stop) {		//stop값으 true가 된다. !+false =>true
			System.out.println("정지");
		}else {
			System.out.println("진행");
		}
		
		//(false!=true)의 결과는 true
		if(stop!=true) {	//stop == true=> stop != true
			System.out.println("정지");
		}else {
			System.out.println("진행");
		}
		
	}
}
