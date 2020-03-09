package java10_Collection;

import java.util.*;

public class Collection05_Map {
	public static void main(String[] args) {
		
		
		Map map = new HashMap();
		
		//삽
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Cherry");
		
		System.out.println("map : " + map);
		
		System.out.println("\n---get()-------");//조회
		System.out.println(map.get(3)); // 3=Cherry
		System.out.println(map.get(5)); // null, key가 없을 때
		
		System.out.println("\n---put()-------");
		map.put("D", "Durian");
		System.out.println("map : " + map);
		
		System.out.println("get(\"D\") : " + map.get("D"));
		
		System.out.println("\n======================================================\n");
		
		map.put(2,  "Orange"); //기존에 존재하는 key
		map.put(4,  "Apple"); //존재하지않는 key, 기존에 존재하는 value
		
		System.out.println("map : " + map);
		
		System.out.println("\n========contains()============\n");
		
		System.out.println("key 5 : " + map.containsKey(5));
		System.out.println("value \"Apple\" : " + map.containsValue("Apple"));
		
		// 5라는 key가 존재하지 않을 경우에 데이터 삽입
		if( !map.containsKey(5)) {
			map.put(5, "Grape");
		}
		
		if(map.containsKey(555)) {
		String str = (String)map.get(555);
		System.out.println( str.length() ); 
		} else {
			System.out.println("[ERROR] 555 키가 없음");
		}// 예외 처리 : 예외적으로 발생할 수 있는 문제에 대한 안정적으로 처리
		// NullPointer는 문제부분의 "."에서 왼쪽의 부분이 Null이기 때문에 에러 발생 시 확인.
		
		System.out.println("\n----size()--------");
		
		System.out.println(map.size());
		
		System.out.println("\n----isEmpty()--------");
		
		System.out.println(map.isEmpty());
		
		System.out.println("\n----remove()---------");//제거
		
		map.remove(3); //Key가 3인 Entry를 제거
		System.out.println(map);
		
		map.remove(2, "Apple"); //좀 더 안전하게 Key만 지우는게 아니라 Value도 확인해서 제거
		// Key가 2인 Entry의 Value가 "Apple"일 때 제거
		System.out.println(map);
		
		System.out.println("\n======null값 처리======");
		
		map.put(null, "Bob"); //key가 null인 상황은 좋지 않음
		map.put(10, null);
		
		System.out.println(map);
		
		map.put(null, null);
		System.out.println(map);
		
		
		System.out.println("\n================map -> set===============");
		//map에서 set을 추출하는 방법 2가지
		
		Set keySet = map.keySet(); // key들을 Set으로 추출
		
		Set entrySet = map.entrySet(); // Entry(key-value쌍)들을 Set으로 추출
		
		System.out.println("keySet : " + keySet);
		System.out.println("entrySet : " + entrySet);
		
		System.out.println("========================");
		
		Set keys = map.keySet(); //key Set
		
		Iterator iter = keys.iterator(); // KeySet의 반복자 생성
		
		while(iter.hasNext()) {
			Object key = iter.next(); // key 꺼내기
			
			System.out.print(" "+ map.get(key)); // key에 해당하는 Value출력
		}
		
		
	}
}
