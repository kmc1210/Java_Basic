package java11_generic;

import java.util.*;
import java.io.*;

public class Generic_01_Basic {
	public static void main(String[] args) {
		
		List list = new ArrayList(); //노란색 밑줄 : Warning 문제가 될 수 있으니 점검해보라는 의미
		//타입파라미터 E 를 결정하지 않아 Object로 사용됨
		
		list.add(123);
		list.add("Apple");
		
		System.out.println(list);
		
		System.out.println("=========================");
		
		// List <String> list2 = new ArrayList<String>();
		List <String> list2 = new ArrayList<>();
		// 타입파라미터 E -> String 지정
		// 객체 생성시 generic의 데이터타입이 같아야한다. 
		// 그러므로 뒤에 String은 적지않아도 된다.
		list2.add("A");
		// list2.add(12);//에러
		
		//==================================
		
		// 타입파라미터로 기본데이터타입 사용 불가 = Wrapper클래스 사용 
//		List<int> list3 = new ArrayList<>();
		List<Integer> list3 = new ArrayList<>();
		
		list3.add(123); // int 상수 오류x / 자동변경됨
		
		//==================================
		
		// 타입 안정성
		// 	개발자가 의도한 데이터타입으로만 사용
		
//		list2.add(true); //String으로만 사용 가능하다
//		list3.add("안녕"); //에러, Integer만 사용가능
		
		//==================================
		
//		String str1 = list.get(1); //타입 안정성이 없어서 오류가 남
		String str1 = (String) list.get(1); //형변환이 필요하다.
		
		String str2 = list2.get(1); // 형변환이 필요없다.
		
	}
}
