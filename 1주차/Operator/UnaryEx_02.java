package java02_operator;

public class UnaryEx_02 {
	public static void main(String[] args) {

		//단항연산자 - 증감
		
		// ++ : 증가 연산자
		// -- : 감소 연산자
		
		// 피연산자로 적용된 변수의 값을 1 증가/감소시킨다
		
		int num;
		num = 15;
		System.out.println(num); // 원본
		System.out.println(num--); //연산 중, 후위, 후치 // 활용 후 감소시킴
		System.out.println(num); //연산 후
		
		System.out.println("------------------------");
		
		num = 15;
		System.out.println(num); // 원본
		System.out.println(--num); //연산 중, 전위, 전치 // 활용 전 감소시킴
		System.out.println(num); //연산 후
		
		
		System.out.println("------------------------");
		
		num = 15;
		
		System.out.println( num++ *3);
		System.out.println( num *3);
		
		System.out.println("------------------------");
		
		num = 15;
		System.out.println( ++num *3);
		
		System.out.println("------------------------");
		// 코드 가독성이 떨어질 수도 있으니
		// 최대한 증감연산자를 단독으로 쓰도록 하는 것이 좋다.
		
		System.out.println( num+++num);
		
		num = 15;
		num++;
		num+= 30;
		System.out.println( num );
		
		System.out.println("------------------------");
		
		// 변수의 값을 1 증가시키기
		
		int n = 13;
		
		n = n + 1;
		
		n += 1;
		
		n++; // 이걸 많이 사용함
		
		
		
		n += 4; // 두개 이상 코드를 쓸 경우 +=, -= 같은 종류를 사용
	
	
	
	
	
	}
}
