package java11_generic;

public class Generic_06_Extends {
	
	
	
	
	public static void main(String[] args) {
		
		print(123);
		print(23.42345);
		
		
//		print("Apple"); //상속 받은 Number에 해당하는 범위까지만 변환해서 사용가능
		
	}
	
	public static <T extends Number> void print(T t) {
		System.out.println(t);
	}
	
}
