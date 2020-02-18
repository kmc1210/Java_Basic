package java07_inherit;

class Parent2{// class 이름을 Parent로 할 경우 java07_inherit.Parent 라 Ex_01의 class와 이름이 같아서 오류남
	
//	private int num; //본인이 해당되는 클래스 내부에서만 쓸수 있는 Private
	public int num;
	
	public void display() {
		System.out.println("부모 메소드");
	}
}

class Child2 extends Parent2{
	private int num; //자식 클래스에서 오버라이딩이 아니게 겹쳐버려서 메인에서 이클립스가 헷갈리게 됨 = 버그 
	
	@Override
	public void display() {
		num = 100;
		System.out.println("오버라이딩 메소드");
	}
	
}

public class InheritEx_02 {
	public static void main(String[] args) {
	
		
		Child2 c = new Child2(); // 
		
//		c.num = 123;
		c.display();
		
		System.out.println("==================");
		
		Parent2 p = new Parent2();
		
		p.num =333;
		p.display();
		
		System.out.println("==================");
		
		Parent2 pc = new Child2(); // Parent2 <- Child2 을 저장함
		//부모(클래스)가 자식(클래스)를 품어준다 (받아준다) //자식 클래스를 부모 클래스 타입으로
		
//		Child2 cp = (Child2) new Parent2(); // Child2 <- Parent2
		//자식(클래스)가 부모(클래스)를 품어줄(받아줄)수는 없다.
		
		pc.display();//타입은 Parent2 지만 동작은 Child2 의 extends된 걸 따르고 있음
		
		pc.num = 222; // Parent2 의 변수 사용
		
		//메소드 일때만 동적 바인딩으로 child2()로 간거고 num은 정적 바인딩 바로 Parent2로 감
		
//		((Child2)pc).num = 111;
//		((Child2)pc).display();
		
	}
}
