

import java.util.*;

public class Baek_10093 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력하시오 : ");
		
		long A = sc.nextLong();
		long B = sc.nextLong();
		
		if(B>A) {
		System.out.println(B-A-1);
		for(long i=1; i<=(B-A)-1; i++) {
			System.out.print(A+i+" ");
			}
		}//B가A보다 클 경우
		
		else if(A>B) {
		System.out.println(A-B-1);
		for(long i=1; i<=(A-B)-1; i++) {
			System.out.print(B+i+" ");
			}
		}
		
		else if(A==B) {
		System.out.println(A-B);
		}
	}
}
