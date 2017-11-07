package p03_singletone;

public class Singletone1Example {

	public static void main(String[] args) {
		//SingleTon obj1 = new SingleTon(); //생성자에 접근할수 없으므로 오류발생
		SingleTon obj2 = SingleTon.getInstance();
		SingleTon obj3 = SingleTon.getInstance();

		if(obj2 == obj3) { 
			System.out.println("같은 Singletone객체 입니다");
		}else
			System.out.println("다른 Singletone객체 입니다.");
	}
}
