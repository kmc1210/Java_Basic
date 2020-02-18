import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int sum=0;
				int b=0;				
				
				int [] book = new int [10];
				for( int i=0; i<book.length; i++ ) {
					book[i] = sc.nextInt();
					if(i>0)
					sum +=  book[i];
					b = book[0] - sum;
				}
				System.out.println(b);
			}
		}
