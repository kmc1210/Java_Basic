package java07_inherit.practice.model;

public class Rectangle extends Point{
	private int width;
	private int height;
//--- Field ---
//- width : int 	//가로너비
//- height : int 	//세로높이
//부모의 x, y는 사각형 좌측상단의 좌표값으로 처리
	
	public Rectangle() {
	}
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		setWidth(width);  //가로너비
		setHeight(height); //세로 높이
	}
//--- Constructor ---
//+ Rectangle()
//+ Rectangle(x:int, y:int, width:int, height:int)
//	//x, y는 부모 생성자로 넘김
//
//--- Method ---
//+ getter, setter 구현
//+ draw() : void	//사각형의 x, y좌표, 면적, 둘레 계산 출력 처리
//* 면적 : 가로 * 세로
//* 둘레 : 2 * (가로 + 세로)
//* 면적과 둘레는 모두 반올림하여 소숫점 아래 첫째자리까지 처리할 것
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void draw() {
		super.draw();
		System.out.printf("사각형의 면적 : %.1f\n", ((double)width*height));
		System.out.printf("사각형의 둘레 : %.1f\n", 2*((double)width+height));
	}
	
	
	
}
//
