package p01_references;
/**
 * 諛곗뿴
 * */
public class Arr02Example {
	public static void main(String[] args) {
		int[] a = {23,45,67,789,2};
		for(int i=0;i<a.length;i++)
			System.out.println("a["+i+"]="+a[i]);
		
		for(int k:a) {
			System.out.println("k="+k);
		}
		
		System.out.println("----------------------------");
		/*int[] b;//�꽑�뼵 �썑
		 b = {23,45,67,789,2};*/
		int[] c;
		c= new int[] {23,45,67,789,2};
		// String s ; s = new String(珥덇린媛�);
		for(int i=0;i<c.length;i++) {
			System.out.println("c["+i+"]="+c[i]);
		}
		int i=0;
		for(int j:c) {//�꽑�뼵�맂 蹂��닔 j 諛섎났�옄
			System.out.println("c["+i+"]"+j);
			i++;
		}
		
	}

}
