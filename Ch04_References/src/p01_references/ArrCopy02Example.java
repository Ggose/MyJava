package p01_references;

/* *
 * �迭�� ����
 * - ���̰� ���� �ٸ� �������� �迭(��, Ÿ���� �����ؾ���)
 * - �� ���� �̾� ���ο� ������ �迭�� ���鶧 ���.
 * ��) a[3], b[4] => newArray = new[a.length + b.length];
 * - �迭�� �ѹ� ����Ǹ� ���̰� �����Ǿ ���ϼ� ���� ������
 * - ���ο� �迭�� ���� ���� �迭�� ���� �����Ͽ� �����. 
 * */
public class ArrCopy02Example {
	public static void main(String[] args) {
		String cities[] = {"����", "����", "��õ", "���", "����", "õ��"};
		
		String nations[]
				= {"���ѹα�","�̱�","����","�Ϻ�","������"};
		
		System.out.println("cities[]�� ����: "+ cities.length);
		System.out.println("nations[]�� ����: "+ nations.length);
		
		String[] newStr = new String[cities.length + nations.length];
		System.out.println("newStr[]�� ����: "+ newStr.length);
		
		for(int i=0; i<cities.length; i++) {
			
			newStr[i]= cities[i];
			
		}
		
		for( String s: newStr) {
			System.out.print(s + "\t");
		}
		
		System.out.println();
		
		for(int j=0; j<nations.length; j++) {
			newStr[cities.length+j] = nations[j];
		}
		
		for(String s:newStr) {
			System.out.print(s + "\t");
		}
		
		System.out.println();
		
		System.arraycopy(cities, 0, newStr, 0, cities.length);
		System.arraycopy(nations, 0, newStr, cities.length, nations.length);
		
		for(String s:newStr) {
			System.out.print(s + "\t");
		}
		
		System.out.println();
	}
}
