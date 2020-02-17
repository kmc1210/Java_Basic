package java02_operator;

public class TernaryEx {
	public static void main(String[] args) {
		//삼항연산자 - 조건
		// 삼항조건연산자
		// 삼항연산자
		// 조건연산자
		
		// 조건식 ?	참일때 반환하는 값	: 거짓일때 반환하는 값  
		
		// ** 조건식 : 연산의 결과를 true/false(boolean) 로 
		//  판별할 수 있는 연산식
		
		int num1 = 10, num2 = 20;
		
		System.out.println( num1>num2 ? "num1이 크다" : "num1이 크지 않다");
//		System.out.println( 10>20 ? "num1이 크다" : "num1이 크지 않다");
//		System.out.println( false ? "num1이 크다" : "num1이 크지 않다");
//		System.out.println( "num1이 크지 않다");
		
		
		
		//----------------------------------------
		// num1과num2 중에서 작은 수를 저장한다.
		int result = num1<num2 ? num1 : num2;
//		int result = 10<20 ? 10 : 20;
//		int result = true ? 10 : 20;
//		int result = 10;
		
		num1 = 11;
		num2 = 22;
		// num1과 num2중에서 큰 수를 저장한다.
		int res = num1>num2 ? num1 :num2;
		System.out.println("더 큰 수 : " + res);
		
	}
}


