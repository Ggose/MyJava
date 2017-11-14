package p08.arrays;
/**
 * 객체의 비교는 동일한타입끼리 여야 비교대상이 됨.
 * - 비교할수있는 객체를 만들기 위해서는 Comparable인터페이스를 구현해야함.
 * - 객체의비교는 기준이 있어야함.
 *   - name으로 객체를 비교
 *   <타입> : 이 객체에 대상을 해당 타입으로 한정함(형 제한자:generic)
 * */
public class Member implements Comparable<Member>{
	//필드
	String name;
	//생성자
	public Member(String name) {
		this.name = name;
	}
	//객체의 비교 메소드 compareTo()
	@Override
	public int compareTo(Member o) {//매개변수로 대입되는 객체가 <>로
		                            //한정되어있어서 casting불 필요
		return name.compareTo(o.name);
		//String의 compateTo()메소드는
		//두 문자열의 길이중 작은 길이까지만 비교함
		//제일앞의 값끼리 비교해서 크기가 크면 양수,작으면 음수,같으면 0을 리턴
		//한글의 값비교는 유니코드끼리 비교
		//예) 홍(\ud64d) 과 선(\uc120)의 비교 유니코드값 비교
	}
	
	
	
	
}
