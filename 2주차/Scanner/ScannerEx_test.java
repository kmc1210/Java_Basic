package java03_scanner;

import java.util.Scanner;

public class ScannerEx_test {

	public static void main(String[] args) {
		Scanner scanner;
		
		scanner = new Scanner(System.in);
		
		System.out.println("문자열 입력 : ");
		String text = scanner.nextLine();
		System.out.println("하고싶은 말 : " + text);
	}
}
