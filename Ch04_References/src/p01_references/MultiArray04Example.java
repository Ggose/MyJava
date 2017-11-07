package p01_references;
/**
 * 媛�蹂�湲몄씠 �씠李⑥썝 諛곗뿴
 * */
public class MultiArray04Example {
	public static void main(String[] args) {
	 int sum=0;//紐⑤뱺 �슂�냼�뱾�쓽 �빀
	 int count=0;
	 double avg=0.0;//�룊洹�
	 int[][] a= {{12,34,32},{21,54,76,23},{12,65}};//1李⑥썝珥덇린媛믪쑝濡� 2李⑥썝諛곗뿴 �깮�꽦
	 for(int i=0;i<a.length;i++) {
		 for(int j=0;j<a[i].length;j++) {
			 System.out.print(a[i][j]+"\t");
		 }//�븞履� for臾� �걹
		 System.out.println();
	 }//諛붽묑履� for臾� �걹.
	 System.out.println("-----------------------------");
	
	//�뼢�긽�맂 for臾�
	for(int[] i:a) {
		for(int j:i) {
			System.out.print(j+"\t");
			sum+=j;//�빀怨� 援ы븯湲�
			++count;//
		}//�븞履� for臾� �걹.
		System.out.println();
	 }//諛붽묑履� for臾� �걹.
	//sum / avg
	System.out.println("�빀怨�:"+sum);
	avg = (double)sum/(double)count;
	System.out.println("�룊洹�:"+avg);
	}//main硫붿냼�뱶 �걹.
}