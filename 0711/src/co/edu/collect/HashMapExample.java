package co.edu.collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * (키:값) 쌍으로 저장 => Map.
 */
public class HashMapExample {
	public static void main(String[] args) {
		//학생이름, 점수
		Map<String, Integer>map = new HashMap<String,Integer>();
		map.put("홍길동", 80);
		map.put("김민수", 85);
		map.put("최기동", 92);
		map.put("홍길동", 89);     // 키 동일한 값이면 val 새로운 값으로 변경.
 		
		int score =map.get("홍길동"); // 값을 얻으려고 키를 get() 사용. 
		System.out.println(score);
		
		map.remove("홍길동");
				
		//반복요소.
		Set<String> keySet = map. keySet(); // "키" => 새로운 set 컬렉션 타입 set타입
		
		//확장 for.
		for(String key : keySet) {
			Integer val = map.get(key);   // value 값 가져오기: get(키)
			System.out.println("키: " + key+", 값: "+val);
			
		}
		// 키, 값 => entrySet()
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		for(Entry<String, Integer> ent :entrySet) {
			String key = ent.getKey();  //키에 해당하는 값. 
			Integer val = ent.getValue();  // 값
			System.out.println("키: "+ key+", 값: "+ val);
		}
		
		
	}

}
