package java01_variables;

public class VariablesEx_02 {
	
	public static void main(String[] args) {
		
		//1. 변수 선언
		// int형 변수 num 선언하기
		
		//2. 변수에 값 대입
		// num변수에 333 저장하기
		
		//3. 변수의 값 출력하기
		// Console창에 출력되도록 하기
		
		int num;
		num = 333;
		System.out.println(num);
		// + 기호 : 문장(문자열) 연결 기능
		System.out.println("num변수의 값 : " + num);
//		System.out.println("num변수의 값 : " + 333);
		
		
		// -----------------------------------------------------------
		
		double heightAvg; //반 평균 키
		heightAvg =  200.5;
		System.out.println("반 평균 키 : " + heightAvg);
		
		// -----------------------------------------------------------

		char alpha;
		alpha = '하';  //''안에 썼을 시 A는 65로 인식 해서 글자를 인식함.
		
		System.out.println(alpha);
		
		// -----------------------------------------------------------
		
		boolean isEmpty;
		isEmpty = false;
		System.out.println("논리형 변수의 값 : " + isEmpty);
		
		// -----------------------------------------------------------
		
		
		int sum; //합계
		
		sum = num + 100;
		//sum = 333 + 100;
		//sum = 433
		
		System.out.println(sum);
		
		}

}
