package p01.operations;

/*
 * ���� ������-����,�����ϴ� ������
 * ���������ڴ� �ǿ������� ����/������ ��ġ�� ���� �����Ǵ� ������ �޶�����.
 * ��) ++x�� ��� : ���� 1���� ���� ���� �����̵�.
 * 	   x++�� ��� : ���������� �����Ŀ� 1��ŭ ������
 * 
 */
public class OperExample3 {

	public static void main(String[] args) {
		
		int x= 0,y=0;		//�ʱⰪ x = 0 ,y =0;
		System.out.println(x++);	//x = 0
		System.out.println(y++);	//y = 0
		System.out.println((x++)+(y++)); //x=1,y=1
		System.out.println((++x)+(++y));//x=3,y=3;
		System.out.println(x-y); //0
		
		//�������� ���� �ǹ�
		x=0; y=0;
		System.out.println(x=x+1);
		System.out.println(y=y+1);
		
		System.out.println(x+y);
		System.out.println(x=x+1);
		System.out.println(y=y+1);
		
		System.out.println((x=x+1)+(y=y+1));
		
		int family =150;
		System.out.println("ȫ�浿�� ������ ������ "+ ++family+"�� ���");
	}
}
