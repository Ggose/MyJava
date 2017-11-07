package p01_references;
/**
 * 媛�蹂�湲몄씠�쓽 �씠李⑥썝諛곗뿴
 * - �씠李⑥썝�쓽 媛곹뻾�쓽 �뿴�쓣 援ъ꽦�븯�뒗 �슂�냼�쓽 湲몄씠媛� �꽌濡� �떎瑜� 諛곗뿴
 * - 諛곗뿴�쓽 媛믪쓣 援ы븯湲곗쐞�빐�꽌�뒗 媛� �뻾�쓽 �뿴�쓣 媛쒕퀎�쟻�쑝濡� 援ы빐�꽌 泥섎━
 * */
public class MultiArray03Example {
	public static void main(String[] args) {
	 int[][] a = new int[3][];//
	 a[0] = new int[3];//湲몄씠媛� 3�씤 1李⑥썝 諛곗뿴
	 a[1] = new int[2];//湲몄씠媛� 2�씤 1李⑥썝 諛곗뿴
	 a[2] = new int[4];//湲몄씠媛� 4�씤 1李⑥썝 諛곗뿴
	
	 a[0][0]=7;  a[0][1]=23; a[0][2]=13;
	 a[1][0]=23; a[1][1]=3;  /*a[1][2]=13;*/
	 a[2][0]=2;  a[2][1]=21; a[2][2]=56; a[2][3]=71;
	 
	 for(int i=0;i<a.length;i++) {
		 for(int j=0;j<a[i].length;j++) {
			 System.out.println(a[i][j]+"\t");
		 }//�븞履� for臾�()�걹.
		 System.out.println();
	 }//諛붽묑履� for()臾� �걹.
	}
}
