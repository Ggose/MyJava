package p05.set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/**
 * Set - 자료를 중복저장하지않는 자료구조,
 *     - 순서가 없음
 * */
public class HashSetExample {
	public static void main(String[] args) {
		//Set객체 생성
		Set<String> set = new HashSet<>();//HashSet객체 생성 후 Promotion
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");//동일한 객체의 중복저장은 안됨
		set.add("iBatis");
		
		int size = set.size();//저장된 객체의 갯수
		System.out.println("총 객체의 갯수:"+size);
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(new Integer(1));//객체저장 Wrapper클래스
		set2.add(1);//int타입의 정수 -> Wrapper클래스 :auto-Boxing
		set2.add(2);//int타입의 정수 -> Wrapper클래스 :auto-Boxing
		set2.add(new Integer(3));
		
		System.out.println("총객체의 갯수:"+set2.size());
		
		//set에서 자료를 얻어내기위해서 반복자를 생성
		//iterator() - 저장객체들의 순서와 번지 정보를 만들어서 Iterator객체에 저장
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {//hasNext()자료가 있는 여부확인 메소드
			String el = iterator.next();//next()값을 가져오는 메소드
			System.out.print("\t"+el);
		}
		//set2의 정보 출력
		Iterator<Integer> iterator2 = set2.iterator();
		while(iterator2.hasNext()) {//hasNext()자료가 있는 여부확인 메소드
			Integer el = iterator2.next();//next()값을 가져오는 메소드
			System.out.print("\t"+el);
		}
	}
}
