package p01.multithread;

public class A1Example {

	public static void main(String[] args) {
		A a1 = new A("sumA");// Thread객체 생성 -subA
		A a2 = new A("subB"); // Thread객체 생성 - subB;

		// Thread의 run()메소드 실행을 요청하는 메소드 start();
		a1.start();
		a2.start();
		for (int i = 1; i <= 100; i++) {
			System.out.print("main" + i + "\t");// getName()현재 실행중인 thread의 이름 리턴메소드
			if (i % 10 == 0)
				System.out.println();
			try {
				Thread.sleep(100); // 0.1초간 일시 정지
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
