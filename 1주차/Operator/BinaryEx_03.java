package java02_operator;

public class BinaryEx_03 {
	public static void main(String[] args) {
		
		//이항연산자 - 관계, 비교
		// ex) 1 < 3 왼쪽 (1)이 있는 오른쪽 (3) 보다 작은가?
		// <    lt, less than, 작은 
		// >	gt, greater than, 큰
		// <=	le, less than equal, 작거나 같은
		// >=	ge, greater than equal, 크거나 같은
		// ==	eq, equal, 같은  //하나만 쓰면 assign 대입 연산자라서 == 두개를 써줘야 한다.
		// !=	ne, not equal, 같지 않은
		
		// ! 는 컴퓨터에서 not 이나 반대의 의미를 가지는 경우가 많다.
		
		// 관계연산의 결과(리턴)는 참/거짓(boolean타입, true/false)
		
		int num1 = 20;
		int num2 = 20;
		
		System.out.println("num1 == num2 :" + (num1 == num2));
		System.out.println("num1 != num2 :" + (num1 != num2));
		
		System.out.println("num1 < num2 :" + (num1 < num2));
		System.out.println("num1 > num2 :" + (num1 > num2));
		
		System.out.println("num1 <= num2 :" + (num1 <= num2));
		System.out.println("num1 >= num2 :" + (num1 >= num2));
		
		// 비교 시 기준점을 왼쪽으로 두고 봐야함. "=" 는 항상 오른쪽
		
		System.out.println("---------------------------------------------");
		
		boolean res1;
		boolean res2;
		
		res1 = num1<num2;
//		res1 = 20<20;
//		res1 = false;
		
		res2 = num1==num2;
//		res2 = 20==20;
//		res2 = true;
		
		System.out.println("res1의 값 : "+ res1);
		System.out.println("res2의 값 : "+ res2);

	}
}
