package java02_operator;

public class LogicalTest_02 {
	public static void main(String[] args) {
		
		int a=5, b=6, c=10;
//		 a=5, b=6, c=10;
		
		boolean res1;
		res1 = a<b || --a>c++; // true
		System.out.println("a="+a+",b="+b+",c="+c);
		//OR || 피연산자 둘 중에 하나라도 true일 경우에 true
		// →OR연산자의 왼쪽 피연산자가 참일 경우
		// 오른쪽 피연산자를 확인(연산)하지 않는다.
		
		boolean res2; 
		a=5;
		b=6;
		c=10;
		res2 = c<b++ && c-->++a; // false
		System.out.println("a="+a+",b="+b+",c="+c);
		
		//AND &&는 피연산자 둘다 true일 경우 true
		//	→ AND연산자의 왼쪽 피연산자가 거짓일 경우
		// 오른쪽 피연산자를 확인(연산)하지 않는다.
		
		// 논리연산자의 단축 연산
		
		// Shortcut for Logical Operator
		
	}
}
