package referenceType;

public class FieldEx {
	
	//fields (instance variables)
	public int i =3;//�ʱⰪ�� primitive data�� 0  �Ǵ� fales
	public float f = 3.0F;
	public String str = "�ʵ�";	//������ ������ Ÿ���� null;
	//static variable (class variable)
	public static int num=10;
	
	
	public static void main(String[] args) {
		
		FieldEx fieldEx = new FieldEx();
		
		System.out.println(fieldEx.i);
		System.out.println(fieldEx.f);
		System.out.println(fieldEx.str);
		
		FieldEx fieldEx2 = new FieldEx();
		
		System.out.println(fieldEx2.i);
		System.out.println(fieldEx2.f);
		System.out.println(fieldEx2.str);
		
		fieldEx2.i = 5;
		System.out.println(fieldEx.i);
		System.out.println(fieldEx2.i);
		
		System.out.println(fieldEx.num);
		System.out.println(fieldEx2.num);
		
		fieldEx2.num = 20;
		System.out.println(fieldEx.num);
		System.out.println(fieldEx2.num);
		
		FieldEx.num = 30;
		System.out.println(fieldEx.num);
		System.out.println(fieldEx2.num);
		
	}

}
