package inheritence;

public class SubClass extends SuperClass{

	
	public SubClass() {
		super();			//상위클래스에 맴버나 함수에 접그하려면 super을 사용하면돼
	}
	public SubClass(int num,String name) {
		//this.num = num;		
		//this.name = name;			상위클래스가 privte여서 접근할수 없다. 그리고 이렇게 사용하면 안된다. super을 이용해서 사용해!
		super(num,name);
	}
	@Override
	public void printMessage() {
	
		System.out.println("서브클래스메소드");
	}
	
	public void anotherMethod() {
		
	}
	
	
	
	
}
