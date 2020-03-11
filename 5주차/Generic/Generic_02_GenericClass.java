package java11_generic;

import java.util.*;

//class Class02{
//	private int data;
//	
//	public int display(int data) {
//		this.data = data;
//		return data;
//	}
//
//	public int getData() {
//		return data;
//	}
//
//	public void setData(int data) {
//		this.data = data;
//	}
//	
//	
//}

//제네릭 클래스
class Class02<T> {
	private T data;
	public T display(T data) {
		this.data = data;
		return data;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
}



public class Generic_02_GenericClass {
	public static void main(String[] args) {
		
		// T - > String
		Class02<String> c02 = new Class02<>();
		
		c02.setData("Grape");
		String fruit = c02.getData();
		System.out.println("과일 : " + fruit);
		
		//-----------------------------------------
		
		// T -> Integer
		Class02<Integer> c02_1 = new Class02<>();
		
		
	}
}
