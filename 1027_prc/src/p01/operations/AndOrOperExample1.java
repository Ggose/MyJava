package p01.operations;

/*
 * or연산
 * -| :왼쪽피연산자의 값이 true이더라도 오른쪽 피연산자의 값을 연산 후 | 연산을 함 
 *- || : 왼쪽피연산자가 true이면 or연산의 특성상 오른쪽 피연산자의 true/false
 *		 여부와 상관없이 true이므로 연산을 중단하고 다음명령을 싱행한다.
 *		T or T = T 
 *		T or F = T
 *		F or T = T
 *		F or F = F
 */
public class AndOrOperExample1 {

	public static void main(String[] args) {
		
		int num1=0,num2=0;
		
		if(++num1>0 | ++num2>0)	//왼쪽 1증가>0 : true , 오른쪽 1 증가 >0 : true  트루이므로 다음명령어 실행
			System.out.println("num1이 0보다크거나 num2가 0보다 큽니다. ");
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		
		num1=0;
		num2=0;
		
		if(++num1>0||++num2>0)
			System.out.println("num1이 0보다 크거나 num2가 0보다 큽니다.");
		System.out.println("num1 ="+num1);
		System.out.println("num2 ="+num2);
		
	}
}
