package p03_singletone;
/*
 * Singletone ���
 *  - ��ü�� ������ ���� �ϳ��� instance�� �����Ͽ� 
 *    �ʿ�� ����ϰ� �ǵ����ִ� ����� Ŭ������������
 *    
 *    //�ϳ��� ��ü�� �������⶧����  ,�޸� ������ �پ���,������ ������ ������ ����
 */
public class SingleTon {
//singleton ��� 1
	//�ʵ� 
	private static SingleTon instance = new SingleTon();
	private SingleTon() {} //�����ڴ�  private�� ���������� ���־ �ܺο��� ��ü�� �����Ұ���.
	
	static SingleTon getInstance() {
		return instance;
	}
}
