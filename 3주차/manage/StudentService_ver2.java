package java06_class.manage;

import java.util.Scanner;

public class StudentService_ver2 {
	private Scanner sc=new Scanner(System.in);;
	private Student []stuArr = new Student[3];
	
	
	private int getIdx() {
		System.out.println("몇번째 학생 ? :");
		return sc.nextInt();
	}
//	- getIdx() : int
//	- insertInfo(Student,int):void
	public StudentService_ver2() {//Constructor
		for(int i=0;i<3;i++) {
			stuArr[i]=new Student();
		}
	}	
	public void insertInfo(Student [] stuArr, int idx) {
		System.out.print("이름을 입력하시오 :");
		stuArr[idx].setName(sc.next());
		System.out.print("나이를 입력하시오 :");
		stuArr[idx].setAge(sc.nextInt());
	}
	public void insertInfoAll() {
		insertInfo(stuArr,0);
		insertInfo(stuArr,1);
		insertInfo(stuArr,2);
	}
	public void insertInfoIdx() {
		insertInfo(stuArr, getIdx()-1);
	}
	
	public void insertScore(Student [] stuArr, int idx) {
		System.out.print("국어 점수 입력 : ");
		stuArr[idx].setKor(sc.nextInt());
		System.out.print("영어 점수 입력 :");
		stuArr[idx].setEng(sc.nextInt());
		System.out.print("수학 점수 입력 :");
		stuArr[idx].setMath(sc.nextInt());
	}
	
	public void insertScoreAll() {
		for(int i=0; i<stuArr.length; i++) {
			insertScore(stuArr, i);
		}
	}
	public void insertScoreIdx() {
		insertScore(stuArr, getIdx());
	}
	
	public void insertStu(int idx) {
		idx = getIdx();
		insertInfo(stuArr, idx);
		insertScore(stuArr, idx);
	}
	public void insertStuAll() {
		insertInfoAll();
		insertScoreAll();
	}
	public void calcSum(Student []stuArr) {
		for(int i=0; i<stuArr.length; i++) {
			stuArr[i].setSum(stuArr[i].getKor()+stuArr[i].getEng()+stuArr[i].getMath());
		}
	}
	public void calcAvg(Student []stuArr) {
		for(int i=0; i<stuArr.length; i++) {
			stuArr[i].setAvg((double)stuArr[i].getAvg()/stuArr.length);
		}
	}
	public void printStu(Student []stuArr, int idx) {
		System.out.print(idx+"번째 학생");
		System.out.println("이름 : " + stuArr[idx].getName());
		System.out.println("나이 : " + stuArr[idx].getAge());
		System.out.println("국어 점수 : " + stuArr[idx].getKor());
		System.out.println("영어 점수 : " + stuArr[idx].getEng());
		System.out.println("수학 점수 : " + stuArr[idx].getMath());
		calcSum(stuArr);
		stuArr[idx].getSum();
		calcAvg(stuArr);
		stuArr[idx].getAvg();
	}
	public void printStuAll() {
		for(int idx=0; idx<stuArr.length; idx++) {
			printStu(stuArr, idx);
		}
	}
	public void printStuIdx() {
		printStu(stuArr, getIdx());
	}
}
