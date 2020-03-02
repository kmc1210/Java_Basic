package java03_scanner;

import java.util.Scanner;


public class ScannerEx_03 {

	public static void main(String[] args) {
		
		//문자열
		
		// java.lang 패키지
		// 자바 프로그래밍에 필요한 기본적인 클래스를 모아 놓은
		// 패키지
		// java.lang패키지는 별도의 import 없이 사용 가능하다.
		
		String str = "Apple";
					//01234
//		String str2 = new String("Banana");
		
		char ch = str.charAt(3); //String 타입을 가진 변수
		// 지정된 위치의 문자를 반영해 주는 것
		
		System.out.println(ch); //결과가 l 이 나오는 이유는 0부터 시작하기 때문에 A(0)부터 l(3)까지라서 결과가 l이 나온다.

		
		System.out.println("----------------------");
		
		//Scanner로 단일문자 (char형) 받기 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력: ");
		String inputData = sc.nextLine(); //문자열 입력
		
		char inputChar = inputData.charAt(0);
		System.out.println("0번째 단일문자 : " + inputChar);
		
		System.out.println("----------------------");

		System.out.println("입력 문자 입력 받기 : ");
		char inputChar2 = sc.nextLine().charAt(0);
		System.out.println(inputChar2);
		//단일 문자 출력하기

		System.out.println("----------------------");
		
		// 이 방법 말고 위에 있는 변수에 저장해서 사용하는 방법을
		// 사용하기!
		System.out.println("성별 입력 : ");
		System.out.println("입력한 성별 :" + sc.nextLine().charAt(0));
		
	}
}
