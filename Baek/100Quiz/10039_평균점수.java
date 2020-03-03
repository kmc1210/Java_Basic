package baek;

import java.util.*;

public class Baek_10039 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] Stu = new int[5];
		int Sum = 0;
		for(int i = 0; i<Stu.length; i++)
		{
			if(0<=Stu[i] && Stu[i]<=100){
				Stu[i] = sc.nextInt();
				if(Stu[i]<=40) {
					Stu[i]=40;
						}
			}
			Sum +=Stu[i];
		}
		System.out.println(Sum/5);
		
	}
}
