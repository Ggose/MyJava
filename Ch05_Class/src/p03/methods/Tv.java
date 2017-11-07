package p03.methods;
/*
 * 초기화 블럭{}  생성자를 만들지않고 바로 초기화 시킬수 있따
 * 	-인스턴스 필드의 초기화{}
 *  -정적(static) 필드의 초기화 static{}
 */
public class Tv {

	//필드 - 정적 필드
	static String company = "samsong";
	static String model = "UHD";
	static String info;
	static {
		info = company + model; //"samasongUHD";
		
	}
	
}
