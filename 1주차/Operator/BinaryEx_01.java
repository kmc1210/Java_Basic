package java02_operator;

public class BinaryEx_01 {
	public static void main(String[] args) {
		
		// 이항연산자 - 산술
		//  +  -  *   /  %
		
		int num1 = 17, num2 = 4; //피연산자
		
		int n1, n2 , n3, n4 ; // 변수를 여러개 선언시 , 사용
		int result; //연산 결과 저장
		
		result = num1 + num2;
		//result = 17 + 4; // num1, num2 변수의 값 활용
		//result = 21; // + 연산 결과값 반환(리턴)
		//result 변수에 21이 저장된다.
		   	   //↑Assign 대입연산자 
		System.out.println("연산 결과 : " + result);  //system.out 자동완성	syso,sysout + ctrl + space 
//		System.out.println("연산 결과 : " + 21);
//		System.out.println("연산 결과 : 21");
		
		System.out.println("----- 나머지 연산자 -----");
		// % : 나머지 연산자 , modular, mod
		
		result = num1 % num2;
		System.out.println("나머지 연산 결과 : " + result);
		
		
		System.out.println();
		System.out.println("----- 산술 연산자 -----");
		
		System.out.println("num1 + num2 = " + (num1+ num2)); 
		// 현재 답은 21 이지만 ()괄호를 넣지않으면 앞에서 부터 수행해 버리기 때문에 17 과 4가 붙어버려서 아래처럼 174가 결과로 나옴
//		System.out.println("num1 + num2 = " + 17+ 4);
//		System.out.println("num1 + num2 = 17" + 4);
//		System.out.println("num1 + num2 = 174");  ()를 넣지 않으면 순으로 계산이 돼버린다.
		
		System.out.println("num1 - num2 = " + (num1-num2)); // 빼기
		System.out.println("num1 * num2 = " + (num1*num2)); // 곱하기
		System.out.println("num1 / num2 = " + ((double)num1/num2)); // 나누기, 몫
		System.out.println("num1 % num2 = " + (num1%num2)); // 나머지
		
		// 연산은 반드시 피연산자들이 같은 데이터타입을 가지고 있어야 한다.
		// 산술 연산의 결과는 피연산자의 데이터타입과 같다.
		
		System.out.println("-----");
		System.out.println( num1/num2 ); // int/int →int
		System.out.println( (double)num1/(double)num2 ); // double/double →double  (double도 괄호 안에 넣어줘야 강제로 double 실수형으로 변환 가능)
//		System.out.println( (double)17/(double)4); - int에서 double로 강제형변환
//		System.out.println( 17.0/4.0);
//		System.out.println( 4.25);
		
		// 서로 다른 데이터타입의 연산을 수행하려면 형변환해야한다.
		
		System.out.println( num1/(double)num2 );
//		System.out.println( 17/(double)4 ); int /(double)int → 강제형변환
//		System.out.println( 17/4.0 ); int/double
//		System.out.println( 17.0/4.0 ); double/double → 자동형변환
//		System.out.println( 4.25 ); // double
		
	}
}
