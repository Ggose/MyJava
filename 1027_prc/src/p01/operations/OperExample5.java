package p01.operations;

public class OperExample5 {

	public static void main(String[] args) {
		
		//��������
		int a=20,b=30,max;
		//���ǿ����
		max = a>b? a:b;
		System.out.println(max);
		
		//���ǹ�
		if(a<b)max =b;
		else max = b;
		System.out.println(max);
	
		int score=95;
		char grade = ' ';
		if(score>90)
			grade = 'A';
		else
			grade = 'B';
		System.out.println("grade = "+grade);
		
		grade = score>90 ? 'A':'B';
		System.out.println("grade = "+grade);
		
		
		
		
	}
}
