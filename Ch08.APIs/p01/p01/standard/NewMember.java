package p01.standard;
/*
 * 객체를 복헤자기위해서는 Cloneable인터페이스를 구현해서 만들어야함
 */
public class NewMember implements Cloneable{

	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	//생성자
	public NewMember(String id, String name, String password, int age, boolean adult) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	//메소드
	public NewMember getMember() {
		NewMember cloned = null;
		try {
			cloned = (NewMember)clone(); //clone메소드의 리턴값은 Object
		}catch(CloneNotSupportedException e) {
			System.out.println(e.getMessage());
		}
		return cloned;
		
	}
	
}
