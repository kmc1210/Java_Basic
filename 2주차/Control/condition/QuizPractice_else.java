package java04_control.condition;

import java.util.Scanner;

public class QuizPractice_else {

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.println("input의 값은 ?:");
			int input = in.nextInt();
			System.out.println("input2의 값은 ?:");
			int input2 = in.nextInt();
			
			if(1<=input) {
				System.out.println("양수입니다");
				} else {System.out.println("홀수입니다.");}
			
			if(input>input2) {
				System.out.println("큰 수는 ?: " + input);
			} else {System.out.println("큰수는 ?: " + input2);
		}
	}
}
