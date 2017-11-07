
public class WhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=20;
		
		while(age > 15) {
			
			System.out.println("hi1");
			age--;
		}
		
		do {
			System.out.println("hi2");
		}while(age>15);
		
		while(true) {
			System.out.println("hi3");
			if(age ==10) {
//				break; continue;
			}
			age--;
		}

	}

}
