package p01_references;
/**
 * sort臾�
 * */
public class Arr07SortExample {
	public static void main(String[] args) {
		int[] num = {76,45,34,89,100,50,90,92};
		int temp=0;
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {//i踰덉㎏�쓽 媛믪씠 i+1踰덉㎏媛믩낫�떎 �겕硫� �꽌濡� 援먯껜
					 temp = num[i];
				   num[i] = num[j];
				   num[j] = temp;
				}//if臾� �걹
			}//for臾� �걹
		}
		System.out.print("{");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+((i==num.length-1)?"":","));
		}
		System.out.println("}");
	  System.out.println("---------------------------");
	  //�궡由쇱감�닚 �젙�젹
	  for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]<num[j]) {//i踰덉㎏�쓽 媛믪씠 i+1踰덉㎏媛믩낫�떎 �겕硫� �꽌濡� 援먯껜
					 temp = num[i];
				   num[i] = num[j];
				   num[j] = temp;
				}//if臾� �걹
			}//for臾� �걹
		}
	  System.out.print("{");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+((i==num.length-1)?"":","));
		}
		System.out.println("}");	
	}
}
