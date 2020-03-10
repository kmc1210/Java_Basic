package java10_Collection;

import java.util.*;
import java.io.*;

public class Collection07_Stack {
	public static void main(String[] args) {
		//스택
		
		Stack stack = new Stack();
		
		stack.push("Apple");
		stack.push("Banana");
		stack.push("Cherry");
		
		System.out.println(stack);
		
		System.out.println("-------------------");
		
		System.out.println(stack.pop()); //cherry
		System.out.println(stack.pop()); //banana
		
		System.out.println("-------------------");
		
		System.out.println(stack);
		System.out.println(stack.size());
		
		System.out.println(stack.isEmpty()); //Vector로부터 상속받아 사용 - 비어있는지 확인
		System.out.println(stack.empty()); //Stack꺼 - 비어있는지 확인
		//둘이 차이는 없으나 stack꺼를 사용하는게 좋지 않을까?
		
		System.out.println("-------------------");
		
		stack.push("Grape");
		stack.push("Mango");
		stack.push("Peach");
		
		
		//Stack이 비어있지 않으면 반복한다.
		//Stack에 데이터가 있으면 반복한다.
		while( !stack.empty()) {
			System.out.println(stack.pop());
		}
		
		
	}
}




