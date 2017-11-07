package referenceType;

public class MyClass2 {
	
	public void print(int i) {
		System.out.println("integer type 출력 :"+i);
	}
	public void print(int i,int j) {
		System.out.println("integer type 출력 :"+i);
		System.out.println("integer type 출력 :"+j);
	}
	public void print(double i) {
		System.out.println("Double type 출력 :"+i);
	}
	public int print(int...ars) {			//인자를 몇개 받을지 모를때 ... 을 사용
			System.out.println("가변인자 출력 ");
			int sum=0;
			for(int n : ars) {		//배열처럼 사용 가능
				System.out.print(n);
				sum+=n;
			}
			System.out.println("=총 합은 :"+sum);
			return sum;
	}
	public void print(String str) {
		System.out.println("Stringr type 출력 :"+str);
	}
}
