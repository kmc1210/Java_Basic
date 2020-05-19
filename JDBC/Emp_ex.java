package ex;

import java.util.*;

import dao.face.*;
import dao.impl.*;
import dto.Emp;

public class Emp_ex {
	
	//EmpDao 객체 생성
	private static EmpDao empDao = new EmpDaoImpl();
	
	
	public static void main(String[] args) {
		
		//DAO를 통한 Emp테이블 전체 조회
		List<Emp> list = empDao.selectAll();
		
		for (Emp emp : list) {
			System.out.println(emp);
			
		}
		
		
	}
}


















