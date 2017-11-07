
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*1번
			for(int i=0;i<5;i++) {
				for(int j =0;j<5;j++) {
					System.out.print(" #");
				}
			System.out.println("");
			}
*/	
/*2번
			
		for(int i=0;i<7;i++) {
			if(i%2==1) {
				System.out.print("  #");
			}
			for(int j=0;j<7;j++) {
				System.out.print(" #");
			
			}
			System.out.println("");
			
		}
*/	
		/*3번(a)
		for(int i=0;i<7;i++) {
			for(int j=0;j<7;j++) {
			
				if(i>=j) {
					System.out.print("#");	
				}	
			}
			System.out.println("");
		}
		*/
		/*3번 (b)
		for(int i=0;i<7;i++) {
			for(int j=0;j<7;j++) {
			
				if(i<=j) {
					System.out.print("#");	
				}	
			}
			System.out.println("");
		}
		*/
		/*c
		for(int i=0;i<7;i++) {
			for(int k =0; k<i;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<(7-i);j++) {
				System.out.print("#");				
			}
			System.out.println("");
		}
	*/
		
		/*d
		for(int i=0;i<7;i++) {
			for(int k =i+1; k<7;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("#");				
			}
			System.out.println("");
		}
		*/
	}
}

