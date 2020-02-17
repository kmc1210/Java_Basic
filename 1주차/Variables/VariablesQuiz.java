package java01_variables;

public class VariablesQuiz {

	public static void main(String[] args) {
		
		String name;	// 이름, 나이, 성별, 키
		name = "Alice"; // String, int, char, double
		int age;
		age = 120;
		char male;
		male = '남'; 
		double height;
		height = 222.67;
		
		//문장열 String 을 사용할때는 "" 를 사용 문자 하나만 사용할때는 char 에 ''를 사용
		
		
		// 3. 출력
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
		System.out.println("성별 : " + male);
		System.out.println("키 : " + height + "cm");
		
	}

}
