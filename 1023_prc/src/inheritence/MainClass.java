package inheritence;

public class MainClass {

	public static void main(String[] args) {

		SuperClass o1 = new SubClass(10,"а╕аж");
	
		o1.printMessage();
		
		doSomething(o1);
	}
	public static void doSomething(SuperClass s) {
		
	}
}
