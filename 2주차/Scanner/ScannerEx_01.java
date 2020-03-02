package java03_scanner;

//외부 패캐지에 있는 클래스를 사용할 수 있도록 선언하는 코드
import java.util.Scanner;

public class ScannerEx_01 {
	public static void main(String[] args) {
		
		 //변수 선언
		
		Scanner scanner; //입력객체 변수 선언
		//스캐너에서 오류가 나면 어디있는지 몰라서 오류가 나는 경우도 있기 때문에
		//import 가져오기를 이용해서 어디있는지 위치를 알려줘야한다.
		scanner = new Scanner(System.in);
		
		
		System.out.print("문자열 입력 :");
		String text = scanner.nextLine(); //입력한 문자열을 처리하는 메소드
		// nextLine() : 입력한 문자열을 처리하는 메소드(기능)
		// println에서 ln을 지운 print로 바꿔쓰면 줄이 내려가지 않는다.
		System.out.println("입력한 문자열 : " + text);
	}
}
