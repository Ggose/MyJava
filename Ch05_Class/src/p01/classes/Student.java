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
	//속섣
	//이름(String),번호(int)
	
	void namePrint() {
		System.out.println("이름 :"+name);
	}
	void numPrint() {
		System.out.println("번호 :"+num);
	}
	//메소드
	//이름출력
	//번호출력
}
