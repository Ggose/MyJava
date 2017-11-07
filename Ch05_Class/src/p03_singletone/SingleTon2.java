/*	
 * 패키지
 * 클래스의 경로명 src.po3.singletone.SingleTon2.class
 * 
 */
package p03_singletone;

public class SingleTon2 {
	//singleton 방법 2
	//필드
	private static SingleTon2 instance;  //필드 선언하고
	private SingleTon2() {}
	public static SingleTon2 getInstance() {
		if(instance !=null)instance = new SingleTon2();  //있는지 없는지 확인하고 그다음 만드는것
		return instance;
	}
}
