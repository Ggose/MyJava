package p01.classes;

public class Person2Example {
/*
 * -은닉화(encapsulation)
 * 객체의 속성을 보호하기위해
 * -속성을 private접근제어자로 처리하고,
 * -속성을 접긓낳는 메소드를 만들어서,
 * -외부에서 사용할때 송석의 접근은 반드시 메소드()를 통해서
 * -접근할수 있도록 하는 방식
 * -
 */
	public static void main(String[] args) {
		
		Person2 person2 = new Person2();
		person2.setName("홍길동"); 
		person2.setAge(20);
		
		System.out.println(person2.getNmae()+"의 나이는 "+person2.getAge()+"입니다.");
		
		person2.setName("임꺽정");
		person2.setAge(-13);
		System.out.println(person2.getNmae()+"의 나이는 "+person2.getAge()+"입니다.");

	}
}
