package p01_references;

public class Arr03Rxample {

	public static void main(String[] args) {
		String [] str = {"���䳢","���䳢","���䳢","�����䳢"};
		
		for(int i = 0;i<str.length;i++)
			System.out.print(str[i]+",");
		
		for(String s :str) {//����s����
			System.out.println(s+",");
		}
	}
}
