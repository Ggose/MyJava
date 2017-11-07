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
	      System.out.println(name + "�� �����ϴ�");
	   }

	   public void eat() {
	      System.out.println(name + "�� �Խ��ϴ�.");
	   }

	   public void setName(String name) {

	      this.name = name;
	   }

	   public void setAge(int age) {
	      if (age < 0) {
	         System.out.println("����");
	         return; // �޼ҵ忡�� return; ���� ������ �Ʒ��κ��� ������������
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
