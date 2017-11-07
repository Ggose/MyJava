package p01.breaks;

public class Break4Example {

	/*
	 * 이중 반목문을 빠져나가는 break;문
	 * Lable : 을 선언후 break; Lable
	 */
	public static void main(String[] args) {
		int i= 0;
		int j = 0;
		
		kk:while(true) {
			i++;
			while(true) {
				System.out.println("j="+j+"\t");
				if(j==5)break kk; //라벨인 kk로 선언된 반복문을 멋어남
				j++;
			}
			//System.out.println("i="+i);
			//if(i==10)break;
		}
		System.out.println("종료");
	}
}
