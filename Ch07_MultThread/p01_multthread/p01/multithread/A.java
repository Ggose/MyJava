package p01.multithread;

/*
 * MultiThread Thread
 */
public class A extends Thread {

	A(String str) {
		super(str);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.print(getName() + i + "\t");// getName()현재 실행중인 thread의 이름 리턴메소드
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
