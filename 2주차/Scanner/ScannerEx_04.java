package java03_scanner;

import java.util.Scanner;

public class ScannerEx_04 {
	public static void main(String[] args) {
		
		//문자열 입력 처리 메소드
		// nextLine(), next()
		
		
		// ctrl + shift + o : import organize
		// Source 메뉴에도 있음
		
		Scanner sc = new Scanner(System.in);
		
		String str1;
		String str2;
		//문자열 입력 받기
		System.out.println("Input String : ");
		str1 = sc.nextLine();
		str2 = sc.nextLine();
//		str1 = sc.next();
//		str2 = sc.next();
		
		sc.nextInt();
		
//		nextLine() : 개행문자(엔터키)를 기준으로 문자열 구분
//		next() : 공백문자를 기준으로 문자열 구분
		
		
		System.out.println(); //개행, 줄바꿈
		System.out.println("------출력------");
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
	}
}
