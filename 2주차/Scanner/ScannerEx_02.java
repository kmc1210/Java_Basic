package java03_scanner;

import java.util.Scanner;

public class ScannerEx_02 {
	public static void main(String[] args) {
		
		// int형 데이터 입력받기, 출력해보기
		
		
		// 1.입력객체 변수 선언
		Scanner in;
		
		// 2. 입력객체 생성(new 연산자 이용)
		in = new Scanner(System.in);
		
		// 3. int형 데이터 입력받기
		System.out.print("정수값 입력 : ");
		int num = in.nextInt();
		
		// 4. 입력받은 int데이터 출력
		System.out.println("입력받은 정수 : " + num);
		

		//		ctrl + F7 : 작업중인 창의 포커스(커서)를 
		//			다른 곳으로 이동 시키기.
	}
}
