package java11_generic;

import java.util.*;

public class Generic_09_Wildcard {
	
	
	public static void display(List<?> list) { // "?"를 generic에서 Wildcard 라고 한다.
//	public static void display(List<? extends Number> list) { 
//	public static void display(List<? super String> list) { 
		for( Object o : list) {
			System.out.println( o );
		}
	}
	
	public static void main(String[] args) {
		
		List<Integer> iList = Arrays.asList(10, 20, 30);
		display(iList);
		
		System.out.println("=====================");
		
		List<String> sList = Arrays.asList("A", "B", "C");
		display(sList);
		
		System.out.println("=====================");
		
		Object o = null;
		Integer i = null;
		
		o = i; // Object클래스는 Integer의 부모클래스
		System.out.println("=====================");
		
		//제네릭은 자바의 기본 상속구조를 무시한다.
		
		List<Object> ol = null;
		List<Integer> il = null;
		
//		ol = il; //에러
		
	}
}
