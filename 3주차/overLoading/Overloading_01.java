package java06_class.overloading;

public class Overloading_01 {

	private int x;
	private int y;
	
	
	//멤버필드 x, y를 출력
	public void display() { // 매개변수가 없는 display() 메소드
		System.out.println("(" + x +"," + y + ")");
		
	}
	public void display(int x, int y) {
		this.x = x;
		this.y = y;
		
//		System.out.println("(" + x +"," + y + ")");
		display(); // 위의 메소드를 호출
	}
	//int형 2개를 전달인자로 받아 멤버 x, y를 초기화 및 출력
	
	//---------------------------------------------------------
	
	public void display(double d) {}
	
	public void display(String str) {}
	
	public void display(int i) {}
	
	//리턴 데이터 타입만 바뀌어서는 오버로딩이 성립하지 않는다.
//	public int display(int i) {
//		return i;
//	}
	//반환 타입은 오버로딩에 해당되지 않음
	
	
}
