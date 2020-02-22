import java.util.ArrayList;
import java.util.Scanner;

public class BaekQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i=1; i<=N; i++) {
			for(int j=1; j<=N-i; j++) {
				System.out.print(" ");
				}
			for(int j=1; j<=i*2-1; j++) {
				System.out.print("*");
				}
				System.out.println();
		}//for_end .1 
	}
}
