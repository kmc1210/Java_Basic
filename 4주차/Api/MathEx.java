package java09_api;

public class MateEx {
	public static void main(String[] args) {
		//원주율 출력
		System.out.printf("\n 원주율 값 %.2f\n",Math.PI);
		// -10의 절대값
		System.out.println("\n-10의 절대값 :"+ Math.abs(-10));
		// 3.7의 올림값
		System.out.println("\n 3.7의 올림값 : "+ Math.ceil(3.7));
		// 3.7의 내림값
		System.out.println("\n 3.7의 내림값 : " + Math.floor(3.7));
		// -3.7의 반올림값
		System.out.println("\n -3.7의 반올림값 : " + Math.round(-3.7));
		// 2.1의 3제곱값
		System.out.printf("\n 2.1의 3제곱값 : %.2f" , Math.pow(2.1, 3));
		
		System.out.println("================================\n");
		
		System.out.println( Math.max(3.15, 3.45) );
		
		System.out.println( Math.min(7, 3));
		
		int n1 =11;
		int n2 = 19;
		
		
		
		
		for(int i= Math.min(n1, n2); i<Math.max(n1, n2); i++) {
			
		}
		System.out.println("================================\n");
		// Math.random()
		// 0.0(포함) ~ 1.0(제외) double형 랜덤 숫자 생성
		System.out.println( Math.random());
		System.out.println( Math.random());
		System.out.println( Math.random());
		System.out.println("================================\n");
		
		System.out.println( (int)(Math.random()*3)+"\n"); //0~2까지 반복
		System.out.println( (int)(Math.random()*5) +20+"\n"); //0~4까지 반복
		System.out.println( (int)(Math.random()*5) +1+"\n"); //1~5까지 반복
		System.out.println( (int)(Math.random()*3) +1+"\n"); //1~3까지 반복
		// 1: 가위, 2:바위, 3: 보
	}
}
