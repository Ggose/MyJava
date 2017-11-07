package p01_references;

/* *
 * �迭�� ����
 *  - �迭�� ���̰� �ѹ� ����Ǹ� ���ϼ���, �ø����� ����.
 *  - �׷��� ������, ���簡 �ȵȰ��� �ʱⰪ�� 0���� ��� ������ �Ǿ� �ִ�.
 * */
public class ArrCopy01Example {
	public static void main(String[] args) {
		int[] a = {21,2,3,4,5,6,7}; //���̰� 7�� 1���� �迭
		int[] b = new int[10]; //���̰� 10�� 1���� �迭, ��ҵ��� ����  0���� �ʱ�ȭ
		int[] c = new int[10];
		int[] d = new int[10];
		int[] e = new int[10];
		
		// �迭�� ��ҵ��� �� ����
		// a�迭�� ��ҵ��� b�迭�� �����ϸ�
		// ������� ���� ��ҵ��� �ʱⰪ�� 0���� �״�� ����.
		// �迭�� �� ��ҵ��� �ʱⰪ�� �⺻����Ÿ Ÿ����
		// �ش� Ÿ���� �⺻������ �ʱ�;ȭ �ǰ�
		// ������ ����ŸŸ���� null������ �ʱ�ȭ �ȴ�.
		for(int i=0; i<a.length; i++) {
			b[i]=a[i]; //a[i]�� �� �� b[i]��°�� ������ ���� �ȴ�.
		}
		
		// ����� b�迭 ���� Ȯ��
		for(int i=0; i<b.length; i++) {
			System.out.print("b["+i+"]=" +b[i] + "\t");
		}
		System.out.println();
		System.out.println("---------------------------------------------------------------------------");
		
		//���� for��
		for(int i:b) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("---------------------------------------------------------------------------");
		// �迭�� ���� System.arraycopy()�޼ҵ�
		// arraycopy(����, ���� Index, �����Ұ�(Target), Ÿ���� ���� Index, ������ ����)
		System.arraycopy(a, 0, c, 0, a.length);
		
		for(int j:c) {
			System.out.print(j + "\t");
		}
		
		System.out.println();
		System.out.println("---------------------------------------------------------------------------");
		
		//�迭�� �Ϻκ� �����ϱ�
		//arraycopy(�����迭, ���� Index, Ÿ�Ϲ迭Ÿ��, �迭�� ���� Index, ������ ����)
		System.arraycopy(a, 0, c, 2, a.length);
		
		for(int k: c) {
			System.out.print(k + "\t");
		}
		
		System.out.println();
		System.out.println("---------------------------------------------------------------------------");
		
		
		//������ �Ϻθ� Ÿ�Ϲ迭�� ù��° index���� ���̸�ŭ ����
		System.arraycopy(a, 1, d, 0, a.length-1);
		
		for(int k:d) {
			System.out.print(k + "\t");
		}
		
		System.out.println();
		System.out.println("---------------------------------------------------------------------------");
		
		//a�迭�� �Ϻθ� Ÿ�Ϲ迭�� �Ϻ�(���� Index��3)�� �����ϴ� ���
		System.arraycopy(a, 1, e, 3, a.length-1);
		for(int k:e) {
			System.out.print(k + "\t");
		}
		
		System.out.println();
		System.out.println("---------------------------------------------------------------------------");	
		System.out.println("---------------------------------------------------------------------------");
		
		//for���� ����Ͽ� a�迭�� 1��° index���� �������� ������ 
		//e�迭�� index��ȣ 3���� �����ϴ�
		
		for(int i=0; i<a.length; i++ ) {
			if(i>0) {
				e[i+3]=a[i];
			}
		}
		
		for(int k:e) {
			System.out.print(k + "\t");
		}
		
			
			
			
	} // main()�޼ҵ� ��
}