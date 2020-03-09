package java10_Collection;

import java.util.*;

public class Collection04_HashSet {
	public static void main(String[] args) {
		
//		Set set = new HashSet(); // 무작위
//		Set set = new LinkedHashSet();// 삽입된 순서를 유지
		Set set = new TreeSet(); // 정렬된 상태를 유지
		
		set.add(30);
		set.add(20);
		set.add(10);
		set.add(10);
		set.add(20);
		set.add(30);
		//순서는 무작위, 중복값 거름
		System.out.println(set);
		
		System.out.println("=================");
		
		Iterator iter = set.iterator(); // 반복자(iterator) 생성
		
		//Set의 모든 요소 출력하기
		while( iter.hasNext()) {
			System.out.println( iter.next() );
		}
		System.out.println("=================");
		
		Object[] arr =  set.toArray(); // Set -> 배열
		
		System.out.println( Arrays.toString(arr) );
		//Array"s" ,  Object"s" s가 붙어있으면 해당 내용을 도와주는 api!?
		System.out.println("=================");
		
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		System.out.println("=================");
		
		//Set 을 이용한 ArrayList 만들기
		List list = new ArrayList(set);
		System.out.println(list);
		
		System.out.println("=================");
		
		System.out.println("크기 : " + set.size());
		System.out.println("비어있는가? " + set.isEmpty());
		System.out.println("222가 존재하는가? " + set.contains(222));
		System.out.println("30을 제거 : " +set.remove(30));
		
		System.out.println(set);
		
		set.clear(); //모든 요소 제거하기
		System.out.println("비어있는가? " + set.isEmpty());
		System.out.println(set);
	}
}
