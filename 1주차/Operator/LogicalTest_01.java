package java02_operator;

public class LogicalTest_01 {
	public static void main(String[] args) {
		int a=5, b=6, c=10, d;
		
		d = ++a * b--;
		System.out.println("a="+a+",b="+b+",d="+d);
//		System.out.println("a="6",b="5"(d 식에서 이미 가감산 적용),d="+d);
//		System.out.println("a="6",b="5",d="+(++a*b--);
//		System.out.println("a="6",b="5",d="+(6*6);
//		System.out.println("a="6",b="5",d="36;
//		** d에서 사용하고나서 b의 후처리 감산 실행
//		** 후치연산은 활용하고 난 후에 처리한다.
		d = a++ + ++c - b--;
		System.out.println("a="+a+",b="+b+",c="+c+",d="+d);
//		System.out.println("a="7"( 위의 a=6에서 ++후처리 가산을 통해 7이 됨),b="+b+",c="+c+",d="+d);
//		System.out.println("a="7",b="4"(위의 5에서 -- 후처리 감산연산자로 4로 됨), c="+c+",d="+d);
//		System.out.println("a="7",b="4",c="11"(d식에서 ++c의 전치증가를 통해 11이 됨),d="+d);
//		System.out.println("a="7",b="4",c="11",d="6 + 11 -5);
//		System.out.println("a="7",b="4",c="11",d="12);
	}
}
