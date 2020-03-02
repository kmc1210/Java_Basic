package java10_Collection;

import java.util.*;

public class Collection02_Iterator {
	public static void main(String[] args) {
			List list = Arrays.asList("A", "B", "C", "D", "E");
			//	반복자, Iterator
			//	컬렉션의 모든 요소들을 순차적으로
			//  읽어오는 방법(접근 방법)을 표준화한 것
			
			Iterator iter; //반복자
			iter = list.iterator(); //리스트의 iterator 생성하기
			
			
			while( iter.hasNext() ) {
				System.out.println( iter.next());
			}
			
			//Iterator의 주요 메소드
			// boolean hasNext() : 다음 요소의 존재여부, true/false 반환
			// E next() : 다음 요소 반환
	}
}
