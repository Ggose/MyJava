package p01.classes;

public class StudentExample1 {

	/*
	 * 사용할 클래스의 instance는 new 생성자(); 에 의해 만들어지고
	 * 생성된 instance의 속성,메소드에 접근 하기 위해서는
	 * 참조하는 변수.속성,변수.메소드()로 접근함
	 */
	public static void main(String[] args) {
		Student student; //student는 null값을 가짐
		student = new Student(); // Student 객체(instance) 생성후 번지값
		
		student.name = "홍길동"; //생성한 instance의 속성접근 참조변수.속성
		student.num = 10;
		student.namePrint(); //생성한 instance의 메소드 점근 참조변수.메소드
		student.numPrint();
	}
}
