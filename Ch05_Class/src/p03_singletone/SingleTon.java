package p03_singletone;
/*
 * Singletone 방식
 *  - 객체의 생성을 막고 하나의 instance만 생성하여 
 *    필요시 사용하고 되돌려주는 방식의 클래스생성운영방식
 *    
 *    //하나의 객체로 돌려쓰기때문에  ,메모리 공간도 줄어들고,동일한 데이터 유지에 좋다
 */
public class SingleTon {
//singleton 방법 1
	//필드 
	private static SingleTon instance = new SingleTon();
	private SingleTon() {} //생성자는  private로 접근제한이 되있어서 외부에서 객체를 생성불가능.
	
	static SingleTon getInstance() {
		return instance;
	}
}
