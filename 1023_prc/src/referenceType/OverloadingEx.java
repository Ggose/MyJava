package referenceType;

public class OverloadingEx {
	public static void main(String[] args) {
		MyClass2 myObject = new MyClass2();
		
		myObject.print(3);
		myObject.print(3,10);
		
		myObject.print(3.1);
		myObject.print("Ggose");
		myObject.print(1,2,3,4,5);
	}
}
