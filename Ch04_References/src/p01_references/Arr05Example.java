package p01_references;

public class Arr05Example {
/*
 * arry���� ���ϱ�
 * Ÿ��[][] 2�����迭
 */
	public static void main(String[] args) {
		
		int sum=0;
		double avg=0;
		int kor=0;
	
		int total=0;
		String [] title = {"�̸�","����","����","����","����","���"};
		String [] name = {"������","�̼���","�Ӳ���","ȫ�浿"};
		
		int[][] score = {{90,80,70},{76,86,90},{90,78,90},{80,80,80}};//
		System.out.println("����ǥ\n");
		for(String t:title) {
			System.out.print(t+"\t");
		}
		System.out.println();
		for(int i=0;i<44;i++) {
			System.out.print("=");
		}
		System.out.println();
		for(int i =0;i<score.length;i++) {	//�̸� ���� ��½���
			//�̸����
			System.out.print(name[i]+"\t");
			for(int j=0;j<score[i].length;j++) {
				
				System.out.print(score[i][j]+"\t");
			
			sum+=score[i][j];
			avg=sum/score[i].length;
			//System.out.println(sum+sum/score[i].length);
			}
			System.out.print(sum);
			sum=0;
			System.out.print("\t"+avg);
			avg=0;
			System.out.println();
		}//�̸� ���� ��� ��
		for(int i=0;i<44;i++) {
			System.out.print("=");
		}
		System.out.println();
		System.out.print("�հ�"+"\t");
		
		for(int j=0;j<score[j].length;j++) {
			for(int i=0;i<score.length;i++) {
			kor = kor+score[i][j];
			}
			System.out.print(kor+"\t");
			kor=0;
		}
		for(int i =0;i<score.length;i++) {	//�̸� ���� ��½���
			
			for(int j=0;j<score[i].length;j++) {
			
			sum+=score[i][j];
		
			//System.out.println(sum+sum/score[i].length);
			}
		
		}//�̸� ���� ��� ��
		System.out.print(sum);
		avg=sum/4;
		System.out.print("\t"+avg);
		System.out.println();
		
			
	}
}
