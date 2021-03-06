package p09_ploymorph3;

/*
 * interface가 있는 경우
 * 응집도 : 같은 클래스내에서 맴버 변수와 메소드사이의 관계
 * 		-응집도가 높으면 관계가 서로 잘 엮어있다.
 * 결합도 : 두 클래스간의 관계
 * 		-객체지향 프로그램에서 결합도는 느슨해야함(loosely coupled)
 * A클래스가 B클래스를 사용관계 A가 B에 의존.
 * A와B의 관계를 느슨하게 하려면 (결합도를 낮춤)Interface를 이용하여 
 * 관계를 맺음
 *  */
public class Inter5 {

	public static void main(String[] args) {
		
		H1 h1 = new H1();
		H2 h2 = new H2();
		Test test = new Test();
		
		test.autoPlay(h1);
		test.autoPlay(h2);
	}
}
interface I{
	void play(); //추상 메소드 메소드를 호출하는 방식은 매개변수없이 호출
}
class Test{
	void autoPlay(I i) { //메소드의 매개변수로 인터페이스를 받음
		i.play();
	}
}

class H2 implements I{

	@Override
	public void play() {
		// TODO Auto-generated method stub
	System.out.println(" A메소드");	
	}
	
}
class H1 implements I{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("B메소드");
	}
	
}
