package inheritence;

public class SubClass extends SuperClass{

	
	public SubClass() {
		super();			//����Ŭ������ �ɹ��� �Լ��� �����Ϸ��� super�� ����ϸ��
	}
	public SubClass(int num,String name) {
		//this.num = num;		
		//this.name = name;			����Ŭ������ privte���� �����Ҽ� ����. �׸��� �̷��� ����ϸ� �ȵȴ�. super�� �̿��ؼ� �����!
		super(num,name);
	}
	@Override
	public void printMessage() {
	
		System.out.println("����Ŭ�����޼ҵ�");
	}
	
	public void anotherMethod() {
		
	}
	
	
	
	
}
