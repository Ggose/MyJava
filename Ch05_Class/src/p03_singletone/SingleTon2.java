/*	
 * ��Ű��
 * Ŭ������ ��θ� src.po3.singletone.SingleTon2.class
 * 
 */
package p03_singletone;

public class SingleTon2 {
	//singleton ��� 2
	//�ʵ�
	private static SingleTon2 instance;  //�ʵ� �����ϰ�
	private SingleTon2() {}
	public static SingleTon2 getInstance() {
		if(instance !=null)instance = new SingleTon2();  //�ִ��� ������ Ȯ���ϰ� �״��� ����°�
		return instance;
	}
}
