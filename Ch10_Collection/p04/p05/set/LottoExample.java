package p05.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LottoExample {
	public static void main(String[] args) {
	Set<Integer> set = new HashSet<>();
	//6개의 값 중복없이 저장
	int cnt=0;
	while(set.size()<6) {
		 int ran = (int)(Math.random()*45)+1;// 0<=Math.random()*45<1*45+1
		 System.out.print(ran+"\t");
		 set.add(ran);
		 cnt++;
	}
	
	System.out.println("\n 반복횟수:"+cnt);
	
	Iterator<Integer> iterator = set.iterator();
	while(iterator.hasNext()) {
		System.out.print(iterator.next()+"\t");
	}
	
	
	

	}

}
