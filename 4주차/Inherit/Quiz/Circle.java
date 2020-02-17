package java07_inherit.practice.model;

import java.lang.Math;

public class Circle extends Point{
//	--- Field ---
	private int radius;
//	- radius : int
//	--- Constructor ---
	public Circle() {
//	+ Circle()
	}
	public Circle(int x, int y, int radius) {
//	+ Circle(x:int, y:int, radius:int)
//		//x, y는 부모생성자로 넘김
		super(x, y);
		setRadius(radius);
//		//center point(중심점)로 취급
	}
//	--- Method ---
//	+ getter, setter 구현
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void draw() {
		super.draw();
		System.out.printf("원면적 : %.1f\n",((double)Math.PI * radius * radius));
//	* 원면적 = PI * radius * radius;
		System.out.printf("원둘레 : %.1f\n",((double)2*Math.PI*radius));
//	* 원둘레 = 2 * PI * radius;
//	* 면적과 둘레는 모두 반올림하여 소숫점 아래 첫째자리까지 처리할 것
	}
	
}
//	+ draw() : void //원의 x, y좌표, 면적과 둘레 계산 출력함
//			java.lang.Math.PI 사용함

//
//

