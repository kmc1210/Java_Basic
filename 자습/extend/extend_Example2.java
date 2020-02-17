package extend_example;

import java.util.Scanner;

class SuperClass{
	int a, b; //필드
	public void setA(int a) {
		this.a = a; //this.a를 통해 필드 a값 설정 
	}
	public void setB(int b) {
		this.b = b; // 필드 b값 설정
	}
	public void sum() {
		System.out.println("덧셈 :" + (a+b));
	}
	public void substract() {
		System.out.println("뺄셈 :" + (a-b));
	}
}

class SubClass extends SuperClass{
	public void mul() {
		System.out.println("곱셈 : "+ a * b);
	}
	public void div() {
		System.out.println("나눗셈 : " + a / b);
	}
}

public class SuperSubEx02 {
	public static void main(String[] args) {
		System.out.println("2개의 정수 입력");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		SubClass sub = new SubClass();
		sub.setA(a);//매개값 전달
		sub.setB(b);//매개값 전달
		sub.sum();
		sub.substract();
		sub.mul();
		sub.div();
	}
}
