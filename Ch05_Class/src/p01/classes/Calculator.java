package p01.classes;

public class Calculator {
	 private int field1;
	   private int field2;
	   private char op;

	   void setField1(int field1) {
	      this.field1 = field1;
	   }

	   void setField2(int field2) {
	      this.field2 = field2;
	   }

	   void setOp(char op) {
	      this.op = op;
	   }
	   void calc() {
	      switch (op) {
	      case '+':
	         System.out.println(field1 + field2);
	         break;
	      case '-':
	         System.out.println(field1 - field2);
	         break;
	      case '*':
	         System.out.println(field1 * field2);
	         break;
	      case '/':
	         System.out.println(field1 / field2);
	         break;
	      }
	   }
	   
	   // int , int ,char
	   void calc(int field1, int field2, char op) {
	      switch (op) {
	      case '+':
	         System.out.println(field1 + field2);
	         break;
	      case '-':
	         System.out.println(field1 - field2);
	         break;
	      case '*':
	         System.out.println(field1 * field2);
	         break;
	      case '/':
	         System.out.println(field1 / field2);
	         break;
	      }
	   }

}
