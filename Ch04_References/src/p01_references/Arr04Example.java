package p01_references;

public class Arr04Example {

	public static void main(String[] args) {
		int []a = {85,90,75,100,95};
		int sum = 0;
		double avg;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		
		avg = sum/a.length; //�հ�/�迭�� ��Ұ���
		
		System.out.println("�հ� :"+sum);
		System.out.println("��� :"+avg);
	
		//���� for��
		
		sum = 0;
		for(int s:a) { //(Ÿ�� ���� : ��ü) ����� ������ {���⼭ ���}
			sum+=s;
		}
		avg = sum/a.length;
		System.out.println("sum ="+sum);
		System.out.println("avg = "+avg);
	}
}
