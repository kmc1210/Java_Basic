package java01_variables;

public class VariablesEx_04 {

	public static void main(String[] args) {
		
		//학생의 나이
		int student_age;
		int studentAge; //권장
		// 띄어쓰기 안됨
		
		// -----------------------------------------------
		
//		int 1stNumber; // 숫자로 시작하면 안된다.
		int firstNumber;
		
//		int int //키워드(예약어) 사용 금지 int는 예약어 이므로 사용불가.
		int intNum;
		
		//------------------------------------------------
		
		//에러는 아니지만 사용하지 말아야할 이름들
		
		//ex) 	int _;, int ________;, int __________________;, int $$;, int a;, int b;, int c; 등과 같은 의미없는 변수명은 사용 X
		
//		int num; 
//		int num; //변수명이 중복될 경우 불가
//		int _num;
//		int num_;
//		int $num; //구분이 명확하지 않은 변수명도 사용X
//		
//	
//		int num1;
//		int num2;
//		int num3; // 같은 이름을 여러 번 사용하고 싶다면 숫자를 붙여서 사용해 주기
//
//		// ------------------------------------------------
//		
		int area; //넓이
		
		int 넓이; 	//유니코드를 사용하여 변수명으로 한글을 사용 가능하긴 하지만 기반이 영어로 돼있기 때문에 가능한 한 영어로 사용해주는게 좋다.
		넓이 = 100;
		System.out.println("넓이는 " + 넓이 + "입니다."); //한글로 변수명 X!
		
	}

}
