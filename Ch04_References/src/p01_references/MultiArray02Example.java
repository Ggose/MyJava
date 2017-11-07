package p01_references;
/**
 * 2李⑥썝 諛곗뿴
 * */
public class MultiArray02Example {
	public static void main(String[] args) {
		//湲몄씠媛�3�씤 1李⑥썝諛곗뿴�쓽 珥덇린媛믪쑝濡� 3�뻾�쓽 2李⑥썝諛곗뿴 �깮�꽦
		int[][] a= {{12,45,23},{16,4,879},{45,87,12}};//
		// a[0][0] = 12, a[0][1]=45,a[0][2]=23
		// a[1][0] = 116,a[1][1]=4, a[1][2]=879
		// a[2][0] = 45, a[2][1]=87,a[2][2]=12
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print("a["+i+"]["+j+"]="+a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("-----------------");
		//�뼢�긽�맂 for臾몄쓣 �씠�슜�븳 諛곗뿴�슂�냼�쓽 異쒕젰
		int cnt1=0,cnt2=0;
		for(int[] i:a) {//int[] 蹂��닔:媛앹껜紐�
			for(int j:i ) {//int 蹂��닔:蹂��닔紐�
				System.out.print("a["+cnt1+"]["+cnt2+"]="+j+"\t");
				cnt2++;
			}
			cnt2=0;//珥덇린�솕
			cnt1++;
			System.out.println();
		}
	}

}
