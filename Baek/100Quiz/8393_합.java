package baek;

import java.util.*;

public class Baek_8393 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Num = sc.nextInt();
		int sum = 0;
		for(int i=0; i<=Num; i++) {
			sum += i; 
		}
		System.out.println(sum);
	}
}
