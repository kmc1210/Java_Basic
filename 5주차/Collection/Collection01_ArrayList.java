package java10_Collection;

import java.util.*;

public class Collection01_ArrayList {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		//자료구조에서 자주 사용되는 동작(로직, 알고리즘)
		// CRUD 작업
		// Create 	- 추가/삽입
		// Read 	- 조회 /탐색
		// Update 	- 수정/변경
		// Delete 	- 삭제/제거
		
		System.out.println("\n====삽입====");
		
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		
		//데이터 삽입의 순서유지
		System.out.println( list ); 
		
		System.out.println("\n====조회====");
		
		System.out.println( list.get(1));//Banana
		
		System.out.println("\n========");
		
		for(int i=0; i<list.size(); i++) {
			
			System.out.println(list.get(i));
		}
	}
}
