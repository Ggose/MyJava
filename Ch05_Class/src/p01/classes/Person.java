package p01.classes;

/*
 * Ŭ���� = ��ü (object)�� �ڹٿ��� ��üȭ�� ���赵
 * 	Ŭ������ ����
 * ���������� class Ŭ������{
 *		//�Ӽ�
 *		//���
 *}
 */
public class Person {

	// ������ - ��� Ŭ������ �����ڰ� �ݵ�� �־����.
	//�Ű������� ���� ������ ������ : default(�⺻������)
	//Ŭ���� �ۼ��� �⺻�����ڵ� ������� ������ �����Ͻ� �߰��� ����.
	//������ ���� -��ü ���� ���Ŀ� �ʱ�ȭ�� ����.
	Person() {
	}
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}

	// �Ӽ�
	String name;
	int age;

	// ���
	void smile() {
		System.out.println(name + "�� �����ϴ�");
	}
	void eat() {
		System.out.println(name+"�� �Խ��ϴ�.");
	}
}
