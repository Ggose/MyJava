package referenceType;

public class MethodEx {
	public static void main(String[] args) {
		
		MyClass myClass1 = new MyClass();
		MyClass myClass2 = new MyClass();
		
		myClass1.setNum(10);
		myClass2.setName("Ggose");
		
		System.out.println(myClass1.getNum());
		System.out.println(myClass2.getName());
		
	}
}
