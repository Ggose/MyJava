package p01_references;

/* *
 * ���������� �������迭
 * - ������ ������ ���� �����ϴ� ����� ���̰� ���� �ٸ� �迭
 * - �迭�� ���� ���ϱ� ���ؼ��� �� ���� ���� ���������� ���ؼ� ó��
 * */
public class MultiArray03Examples {
	public static void main(String[] args) {
		 int[][] a = new int[3][];//
		 a[0] = new int[3]; //���̰� 3�� 1���� �迭
		 a[1] = new int[2]; //���̰� 2�� 1���� �迭
		 a[2] = new int[4]; //���̰� 4�� 1���� �迭
		 
		 a[0][0]=7; a[0][1]=7; a[0][2]=13;
		 a[1][0]=23; a[1][1]=3; a[1][2]=13;
		 a[2][0]=7; a[2][1]=21; a[2][2]=56; a[2][3]=71;
		 
	 
		 for(int i=0; i<a.length; i++) {
			 for(int j=0; j<a[i].length; i++) {
				 System.out.println(a[i][j]+"\t");
			 } //���� for��()��
			 System.out.println();
		 }//�ٱ��� for()�� ��.
	}
}
