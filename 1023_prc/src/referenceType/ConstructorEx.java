package referenceType;

public class ConstructorEx {
	public static void main(String[] args) {
		MyClass c = new MyClass();
		
		System.out.println(c.getNum());
		System.out.println(c.getName());
		
		MyClass c1 = new MyClass();
		
		System.out.println(c.getNum());
		System.out.println(c.getName());
		
		MyClass c2 = new MyClass(10,"»ï´Ù¼ö");
		System.out.println(c2.getNum());
		System.out.println(c2.getName());
	}
}
