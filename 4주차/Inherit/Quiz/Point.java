package java07_inherit.practice.model;

// + 부모클래스
 public class Point {
//	--- Field ---
	protected int x;//x좌표
//	# x : int
	protected int y;//y좌표
//	# y : int
	
//	--- Constructor ---
	public Point() {
//	+ Point()
		this(0, 0); //기본값
	}
	public Point(int x, int y) {
		setX(x);
		setY(y);
//	+ Point(x : int, y : int)
	}

//	--- Method ---
//	+ getXXX()
//	+ setXXX()
//	+ draw():void	//x, y 좌표값 출력 ex) (3, 4)
	public void draw() {
		System.out.println("(x,y)"+ "=" +"(" + x +","+y + ")");
	}
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
