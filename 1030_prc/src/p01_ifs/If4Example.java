package p01_ifs;

import java.util.Scanner;

public class If4Example {
	  public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int score = 0;
	      boolean isContinue = true;

	      while (isContinue) {
	         System.out.println("������ �Է��Ͻÿ�:");
	         score = sc.nextInt();
	         String grade = "";

	         if (score >= 90) {
	            if (score > 96)
	               grade = "A+";
	            else if (score < 94)
	               grade = "A-";
	            else
	               grade = "A0";
	         } else if (score >= 80) {
	            if (score > 86)
	               grade = "B+";
	            else if (score < 84)
	               grade = "B-";
	            else
	               grade = "B0";

	         } else if (score >= 70) {
	            if (score > 76)
	               grade = "C+";
	            else if (score < 74)
	               grade = "C-";
	            else
	               grade = "C0";

	         } else if (score >= 60) {
	            if (score > 66)
	               grade = "D+";
	            else if (score < 64)
	               grade = "D-";
	            else
	               grade = "D0";
	         } else {
	            grade = "f";
	         }
	         System.out.println("�Է��� ������ " + grade + " ���");
	         System.out.println("����Ͻðڽ��ϱ�? ����Ͻ÷��� (y or Y) �׸��Ϸ��� �ƹ�Ű�� �����ÿ� ");
	         char end = sc.next().charAt(0);

	         isContinue = (end == 'y' || end == 'Y') ? true : false;
	      }
	   }

}
