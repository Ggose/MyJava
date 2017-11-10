package p01.standard;
/*
 * clone()메소드 객체의 복제 가능
 * 복제가능한 객체는 Cloneable인터페이스를 구현해야함.
 */
public class NewMemberCloneExample {

	public static void main(String[] args) {
		//원본 객체 생성
		NewMember origin = new NewMember("hong", "홍길동", "1234", 25, true);
		
		NewMember cloned = origin.getMember();
		
		System.out.println(cloned.id);
		
		cloned.password = "58585";
		
		System.out.println("[원본객체 정보]");
		System.out.println(origin.getClass().getSimpleName()+"의 id :"+origin.id);
		System.out.println(origin.getClass().getSimpleName()+"의 id :"+origin.name);
		System.out.println(origin.getClass().getSimpleName()+"의 id :"+origin.password);
		System.out.println(origin.getClass().getSimpleName()+"의 id :"+origin.age);
		System.out.println(origin.getClass().getSimpleName()+"의 id :"+origin.adult);
	
		System.out.println("[사본객체 정보]");
		System.out.println(cloned.getClass().getSimpleName()+"의 id :"+cloned.id);
		System.out.println(cloned.getClass().getSimpleName()+"의 id :"+cloned.name);
		System.out.println(cloned.getClass().getSimpleName()+"의 id :"+cloned.password);
		System.out.println(cloned.getClass().getSimpleName()+"의 id :"+cloned.age);
		System.out.println(cloned.getClass().getSimpleName()+"의 id :"+cloned.adult);

	}
}
