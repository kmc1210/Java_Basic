package java03_scanner;

public class FormattedDouble {
	public static void main(String[] args) {
		//double형 데이터를 서식화하여 출력하기
		// -> 소수점 둘째자리까지 출력하기
		
		double avg = 54.567567;
		
		// 1. String.format() 메소드 이용하기
		
		String data  = String.format("%.2f" , avg);
		System.out.println(data);
		
		
		// 2. System.out.printf() 메소드 이용하기
		System.out.printf("%.2f" , avg);
		
		System.out.println("--------------------");
		// 3. double 데이터타입을 유지하며 변환하기 
		double formatted = Math.round(avg*100)/(double)100;
//		double formatted = Math.round(54.567567*100)/(double)100;
//		double formatted = Math.round(5456.7567)/(double)100;
//		double formatted = 5457/(double)100;
//		double formatted = 54.57;
		
		
		// round 반올림 
	}
}
