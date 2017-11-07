package p01.classes;

public class Person3 {
	private String name;
	   private int age;
	   private Calculator calc;

	   void calc() {
	      calc = new Calculator();
	      calc.setField1(10);
	      calc.setField2(5);
	      calc.setOp('+');
	      calc.calc();
	   }

	   Person3(String name, int age) {
	      this.name = name;
	      this.age = age;
	   }

	   public void smile() {
	      System.out.println(name + "이 웃습니다");
	   }

	   public void eat() {
	      System.out.println(name + "이 먹습니다.");
	   }

	   public void setName(String name) {

	      this.name = name;
	   }

	   public void setAge(int age) {
	      if (age < 0) {
	         System.out.println("오류");
	         return; // 메소드에서 return; 문을 만나면 아래부분은 실행하지않음
	      }
	      this.age = age;
	   }

	   public String getNmae() {
	      return name;
	   }

	   public int getAge() {
	      return age;
	   }
}
