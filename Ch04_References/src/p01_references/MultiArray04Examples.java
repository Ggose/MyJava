package p01_references;

/* *
 * �������� ������ �迭
 * */
public class MultiArray04Examples {
	public static void main(String[] args) {
	 int sum=0;
	 double average = 0;
	 int count=0;
	 int[][] a= {{12,34,32},{21,54,76,23},{12,65}};//1�����ʱⰪ���� 2�����迭 ����
	 for(int i=0;i<a.length;i++) {
		 for(int j=0;j<a[i].length;j++) {
			 System.out.print(a[i][j]+"\t");
		 }//���� for�� ��
		 System.out.println();
	 }//�ٱ��� for�� ��.
	 System.out.println("-------------------------------");
	 
	 //�⼧�� for��
	 for(int[] i:a) {
		 for(int j:i) {
				System.out.print(j+"\t");
				sum+=j;//�հ� ���ϱ�
				++count;//
			 
		 }//���� for�� ��
		 System.out.println();
		 
	 } //�ٱ��� for�� ��
	 System.out.println("-------------------------------");
		System.out.println("�հ�:"+sum);
		average = (double)sum/(double)count;
		System.out.println("���:"+average);
	} //main �޼ҵ� ��
}
