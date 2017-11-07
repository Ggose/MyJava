package p01_references;

/* *
 * �������迭(2�����迭)
 *  - 1�����迭�� ��� �ϳ��� ���� �迭.
 *  - Java���� �迭�� �ݵ�� ���̸� �̸� �����ؼ� �����ؾ���.
 *  - ���� ����� index������ ����� �����߻�
 *  - index��ȣ�� �ݵ�� 0������ ����.
 * */
public class MultiArray01Examples {
	public static void main(String[] args) {
		//������ �迭 ��ü ����
		//1�����迭�� ���̰�3�� �迭�� �ΰ� �������� ������� 2�����迭
		//[3]1�����迭�� ����,[2]1���� �迭��ü�� ����
		int[][] a = new int[2][3]; //2��3���� 2���� �迭
		//�������̹Ƿ� Ÿ��[][] = new Ÿ��[���Ǽ�][���Ǽ�];
		a[0][0]=7; a[0][1] = 23; a[0][2]=11;
		a[1][0]=27; a[1][1] = 2; a[1][2]=13;
		
		System.out.println(a.length); //��°� 2; a[2][3] ���� [2]
		System.out.println("-----------------");
		// =>��ø for��
		for(int i=0;i<a.length;i++) { // a.length�� 1���� �迭�� ���� �ǹ�
			for(int j=0; j<a[i].length; j++) { //a[��].length
				
				System.out.print(a[i][j]+ "\t");
			}
			System.out.println();
		}
		System.out.println("-----------------");
		
		//���� for��(for each) �̿��� ���
		// a[0] -> a[0][0] a[0][1] a[0][2]
		// a[1] -> a[1][0] a[1][1] a[1][2]
		for(int[] i:a) {//�������迭�� �ݺ��ں��� ����
			            //int[][] a => int[] ����:a
			for(int  j:i) {//int[] i=> int ����:i
				           // 0����: 7,23,11
				           // 1����: 27,2,13
				System.out.print(j+"\t");
			}
		System.out.println();
		}
	}
}
