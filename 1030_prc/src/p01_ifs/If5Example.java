package p01_ifs;

import java.util.Scanner;

public class If5Example {
	public static void main(String[] args) {

		String grade = "";
		int score = 0;
		
		Scanner keyborder = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� :");
		
		score = keyborder.nextInt();
		// if�� ����

		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 60) {
			grade = "D";
		} else
			grade = "F";

		
		//if�� ��
		if(score>=100)grade="A+";
		else if(score>=60) {
			if(score%10>7)grade+="+"; //60%10 => ������ : 0~9>7 : A +" +"="+"=>A+
			else if(score%10<4)grade+="-"; //60%10 =>������ : 0~9<4 : A+"-" => A-
			else grade+="0";
		}
		System.out.println("����� "+grade);
	}

}
