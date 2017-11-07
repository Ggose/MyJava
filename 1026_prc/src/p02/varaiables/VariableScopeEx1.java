package p02.varaiables;

/*변수의 scope
 * -클래스 변수 : 전역  변수
 * -전역변수 : static변수/instance변수
 * -static변수는 메모리의 static(메소드)영역에 로드되고,
 * instance변수는 클래스가 instance객체로 만들어져야 사용할수 있는 변수
 * -접근 : static변수는 클래스명.변수로 접근하고,
 * instance변수는 
 * 
 * 
 */






public class VariableScopeEx1 {
	//매개변수없는 default 생성자
	VariableScopeEx1(){}
	
	static int a; //전역변수,static변수(객체의 생성없이 사용가능)
	int f;	//전역변수 , instance변수(반드시,객체를 생성 후 사용가능)
	//메소드
	public static void main(String[] args) {	//메소드 블록 시작
		
		
		int v1= 15;	//로컬 변수
		int v2 = 0;
		
		if(v1>10) {	//제어문 블록의 시작
			v2 = v1-10;
			System.out.println(v2);	//제어문 블록 끝
		}
		int v3 = v1+v2+5;
		
		System.out.println(v3);
		System.out.println(v1);
		System.out.println(VariableScopeEx1.a); //static 변수는 객체를 생성 클래스명.변수명으로 접근
		VariableScopeEx1 ve = new VariableScopeEx1(); 	//객채 생성 
		System.out.println(ve);
		System.out.println(ve.f);	//instance 변수에 접근하기 위해서 생성자 객체의 참조변수.변수명으로 접근
		
		
	}//메소드 끝
}//클래스 끝
