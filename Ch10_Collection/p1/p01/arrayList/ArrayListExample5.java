package p01.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample5 {

	//홍길동,일지매,잉꺽정,이순신 값을 입력받아서
	//리스트만드록
	//입력된 객체의 갯수만큼 반복해서
	//index번호 0번지의 값을 삭제하는 코드
	
	public static void main(String[] args) {
		String [] str = {"홍길동","일지매","임꺽정","이순신"};
		List<String> list = new ArrayList();
		list.add("홍길동");
		list.add("일지매");
		list.add("임꺽정");
		list.add("이순신");
		
		for(String name:list) {
			System.out.println(name);
		}
		
		//index번호 0번지 값을 삭제하는 코드
		list.remove(0);
		for(String name:list) {
			System.out.println(name);
		}
		
		
		
	
		
	}

	
}
