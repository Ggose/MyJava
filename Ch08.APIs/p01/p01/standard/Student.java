package p01.standard;

public class Student {

	//필드
	String name;

	int sno;
	
	public Student(String name) {
		this.name = name;
	}
	public Student(String name,int sno) {
		this.name = name;
	
		this.sno = sno;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student) {	//동일 타입
			Student student1 = (Student)obj;
			if(name.equals(student1.name) && sno==student1.sno) {
				return true;
			}
				
		}
		return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		
		return name.hashCode() + sno;
	}
	
}
