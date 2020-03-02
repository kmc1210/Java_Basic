package baek;

import java.util.*;
public class Baek2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[9];
		
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}//배열에 입력
		
		int max = num[0];
		int cnt = 1;
		for(int i = 1; i<num.length; i++) {
			if(max<num[i]) {
				max = num[i];
				cnt = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(cnt);
	}
}
//cnt값 0으로 초기화해줬다고 틀렸었는데 1로 바꾸니까 맞음;;
//어차피 상관없을텐데 이상하넹
