package p01_references;

public class Arr07SortExamples {
	public static void main(String[] args) {
		int[] num= {76,45,34,89,100,50,90,92};
		
		int temp=0;
		
		for(int i=0; i<num.length; i++) {
			for(int j=i+1; j<num.length; j++) {
				if(num[i]>num[j]) { //i��°�� ���� i+1��° ������ ũ�� ���� ��ü
					temp =num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.print("{");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + ",");
		}
		System.out.println("}");
	System.out.println("-----------------------------------");
	
	
	//�������� 
	for(int i=0; i<num.length; i++) {
		for(int j=i+1; j<num.length; j++) {
			if(num[i]<num[j]) { //i��°�� ���� i+1��° ������ ũ�� ���� ��ü
				temp =num[i];
				num[i] = num[j];
				num[j] = temp;
			}
		}
	}
	System.out.print("{");
	for(int i=0; i<num.length; i++) {
		System.out.print(num[i] + ",");
	}
	System.out.println("}");
	
	}
}
