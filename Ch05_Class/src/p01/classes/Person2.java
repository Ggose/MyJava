package p01.classes;

public class Person2 {
	Person2() {}
	Person2(String name,int age){
		this.name = name;
		this.age = age;
	}

	// �Ӽ�
	private String name;
	private int age;

	
	public void smile() {
		System.out.println(name + "�� �����ϴ�");
	}
	public void eat() {
		System.out.println(name+"�� �Խ��ϴ�.");
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	public void setAge(int age) {
		if(age<0) {
			System.out.println("����");
		return; //�޼ҵ忡�� return; ���� ������ �Ʒ��κ��� ������������
		}
		this.age = age;
	}
	public String getNmae() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
}
