package p01_references;
/**
 * 諛곗뿴�쓽 蹂듭궗
 * */
public class ArrayCopy01Example {
	public static void main(String[] args) {
	int[] a = {1,2,3,4,5,6,7};//湲몄씠媛� 7�씪 1李⑥썝 諛곗뿴
	int[] b= new int[10];//湲몄씠媛� 10�씤 1李⑥썝 諛곗뿴. �슂�냼�뱾�쓽 媛믪� 0�쑝濡� 珥덇린�솕
	int[] c= new int[10];
	int[] d= new int[10];
	int[] e= new int[10];
 
	//諛곗뿴 �슂�냼�뱾�쓽 媛� 蹂듭궗
	// a諛곗뿴�쓽 �슂�냼�뱾�쓣 b諛곗뿴濡� 蹂듭궗�븯硫�
	// 蹂듭궗�릺吏��븡�� �슂�냼�뱾�� 珥덇린媛믪씤 0�쑝濡� 洹몃�濡� 議댁옱.
	// 諛곗뿴�쓽 媛� �슂�냼�뱾�쓽 珥덇린媛믪� 湲곕낯�뜲�씠�� ���엯��
	// �빐�떦 ���엯�쓽 湲곕낯媛믪쑝濡� 珥덇린�솕 �릺怨�,
	// 李몄“�삎 �뜲�씠�����엯�� null媛믪쑝濡� 珥덇린�솕 �맂�떎.
	for(int i=0;i<a.length;i++) {//
		 b[i]=a[i];//a[i]�쓽 媛� �씠 b[i]踰덉㎏ 媛믪쑝濡� 蹂듭궗
	}
	
	for(int i=0;i<b.length;i++)
		System.out.print("b["+i+"]="+b[i]+"\t");
	System.out.println();
	
	//�뼢�긽�맂 for臾� 異쒕젰
	for(int i:b) {
		System.out.print(i+"\t");
	}
	System.out.println();
	
	//諛곗뿴�쓽 蹂듭궗 System.arraycopy()硫붿냼�뱶
	//arraycopy(�썝蹂�,�떆�옉index,��寃�,��寃잛쓽 �떆�옉index,蹂듭궗�븷 湲몄씠);
	System.arraycopy(a, 0, c, 0, a.length);
	for(int j:c) {
		System.out.print(j+"\t");
	}
	System.out.println();
	//諛곗뿴�쓽 �씪遺�遺� 蹂듭궗�븯湲�
	//arraycopy(�썝蹂몃같�뿭,�떆�옉index,��寃잙같�뿴��寃�,諛곗뿴�쓽 �떆�옉index,蹂듭궗�븷 湲몄씠);
	System.arraycopy(a, 0, c, 2, a.length);
	for(int k:c) {
		System.out.print(k+"\t");
	}
	System.out.println();
	//�썝蹂몄쓽 �씪遺�瑜� ��寃잙같�뿴�쓽 泥ル쾲吏� index遺��꽣 湲몄씠留뚰겮 蹂듭궗
	System.arraycopy(a, 1, d, 0, a.length-1);
	for(int k:d) {
		System.out.print(k+"\t");
	}
	System.out.println();
	//a諛곗뿴�쓽 �씪遺�瑜� ��寃잙같�뿴�쓽 �씪遺�(�떆�옉index媛�3)�뿉 蹂듭궗�븯�뒗 寃쎌슦
	System.arraycopy(a, 1, e, 3, a.length-1);
	for(int k:e) {
		System.out.print(k+"\t");
	}
	System.out.println();
	//for臾몄쓣 �궗�슜�븯�뿬 a諛곗뿴�쓽 1踰덉㎏ index遺��꽣 �걹源뚯��쓽 �궡�슜�쓣
	//e諛곗뿴�쓽 index踰덊샇 3遺��꽣�떆�옉�븯�뒗 蹂듭궗..
	for(int i=0;i<a.length;i++) {
		if(i>0)
		e[i+3]=a[i];
	}
	for(int k:e) {
		System.out.print(k+"\t");
	}
   }//main()硫붿냼�뱶 �걹.
}
