package p01.multithread;

public class MultiThreadExample {

	public static void main(String[] args) {
		
		//객체생성
		G1 g1 = new G1();
		//thread 실행 메소드 start();  -> run(){}이 실행
		g1.start();	
		//객체 생성
		G2 g2 = new G2();
		//Thread객체 생성
		//Runnable로 구현된 Thread객체는
		//Thread생성자의 매개변수로 넘어가서 
		//Thread객체가 됨
		Thread th1 = new Thread(g2,"g2");
		//start()로 JVM에게 run()메소드의 실행을 요청
		th1.start();
	}
}
//Thread클래스를 상속받은 Thread객체
class G1 extends Thread{
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.print("+");
		}
		System.out.println();
	}
}
//Runnable을 구현한 Thread객체
class G2 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			System.out.print("-");
		}
		System.out.println();
	}
		
	}

	
	
