package java04_control.condition;

public class If_02 {
	public static void main(String[] args) {
		
		int num = 10;
		
		if( num != 15 ) 
		
		{
			System.out.println("HI");
			
			//중괄호는 코드를 묶어주는 역할을 한다.
			//프로그램 수행 순서에는 영향을 미치지 않는다.
			System.out.println("---------------------------");
			{
				System.out.println("Apple");
				System.out.println("Banana");
				System.out.println("Cherry");
		}
		System.out.println("Hello");
	}
		System.out.println("---------------------------");
		//제어문은 제어문 다음에 오는 한 개의 요소(코드)에만 영향을 준다.
		if(false)
				System.out.println("if 문");
		System.out.println("if문 밖");

	if(false) {
		System.out.println("Apple");
		System.out.println("Banana");
		System.out.println("Cherry");
		
	}
	System.out.println("if문 밖");
	
	System.out.println("-----------------------");
	
	if( false );{ //제어문 뒤에 ; 붙이는거 조심하기!
		
				System.out.println("Hi");
				System.out.println("Hello");
				System.out.println("Hola");
		
		
	}
	
	// 제어문은 {}없이 코드 한개를 제어하기도 하고
	// {}있는 코드 그룹 한 개를 제어하기도 하는데
	
	// 우리는 반드시! 코드가 한 줄이어도 무조건! {}를 합시다.
	}
}
