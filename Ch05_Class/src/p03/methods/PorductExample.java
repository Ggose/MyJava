package p03.methods;

public class PorductExample {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1�� ��ǰ��ȣ (seria no)�� "+p1.seriaNo);
		System.out.println("p2�� ��ǰ��ȣ (seria no)�� "+p2.seriaNo);
		System.out.println("p3�� ��ǰ��ȣ (seria no)�� "+p3.seriaNo);
		
		System.out.println("����� ��ǰ�� ���� ��� "+Product.count+"�� �Դϴ�");
		
	}
}
