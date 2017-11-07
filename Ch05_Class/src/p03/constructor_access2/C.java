package p03.constructor_access2;

import p03.constructor_access1.A;

public class C {

	//필드
	A a1 = new A(true);//public이므로 다른 패키지내에서 접근가능
	//A a2 = new A(2);//default이므로 다른패키지내에서 접근 불가능
	//A a3 = new A("꼬리꼬닭");//private 이므로 접근불가

}
