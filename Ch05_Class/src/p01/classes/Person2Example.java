package p01.classes;

public class Person2Example {
/*
 * -����ȭ(encapsulation)
 * ��ü�� �Ӽ��� ��ȣ�ϱ�����
 * -�Ӽ��� private���������ڷ� ó���ϰ�,
 * -�Ӽ��� ���R���� �޼ҵ带 ����,
 * -�ܺο��� ����Ҷ� �ۼ��� ������ �ݵ�� �޼ҵ�()�� ���ؼ�
 * -�����Ҽ� �ֵ��� �ϴ� ���
 * -
 */
	public static void main(String[] args) {
		
		Person2 person2 = new Person2();
		person2.setName("ȫ�浿"); 
		person2.setAge(20);
		
		System.out.println(person2.getNmae()+"�� ���̴� "+person2.getAge()+"�Դϴ�.");
		
		person2.setName("�Ӳ���");
		person2.setAge(-13);
		System.out.println(person2.getNmae()+"�� ���̴� "+person2.getAge()+"�Դϴ�.");

	}
}
