package p03.methods_access2;

import p03.methods_access1.A;

public class C {

	public C() {
		A a= new A();
		
		a.field1 = 1;//�ʵ尡 public�̹Ƿ� �ٸ���Ű������ ���ٰ���
		//a.field2 = 1;//�ʵ尡 default�̹Ƿ� �ٸ���Ű������ ���� �Ұ�
		//a.field13 =1;//�ʵ尡 private�̹Ƿ� �ٸ���Ű������ ���� �Ұ�
		
		a.method1();//�޼ҵ尡 public�̹Ƿ� �ٸ���Ű������ ���ٰ���
		//a.method2();//�޼ҵ尡 default�̹Ƿ� �ٸ���Ű������ ���ٰ���
		//a.method3();//�޼ҵ尡 private�̹Ƿ� �ٸ���Ű������ ���ٰ���
		
	}
}

