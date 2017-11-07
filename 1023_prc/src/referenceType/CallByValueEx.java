package referenceType;

public class CallByValueEx {
	public static void main(String[] args) {
		int a=0;
		modify(a);
		System.out.println(a);
		
		MyClass b= new MyClass();
		b.setName("리사");
		System.out.println(b.getName());
		modify(b);
		System.out.println(b.getName());

	}
	public static void modify(int i) {		//데이타 저장할 공간을 만들어 놓고 데이터만 넣는다!!
		i = 3;
	}
	public static void modify(MyClass o) {	//참조형 데이터 타입은 속성과 메소드를 저장하는 공간 이 따로 있다. 여기다가 참조값을 부텨하고  위쪽 b에는 참조 값만 넣는다.
		o.setName("코난");
	}
}
