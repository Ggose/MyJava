package p10.annoymous;

public class P2 extends Person {
	void wake() {//재정의
		System.out.println("6시에 일어납니다.");
		work();
	};
	void work() {//추가
		System.out.println("출근합니다.");
	}
}
