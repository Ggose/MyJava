package p01.classes;

/*
 * ����(object)�� �Ӽ��� ����� ���� ������ ����.
 * Ŭ������ ��ü�� ����� ���� ���赵
 * �ڹٿ��� Ŭ������ ������ ������ ��ü�� instance��� ��
 */
public class PersonExample1 {

	public static void main(String[] args) {
		//��ü����(instance����)
		//��ü�� ����
		//Ÿ����������;
		//��ü�� ���� new Ÿ��(); =>new ������();
		Person person = new Person("�̼���",26);
		Student st = new Student("���ȣ",25);
		//����Ŭ������ PersonŬ�������� ����(���)
		person.smile(); //��� -> ��������.�޼ҵ�() ����� ȣ���Ͽ� ���
		person.eat();	//��� -> ��������.�޼ҵ�();
		
		st.namePrint();
		st.numPrint();
	}
}
