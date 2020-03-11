package java11_generic;

import java.util.*;

//일반 클래스
class Class03 {
	
	//일반 메소드
	public void display(int num) {
		
	}
	
	//제네릭 메소드
	public <T> T print(T t) { // 반환타입, 매개변수, 지역변수에서 사용할 수 있다.
		T data = null; // 형변환에도 사용할 수 있다.
		return data;
	}
	
}

//제네릭 클래스
class Class03_2<T>{
	
	//제네릭 메소드
	public <K> void print(K obj, T data) {} //이런 경우도 가능하지만
//	거의 없는 경우이므로 문법적으로 가능하다고 만 알고있는게 좋다
}


public class Generic_03_GenericMethod {
	public static void main(String[] args) {
		
		Class03 c03 = new Class03();
		
		//==============================
		
		c03.print(123); //타입파라미터를 전달하지 않음, T -> Integer
		
//		c03.<Double>print(555); //T -> Double
		c03.<Double>print(55.5); //T -> Double
		
	}
}
