package java02_operator;

public class BinaryEx_04 {
	public static void main(String[] args) {
		//이항연산자 - 논리
		// && || !
		// ( ! 연산자는 단항 연산자)
		
		// && : AND - 두 개의 항이 모두 true 일 때 결과가 true 를 리턴
		// || : OR  - 둘 중 하나라도 true 일 때 결과가 true 를 리턴
		// ! : NOT	- 부정, true는 false로 false는 true로 변환
		
		// true && false
		// false || false
				
		//--------------------------------------------
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("true&&false : " + (b1&&b2));
		System.out.println("true||false : " + (b1||b2));
		System.out.println("!false : " + !b2);
		
		System.out.println("---------------------");
		
		int num = 88;
		System.out.println( (num>=1) && (num<=100) );
//		System.out.println( (88>=1) && (88<=100) );
//		System.out.println( ture ) && (88<=100) );
//		System.out.println( ture   &&  ture );
//		System.out.println( true );
		
		//num변수가 1보다 크거나 같으면서 100보다 작거나 같은가?
		//num변수가 1~100사이의 숫자인가?
		
		System.out.println("---------------------");
		
//		System.out.println(1 <= num <= 100);
//		System.out.println(1 <= 88 <= 100);
//		System.out.println(true <= 100); 왼쪽부터 논리연산을 하는데 왼쪽의 결과가 true가 나온 후 true 와 100은 연산이 되지않는다.
//		*** 에러! "<=" 연산자는 boolean, int형을 연산할 수 없다.
		
		System.out.println("---------------------");

		System.out.println( !((num>=1) && (num<=100)) );
//		System.out.println( !((88>=1) && (88<=100)) );
//		System.out.println( !(true && (88<=100)) );
//		System.out.println( !(true && true) );
//		System.out.println( !(true) );
//		System.out.println( false );
		
		System.out.println("---------------------");
		System.out.println( !((num>=1) && (num<=100)) );
		
//		System.out.println( (num<1) !&& (num>100) );
		
		System.out.println( (num<1) || (num>100) );
		
		// !&&(AND) = ||(OR) , !||(OR) = &&(AND)
	}
}

















