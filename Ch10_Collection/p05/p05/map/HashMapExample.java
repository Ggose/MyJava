package p05.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map콜렉션<K,V>형태로 객체를 저장하는 자료구조
 */
public class HashMapExample {

	public static void main(String[] args) {
		//Map 객체 생성
		Map<String,Integer> map = new HashMap<>();
		//객체 저장
		map.put("홍길동", 85);//<K,V>첫번째 와 네번째는 키가 "홍길동"이로 동일
		map.put("일지매", 90);//두번째 value값과 다섯번째 value값이 동일,같은 객체여도 중복을 허용
		map.put("임꺽정", 80);
		map.put("홍길동", 95);//
		map.put("이순신", new Integer(90));
		
		System.out.println("총 저장된 Entry 수는 :"+map.size());
		
		Set<String>keySet = map.keySet(); //map의 키들만 뽑아서 Set에 저장
		Iterator<String>iterator = keySet.iterator();//set의 값의 정보 iterator에 저장
		for(;iterator.hasNext();) { //값이 있을때까지 반복
			String key = iterator.next();
			int value = map.get(key);
			System.out.println("\t"+key+":"+value);
		}
		//특정위치의 객체 검색
		System.out.println("홍길동 :"+map.get("홍길동"));//map.get(키)
		//특정위치의 객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry수 :"+map.size());
		
		//객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수 :"+map.size());
		
		
	}
}
