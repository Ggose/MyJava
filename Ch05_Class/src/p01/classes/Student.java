package p01.classes;

public class Student {

	String name = null;
	int num =0;
	Student(){
		
	}
	Student(String name,int num){
		this.name = name;
		this.num = num;
	}
	//�Ӽ�
	//�̸�(String),��ȣ(int)
	
	void namePrint() {
		System.out.println("�̸� :"+name);
	}
	void numPrint() {
		System.out.println("��ȣ :"+num);
	}
	//�޼ҵ�
	//�̸����
	//��ȣ���
}
