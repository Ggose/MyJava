package p03_singletone;

public class Singletone1Example {

	public static void main(String[] args) {
		//SingleTon obj1 = new SingleTon(); //�����ڿ� �����Ҽ� �����Ƿ� �����߻�
		SingleTon obj2 = SingleTon.getInstance();
		SingleTon obj3 = SingleTon.getInstance();

		if(obj2 == obj3) { 
			System.out.println("���� Singletone��ü �Դϴ�");
		}else
			System.out.println("�ٸ� Singletone��ü �Դϴ�.");
	}
}
