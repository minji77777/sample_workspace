package co.edu.api;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
	public static void main(String[] args) {
		//데이터 여러 건 저장 =>  배열
		//컬렉션 ArrayList => 인덱스 값 지정. 동일한 값 다른 인덱스. 
		//컬렉션 HashSet => 인덱스 값 저장X , 동일한 값 저장X
		
		HashSet<String> set = new HashSet<String>();
		set.add("홍길동");
		set.add("김길동");
		set.add("홍길동");
		
//		System.out.println(set.size());      //2개. 왜냐)중복된 값은 제외.
//		for(int i=0; i<set.size();i++) {
//			System.out.println(set.get(i));
		
		System.out.println(set.size());
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {                     //hasNext메서드: 컬렉션에서 가지고 올 요소 있는지 체크. 
			System.out.println(iter.next());        // next : 요소 선택.
		}
		
		System.out.println("=== ArrayList ===");
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("김길동");
		list.add("홍길동");
		
		System.out.println(list.size());       //3개.
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
