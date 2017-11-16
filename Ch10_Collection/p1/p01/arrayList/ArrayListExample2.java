package p01.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();//클래스구현체의 객체생성 
		//자료추가
		list.add("Java"); //뒤에추가
		list.add("JDBC"); //뒤에추가
		list.add("C");	//뒤에추가
		list.add(2,"C++");	//index 2번에 삽입
		list.set(0,"DATABASE"); //index 0번의 교체
		
		//추가된 자료의 갯수확인
		int size = list.size();
		System.out.println("총 객체수 :"+size);
		
		//특정 index번지의 값을 출력 get(index)
		String skill = list.get(2);
		System.out.println("2 :"+skill);
		
		//전체 객체 출력
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(str);
		}
	}
}
