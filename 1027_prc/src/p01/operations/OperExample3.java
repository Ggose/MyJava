package p01.operations;

/*
 * 증감 연산자-증강,감소하는 연산자
 * 증감연산자는 피연산자의 왼쪽/오른쪽 위치에 따라 증가되는 순서가 달라진다.
 * 예) ++x인 경우 : 먼저 1증가 후의 값이 연산이됨.
 * 	   x++인 경우 : 이전값으로 연산후에 1만큼 증가됨
 * 
 */
public class OperExample3 {

	public static void main(String[] args) {
		
		int x= 0,y=0;		//초기값 x = 0 ,y =0;
		System.out.println(x++);	//x = 0
		System.out.println(y++);	//y = 0
		System.out.println((x++)+(y++)); //x=1,y=1
		System.out.println((++x)+(++y));//x=3,y=3;
		System.out.println(x-y); //0
		
		//위에꺼랑 같은 의미
		x=0; y=0;
		System.out.println(x=x+1);
		System.out.println(y=y+1);
		
		System.out.println(x+y);
		System.out.println(x=x+1);
		System.out.println(y=y+1);
		
		System.out.println((x=x+1)+(y=y+1));
		
		int family =150;
		System.out.println("홍길동네 집에는 가족이 "+ ++family+"명 산다");
	}
}
