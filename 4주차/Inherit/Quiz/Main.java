package java07_inherit.practice.controller;


import java07_inherit.practice.model.*;//패키지 내에 있는 모든 class를 import


public class Main {
	public static void main(String[] args) {
		Circle[] cr = new Circle[3];
		Rectangle[] rt = new Rectangle[3];
		cr[0] = new Circle(1, 2, 3);
		cr[1] = new Circle(2, 3, 4);
		cr[2] = new Circle(3, 4, 5);
		rt[0] = new Rectangle(1, 2, 3, 4);
		rt[1] = new Rectangle(2, 3, 4, 5);
		rt[2] = new Rectangle(3, 4, 5, 6);
		for(int i=0; i<cr.length; i++) {
			cr[i].draw();
		}
		for(int i=0; i<rt.length; i++) {
			rt[i].draw();
		}
		
		
		
//1. Point 형 객체 배열 선언, 생성 : 5개
		Point[] p = new Point[5];
//2. 각 index별로 Circle, Rectangle 객체 생성, 초기화함(임의대로)
		p[0] = new Circle(1, 2, 3);
		p[1] = new Circle(2, 3, 4);
		p[2] = new Circle(3, 4, 5);
		p[3] = new Rectangle(4, 5, 6, 7);
		p[4] = new Rectangle(5, 6, 7, 8);
		
//3. for 문 사용 : draw() 메소드 실행함
		for(int i=0; i<p.length; i++) {
			p[i].draw();
		}
		 
	}//main_end
}//class_end



//- 테스트용 실행 클래스 : java07_inherit.practice.controller.Main.java
////main() 포함
//
//* 구현내용
//Circle 배열 초기화 : 3개
//Rectangle 배열 초기화 : 3개
//각각 draw() 출력 처리	
