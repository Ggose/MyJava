package p01.annotaions;
/* annotaiont 적용하기
 * - RUNTIME시 특정기능 자동 실행
 * */
public class Service {
	//어노테이션에 매개값이 없으면 default인 "-" 가 15회 출력
	@PrintAnnotaion
	public void method1() {
		System.out.println("실행 내용");
	}
	//어노테이션에 매개값이 하나 표시되어있으면 해당 값으로 바뀌값으로("*")로 15회 출력
	@PrintAnnotaion("*")
	public void method2() {
		System.out.println("실행내용");
	}
	// value ="#"바뀌고, 20출력
	@PrintAnnotaion(value="#",number=20)
	public void method3() {
		System.out.println("실행내용");
	}
}
