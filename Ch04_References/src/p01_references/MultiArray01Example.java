package p01_references;
/**
 * �떎李⑥썝諛곗뿴(2李⑥썝諛곗뿴)
 *  - 1李⑥썝諛곗뿴�쓣 臾띠뼱�꽌 �븯�굹濡� 留뚮뱺 諛곗뿴
 *  - java�뿉�꽌 諛곗뿴�� 諛섎뱶�떆 湲몄씠瑜� 誘몃━ 吏��젙�빐�꽌 �꽑�뼵�빐�빞�븿.
 *  - 媛믪쓣 ���옣�떆 index踰붿쐞瑜� 踰쀬뼱�굹硫� �삤瑜섎컻�깮
 *  - index踰덊샇�뒗 諛섎뱶�떆 0踰덈��꽣 �떆�옉.
 * */
public class MultiArray01Example {
	public static void main(String[] args) {
		//�씠李⑥썝 諛곗뿴 媛앹껜 �깮�꽦
		//1李⑥썝諛곗뿴�쓽 湲몄씠媛�3�씤 諛곗뿴�씠 �몢媛� �빀爾먯졇�꽌 留뚮뱾�뼱吏� 2李⑥썝諛곗뿴
		//[3]1李⑥썝諛곗뿴�쓽 湲몄씠,[2]1李⑥썝 諛곗뿴媛앹껜�쓽 媛��닔
		int[][] a = new int[2][3];//2�뻾3�뿴�쓽 2李⑥썝 諛곗뿴
		//�씠李⑥썝�씠誘�濡� ���엯[][] = new ���엯[�뻾�쓽�닔][�뿴�쓽�닔];
		a[0][0]=7;  a[0][1] = 23; a[0][2]=11;
		a[1][0]=27; a[1][1] = 2;  a[1][2]=13;
		System.out.println(a.length);//異쒕젰媛� 2 a[2][3] �뿉�꽌 [2]
		for(int i=0;i<a.length;i++) {//a.length�뒗 1李⑥썝諛곗뿴�쓽 媛��닔.
			System.out.print(a[i][0]+"\t");
			System.out.print(a[i][1]+"\t");
			System.out.println(a[i][2]);
		}
		System.out.println("-----------------");
		// => 以묒꺽 for臾�
		for(int i=0;i<a.length;i++) {//a.length�뒗 1李⑥썝諛곗뿴�쓽 媛��닔.
			for(int j=0;j<a[i].length;j++) {//a[�뻾].length
			System.out.print(a[i][j]+"\t");	
			}
			System.out.println();
		}//諛붽묑履� for臾� �걹
		System.out.println("-----------------");
		//�뼢�긽�맂 for臾�(for each) �씠�슜�븳 異쒕젰
		// a[0] -> a[0][0] a[0][1] a[0][2]
		// a[1] -> a[1][0] a[1][1] a[1][2]
		for(int[] i:a) {//�씠李⑥썝諛곗뿴�쓽 諛섎났�옄蹂��닔 �꽑�뼵
			            //int[][] a => int[] 蹂��닔:a
			for(int  j:i) {//int[] i=> int 蹂��닔:i
				           // 0踰덊뻾: 7,23,11
				           // 1踰덊뻾: 27,2,13
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}

}
