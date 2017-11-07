package p01_references;
/**
 * 諛곗뿴�쓽 蹂듭궗
 * - 湲몄씠媛� �꽌濡� �떎瑜� 蹂듭닔媛쒖쓽 諛곗뿴(�떒, ���엯�씠 �룞�씪�빐�빞�븿)
 * - �쓣 �꽌濡� �씠�뼱�꽌 �깉濡쒖슫 湲몄씠�쓽 諛곗뿴�쓣 留뚮뱾�븣 �궗�슜
 * �삁) a[3],b[4] => newArray = new[a.length+b.length];
 * - 諛곗뿴�� �븳踰� �꽑�뼵�릺硫� 湲몄씠媛� 怨좎젙�릺�뼱�꽌 �뒛�씪�닔 �뾾湲곕븣臾몄뿉
 *   �깉濡쒖슫 諛곗뿴�쓣 留뚮뱾�뼱�꽌 湲곗〈 諛곗뿴�쓽 媛믪쓣 蹂듭궗�븯�뿬 �궗�슜�븿.
 * */
public class ArrayCopy02Example {
	public static void main(String[] args) {
	String cities[]= {"�꽌�슱","��援�","異섏쿇","�슱�궛","愿묒＜","泥쒖븞"};
	String nations[]
			= {"���븳誘쇨뎅","誘멸뎅","�쁺援�","�씪蹂�","�봽�옉�뒪"};
	System.out.println("cities[]�쓽 湲몄씠:"+cities.length);
    System.out.println("nations[]�쓽 湲몄씠:"+nations.length);
	String[] newStr = new String[cities.length+nations.length];
	System.out.println("newStr[]�쓽 湲몄씠:"+newStr.length);
	//for臾몄쓣 �씠�슜�븳 蹂듭궗
	for(int i=0;i<cities.length;i++) {
		newStr[i]=cities[i];
	}
	for(String s:newStr) {
		System.out.print(s+"\t");
	}
	System.out.println();
	for(int j=0;j<nations.length;j++) {
		 newStr[cities.length+j] =nations[j]; 
	}
	for(String s:newStr) {
		System.out.print(s+"\t");
	}
	System.out.println();

  //System.arraycopy()瑜� �씠�슜�븳 蹂듭궗
   System.arraycopy(cities, 0, newStr, 0, cities.length);
   System.arraycopy(nations, 0, newStr, cities.length, nations.length);
	
   for(String s:newStr) {
	   System.out.print(s+"\t");
   }
   System.out.println();
	

	}

}
