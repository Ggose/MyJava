package p01.classes;

public class StudentExample1 {

	/*
	 * ����� Ŭ������ instance�� new ������(); �� ���� ���������
	 * ������ instance�� �Ӽ�,�޼ҵ忡 ���� �ϱ� ���ؼ���
	 * �����ϴ� ����.�Ӽ�,����.�޼ҵ�()�� ������
	 */
	public static void main(String[] args) {
		Student student; //student�� null���� ����
		student = new Student(); // Student ��ü(instance) ������ ������
		
		student.name = "ȫ�浿"; //������ instance�� �Ӽ����� ��������.�Ӽ�
		student.num = 10;
		student.namePrint(); //������ instance�� �޼ҵ� ���� ��������.�޼ҵ�
		student.numPrint();
	}
}
