package test;

import java.util.*;

public class Up_Down {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int user;
		int com = (int) ((Math.random()*50)+1);
		int cnt=1;
		System.out.println("====UP&DOWN====");
		while(true) {
			System.out.print("1~50까지의 숫자를 입력하시오 : ");
			user = sc.nextInt();
			
			if(com==user){
				System.out.println("정답!");
				System.out.println("Com의 숫자는" + com + "였습니다.");
			break;
			}
			
			else if(com<user){
				System.out.println("DOWN");
				cnt++;
			}
			
			else{
				System.out.println("UP");
				cnt++;
			}

			if(cnt==7) { //count end
				System.out.println("[GAME OVER]");
				System.out.println("7번의 기회 내에 못맞추셨습니다.....");
				System.out.println("정답은 :" + com + "이였습니다.");
				break;
			}
			
		}//while_end
		
	}
}
