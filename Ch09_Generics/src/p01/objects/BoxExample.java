package p01.objects;
/**
 * 범용적 프로그램은 다용도로 사용하는 장점
 * - Casting이 일어나므로 실행속도가 떨어짐
 * - 작업의 일관성이 떨어짐
 * */
public class BoxExample {
	public static void main(String[] args) {
	 //객체 생성
		Box box = new Box();
		box.set("홍길동");
		String name = (String)box.get();//Object타입으로 리턴된 객체를 String타입으로 Casting해야하는 불편함 발생
		System.out.println(name);
		
		box.set(new Apple());
		Apple apple = (Apple)box.get();//Object타입->Apple타입
		System.out.println(apple);
		
		

	}

}
