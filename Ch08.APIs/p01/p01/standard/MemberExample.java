package p01.standard;
/*
 * Object클래스의 equals()메소드의 용도는
 * 객체의 비교시에는 동일객체인지 아닌지 비교하는 용도보다는 
 * 객체의 내용이 같은지를 비교하는 용도로 사용됨.
 */
public class MemberExample {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");


		//객체의 비교
		if(obj1.equals(obj2)) {
			System.out.println("obj1과obj2는 논리적으로 동등합니다.");
		}else {
			System.out.println("obj1과obj2는 논리적으로 동등하지 않습니다.");
		}
		if(obj1.equals(obj3)) {
			System.out.println("obj1과obj3는 논리적으로 동등합니다.");
		}else {
			System.out.println("obj1과obj3는 논리적으로 동등하지 않습니다.");
		}
	}
}
