package p03.methods;
/*
 * �ʱ�ȭ ��{}  �����ڸ� �������ʰ� �ٷ� �ʱ�ȭ ��ų�� �ֵ�
 * 	-�ν��Ͻ� �ʵ��� �ʱ�ȭ{}
 *  -����(static) �ʵ��� �ʱ�ȭ static{}
 */
public class Tv {

	//�ʵ� - ���� �ʵ�
	static String company = "samsong";
	static String model = "UHD";
	static String info;
	static {
		info = company + model; //"samasongUHD";
		
	}
	
}
