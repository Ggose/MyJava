package p01_references;

public class Arr06MaxMinExamples {
	public static void main(String[] args) {
		 int[] num = {76,45,34,89,100,50,90,92};
		 int sum=0;
		 int max=0;//max������ �ʱⰪ�� �迭���� �����ϰ� ������
		 int min=120;//min������ �ʱⰪ�� �迭�� ��ҵ麸�� �����ϰ� ū���� ����
		 //intŸ���� �迭���� �ּҰ�,�ִ밪 ���ϴ� ������ ���
		 for(int i=0;i<num.length;i++) {
			 sum+=num[i];//�հ�
			 
			 if(num[i]>max) {
				 max= num[i];
			 }
			 if(num[i]<min) {
				 min= num[i];
			 }
		 }
		 System.out.println("sum:"+sum);
		 System.out.println("avg:"+sum/num.length);
		 System.out.println("�ִ�:"+max);
		 System.out.println("�ּ�:"+min);

		}
}
