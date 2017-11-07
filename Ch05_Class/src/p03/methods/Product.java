package p03.methods;

public class Product {

	//필드
	//static 필드는 주로 공용으로 상용되는 경우 선언
	static int count = 0; //static필드 (정적)
	int seriaNo;	//instance필드 
	//초기화 블럭
	{
		
		++count;	//count를 1증가 후
		seriaNo = count;//인스턴스 변수인 seriaNo에 대입 
	}
	//생성자
	Product(){}
	//메소드
	void print() {
		System.out.println("count = "+count);
	}
}
