package p01_references;

public class Arr06MaxMinExample {
	public static void main(String[] args) {
	 int[] num = {76,45,34,89,100,50,90,92};
	 int sum=0;
	 int max=0;//max蹂��닔�쓽 珥덇린媛믪� 諛곗뿴蹂대떎 �쁽���븯寃� �옉��媛�
	 int min=120;//min蹂��닔�쓽 珥덇린媛믪� 諛곗뿴�쓽 �슂�냼�뱾蹂대떎 �쁽���븯寃� �겙媛믪쓣 ���옣
	 //int���엯�쓽 諛곗뿴�뿉�꽌 理쒖냼媛�,理쒕�媛� 援ы븯�뒗 媛꾨떒�븳 諛⑸쾿
	 for(int i=0;i<num.length;i++) {
		 sum+=num[i];//�빀怨�
		 if(num[i]>max) max= num[i];
		 if(num[i]<min) min= num[i];
	 }
	 System.out.println("sum:"+sum);
	 System.out.println("avg:"+sum/num.length);
	 System.out.println("理쒕�:"+max);
	 System.out.println("理쒖냼:"+min);

	}

}
