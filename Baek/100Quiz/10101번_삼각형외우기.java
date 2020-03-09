import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int [] tri = new int[3];
		int sum = 0;
		for ( int i=0 ; i<tri.length; i++) {
			tri[i] = sc.nextInt();
			sum += tri[i];
		if(sum==180 && tri[i]==60) {
			System.out.println("Equilateral");
			}
		}
		
		
		
		if(sum==180 && tri[0]==tri[1]) {
			if(tri[0]!=tri[2]) {
				System.out.println("Isosceles");
			}
		}
		if(sum==180 && tri[0]==tri[2]) {
			if(tri[1]!=tri[2]) {
				System.out.println("Isosceles");
			}
		}
		if(sum==180 && tri[1]==tri[2]) {
			if(tri[0]!=tri[1]) {
				System.out.println("Isosceles");
			}
		}
		if(sum==180 && tri[1]!=tri[2] && tri[0]!=tri[2]) {
			if(tri[0]!=tri[1]) {
				System.out.println("Scalene");
			}
		}
		
		if(sum!=180) {
			System.out.println("Error");
		}
	}
}
