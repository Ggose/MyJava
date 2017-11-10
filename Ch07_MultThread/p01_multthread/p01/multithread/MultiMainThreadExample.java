package p01.multithread;
/*
 * 멀티쓰레드 객체를 만드는 방법
 * 1.Thread클래스를 상속받아서 생성
 * 2.Runnable인터페이스를 구현한 구현체를
 * 	 Thread클래스의 생성자의 매개변수로 넘겨서
 * 	생성
 * -멀티쓰레드 실행
 * 	-생성된 Thread는 run()메소드가 재정의된 구현체 
 * 	-실행은 start()메소드로 실행
 *  -start()메소드는 Thread의 run()메소드의 실행을 요청
 */
public class MultiMainThreadExample {

	public static void main(String[] args) {

		// MultiSub1 구현 객체 생성
		// MultiSub2 구현 객체 생성
		
		MultiSub1 mult1 = new MultiSub1();
		
		MultiSub2 mult2 = new MultiSub2();
		
		Thread t1 = new Thread(mult2,"mult2");
		
		mult1.start();
		t1.start();

		for (int i = 0; i < 2000; i++) {
			System.out.println("+");
		}
		System.out.println();
	}
}

class MultiSub1 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 20; i++)
			System.out.println("-");
		System.out.println();
	}

}

class MultiSub2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 20; i++)
			System.out.println("*");
		System.out.println();
	}

}
