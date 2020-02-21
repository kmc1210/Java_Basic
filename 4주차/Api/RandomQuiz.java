package java09_api;

import java.util.Scanner;

public class RandomQuiz {
	public static void main(String[] args) {

		//가위바위보 게임 만들기
		Scanner sc = new Scanner(System.in);
		// int user : 사용자 입력 (1~3)
		int user;
		// int com : 컴퓨터 랜덤(1~3)
		int com;
		// 1: 가위, 2:바위, 3: 보
		// 1~3까지 반복
		// 1: 가위, 2:바위, 3: 보
		// I. Random을 이용하여 com에 값 지정
			// com 값을 출력
		// II. user에 입력받기
		// III. com, user 비교 (가위바위보 승부)
		System.out.println("=======가위,바위,보 게임=======");
		System.out.println("1.가위 \t 2.바위 \t 3.보");
		
		while(true) {
			
			com = ((int)(Math.random()*3) +1);
			
			System.out.println("가위,바위,보 ?");
			user = sc.nextInt();
			
			if(user < 1 || user >= 4) {
				System.out.println("[ERROR]");
				if(user == 0 ) {
				System.out.println("[종료]");
					break;}
				
			}
			if(user==1) {System.out.println("유저는 가위를 냈습니다.");}
			if(user==2) {System.out.println("유저는 바위를 냈습니다.");}
			if(user==3) {System.out.println("유저는 보를 냈습니다.");}
			
			if(com==1) {System.out.println("컴퓨터는 가위를 냈습니다.");}
			if(com==2) {System.out.println("컴퓨터는 바위를 냈습니다.");}
			if(com==3) {System.out.println("컴퓨터는 보를 냈습니다.");}
			
			if(com-user == -2 || com-user == 1) {
				System.out.println("[컴퓨터] 승");
				
			} else if(com-user == -1 || com-user == 2) {
				System.out.println("[유저] 승");
				
			} else if(com-user == 0) {
				System.out.println("[무승부]");
				
			} 
		
		// IV. 결과 출력 (승자)
		
		// V. I~IV 반복..
		}
	}
}
	
//4와5를 넣었을 경우 -1,-2가 나오는 예외 처리를 추가해줘야함 ㅠㅠ
