package p02_while;

public class WhileEx {

	   public static void main(String[] args) {

	      int sum = 0, i = 1;

	      while (i <= 10) {
	         sum = sum + i;
	         System.out.println(i + "일때" + sum);
	         i++;
	      }
	      System.out.println("최종합계" + sum);
	   }

	}