package java08_abstract;

abstract class Person { //부모클래스
	protected String name; //이름
	
	//추상메소드
	public abstract void display(); //객체의 정보를 출력하는 기능
	
	public void out() {
		
	}
	public Person(String name) { //생성자
		this.name = name;
		
	}
}

class Professor extends Person { //자식클래스
	
	private String major; //전공
	
	
	public Professor(String name, String major) {//생성자
		super(name);
		
		this.major = major;


	}


	@Override
	public void display() {
		System.out.println("[교수]" + name + " , " + major + "전공");
	}
	
	
}

class Student extends Person {
	private String subject; //수강과목

	public Student(String name, String subject) {//생성자
		super(name);
		
		this.subject = subject;
	}

	@Override
	public void display() {
		System.out.println("[교수]" + name + " , " + subject + "수강");
	}

}


public class AbstractEx {
	public static void main(String[] args) {
		
		Student s = new Student("Alice", "자바");
		Professor p = new Professor("Bob", "컴퓨터공학");
		
		s.display();
		p.display();
		
		System.out.println("============================");
		
		Person p1 = new Student("Clare", "자료구조");
		Person p2 = new Professor("Dave", "컴퓨터 과학"); 
			
		p1.display();
		p2.display();
				
		System.out.println("============================");

		Person[] arr = null; //배열 선언
		
		arr = new Person[5]; //배열 생성
		
		arr[0] = new Professor("Apple", "Banana"); //객체 생성
//		arr[1] = new Person("Test") // 추상 클래스 객체 생성 불가
		arr[2] = new Student("Cherry" , "Durian"); //객체 생성
		for(int i=0; i<arr.length; i++) {
		if( arr[i] != null)	break;
		arr[i].display();
		}
		for(int i=0; i<arr.length; i++) {
			if( arr[i] == null)	continue;
			arr[i].display();
		}
		}
		
	}

		
		
	




