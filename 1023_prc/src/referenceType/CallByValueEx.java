package referenceType;

public class CallByValueEx {
	public static void main(String[] args) {
		int a=0;
		modify(a);
		System.out.println(a);
		
		MyClass b= new MyClass();
		b.setName("����");
		System.out.println(b.getName());
		modify(b);
		System.out.println(b.getName());

	}
	public static void modify(int i) {		//����Ÿ ������ ������ ����� ���� �����͸� �ִ´�!!
		i = 3;
	}
	public static void modify(MyClass o) {	//������ ������ Ÿ���� �Ӽ��� �޼ҵ带 �����ϴ� ���� �� ���� �ִ�. ����ٰ� �������� �����ϰ�  ���� b���� ���� ���� �ִ´�.
		o.setName("�ڳ�");
	}
}
