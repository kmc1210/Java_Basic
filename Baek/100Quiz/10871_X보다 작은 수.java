import java.util.*;

public class Baek_10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int [] A = new int[N];
		//원래대로 풀때
		for(int i=0; i<N; i++)
		{
			A[i] = sc.nextInt();
		}
		
		for(int i = 0; i<N; i++) {
			if(A[i]<X) {
		System.out.print(A[i] + " ");
			}
		}
		
		
	}
}

//임의의 수를 받았을 경우

//		for(int i=0; i<N; i++) {
//			A [i] = ((int)(Math.random()*N)+1); 
//			System.out.print(A[i] + " ");
//		}
//		System.out.println();
//		for(int i =0; i<N; i++) {
//		if(A[i]<X) {
//			System.out.print(A[i] + " ");
//			}
//		}
