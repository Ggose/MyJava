package referenceType;

public class MyClass {
	private int num;
	private String name;
	private static String staticVar;
	
	
	
	
	/*method ���� ���
	 * ���������� ����Ÿ�� �޼ҵ��(�Ķ����Ÿ�԰� �̸�,){
	 * 
	 * 		...�߰�ȣ �ȿ� ����� ����...
	 * 		return ����Ÿ�Կ� �´� ��;//���� void �̸� ��������
	 * }
	 */
	public MyClass(){
		this.num = 5;
		this.name = "�ټ���";
	}
	public MyClass(int num,String name) {
		this.num = num;
		this.name = name;
	}
	public void setNum(int num) {
		
		this.num = num;
	}
	public int getNum() {
		return this.num;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
	//	System.out.println(getClassName());
	//	System.out.println(staticVar);
		return this.name;
	}
	public static String getClassName() {
		return "�� Ŭ������ MyClass�̴�.";
	}
	

}
