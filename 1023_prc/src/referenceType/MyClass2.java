package referenceType;

public class MyClass2 {
	
	public void print(int i) {
		System.out.println("integer type ��� :"+i);
	}
	public void print(int i,int j) {
		System.out.println("integer type ��� :"+i);
		System.out.println("integer type ��� :"+j);
	}
	public void print(double i) {
		System.out.println("Double type ��� :"+i);
	}
	public int print(int...ars) {			//���ڸ� � ������ �𸦶� ... �� ���
			System.out.println("�������� ��� ");
			int sum=0;
			for(int n : ars) {		//�迭ó�� ��� ����
				System.out.print(n);
				sum+=n;
			}
			System.out.println("=�� ���� :"+sum);
			return sum;
	}
	public void print(String str) {
		System.out.println("Stringr type ��� :"+str);
	}
}
