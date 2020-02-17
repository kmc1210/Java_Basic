package java02_operator;

public class BinaryEx_02 {
	public static void main(String[] args) {
		
		//	ctrl + space : 자동완성 추천 단축키
		
		System.out.println("하이!");
		System.out.println("둘!");
		System.out.println("셋!");
		
		//	ctrl + alt + 방향키 : 커서가 위치한 줄을 복사
		//	ctrl + d :  커서가 위치한 줄 삭제
		//	alt + 방향키 : 커서가 위치한 줄을 위/아래로 이동
		//	ctrl + 방향키 : 화면만 위/아래로 이동
		//	이항연산자 - 대입(Assign)
		//  =
		
		// 	오른쪽에 있는 값을 왼쪽에 있는 공간(변수)에 저장
		
		// 	변수 = 값(변수, 데이터, 값 등);
		
		// 연산자 우선순위가 최하위에 있다.
		// 연산 방향이 오른쪽에서 왼쪽이다.
		
		
		int num1 = 10; //10대입
		int num2 = 20; //20대입
		
		num1 = 11; //11대입
		num2 = 22; //22대입
		
		
		// ----------------
		
		int num3  = num2; // 오른쪽에 변수를 쓰면 변수에 저장된 값을 활용
//		int num3  = 22; 
		// -----------------------
		
		int num4;
		int num5;
		int num6;
	
		num6 = num5 = num4 = num3; 
//		num6 = num5 = num4 = 22; 
//		num6 = num5 = 22;
//		num6 = 22;
//		22;
		// 오른쪽에서 왼쪽으로 대입하는 순으로 진행
		
		System.out.println(num3);
		
		// -----------------------


		
		
		
		
		// 복합대입연산자 - 산술대입
		// += -= *= /= %=
		
		System.out.println("--- 산술대입 연산 전 ---");
		System.out.println("num1 :" + num1);
		System.out.println("num2 :" + num2);
		
		num2 += num1 ;  //산술대입
//		num2 = num2 + num1; "+="의 의미는 왼쪽의 값을 불러와서 계산후 다시 저장한다는 의미
		
		System.out.println("--- 산술대입 연산 후 ---");
		System.out.println("num1 :" + num1);
		System.out.println("num2 :" + num2);
		
		// -----------------------
		
		
		num2 -=num1; // -= 산술복합대입연산자 (이항)
		
		num2 =-num1; // = 대입연산자 (이항), - 부호변환연산자(단항)  
		
		//-=의 경우는 띄어쓰기를 할 경우 에러가 뜨지만 =- 의 경우 -num1로 음수처리 되기때문에 아예 다른 연산
		//대입 연산자가 항상 오른쪽에 있어야하고 붙여서 써야한다.
		
		
		// -----------------------
		
		
		// -----------------------
	}
}
