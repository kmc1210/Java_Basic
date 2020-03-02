package java03_scanner;

import java.util.Scanner;

public class ScannerEx_05 {

	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in); // 키보드 입력 객체
		System.out.println("--- 입력 ---");
		System.out.println("Input Number : "); //Input Number에 입력한 내용이 입력버퍼에 들어가 있음
		int num = sc.nextInt();
		System.out.println("Input String : ");
		sc.nextLine(); //버퍼의 '\n' 지우기
		String str = sc.nextLine();
		//문자부터 입력받으면 문제가 없지만 숫자부터 입력받으면 문자가 써지기 전에 출력돼버림
		
		System.out.println();
		System.out.println("-----출력-----");
		System.out.println("숫자 : " + num);
		System.out.println("문자열 : " + str);
		
		// nextLine()  메소드 사용하기 전에 nextLine()이외의
		// 모든 next() 계열 메소드를 사용한 적이 있다면
		// nextLine() 직전에 nextLine()을 한번 더 실행해야한다.
		// ->버퍼에 남은 '\n' 제거하기
		
		
		//해결하기 위해서는 사이에 sc.nextLine() 을 한 번 더 끼워주면 를 가져가줘서 제대로 출력할 수 있다.
	}
}













