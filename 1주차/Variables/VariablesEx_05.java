package java01_variables;

public class VariablesEx_05 {
	public static void main(String[] args) {	
		
		
		
		System.out.println( 777 );  // 리터럴 상수 777
		
		int num = 500 + 600;
		
		System.out.println( num );
		
		// -----------------------------------------------------
		
		
		//이름있는 상수
		
		final int MAX; // final 을 붙이면 변수의 상수화 (더이상 값을 바꿀 수 없음)
		
		MAX = 100; // 딱 한번만 대입이 가능. 이후 100으로 고정됨
//		MAX = 200; // 변수의 상수화를 했기 때문에 200으로 바뀌지 않고, 다시 대입하기 불가능 - 에러
		
		System.out.println("최대값 : " + MAX);
		
		// 관례적으로 상수화된 변수의 이름은 모두 대문자로 작성.
		
		// -----------------------------------------------------
		
		
		final int student_Num = 10; // 총인원
		
		int sum = 976; //총점
		
		double avg; //평균
		
		avg = sum  / (double)student_Num;
		
		System.out.println("총 인원 : " + student_Num + "명");
		System.out.println("평균 : " + avg + "점");
		
		
		
		
		
		// -----------------------------------------------------
	}
}
