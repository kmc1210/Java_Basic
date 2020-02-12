package java06_class.overloading;

public class Overloading_02 {
	
	//int형 전달인자의 문자수(길이)를 구해서 반환
	//  111222333 -> 9
	//  1234 -> 4
		public int getLength(int num) {
		
		// int -> String 형변환
		String str = String.valueOf(num);
		
		
		// 변환된 문자열의 길이를 리턴
		int len = str.length();
//		112334 -> "112334"
		return len;
		} //첫번째 int 형 변환_end
		
		public int getLength(boolean bol) {
		
		
		// bol -> String 형변환
		String str = String.valueOf(bol);
		
		
		// 변환된 문자열의 길이를 리턴
		int len = str.length();
//		112334 -> "112334"
		return len;
	
		}//두번째 boolean_end
		
		public int getLength(double dou) {
			
			// double -> String 형변환
			String str = String.valueOf(dou);
			
			
			// 변환된 문자열의 길이를 리턴
			int len = str.length();
//			112334 -> "112334"
			return len;
		}//세번째 double_end
		
}//class_end

