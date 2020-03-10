package java10_Collection;

import java.io.*;
import java.util.*;

public class Collection06_Properties {
	public static void main(String[] args) {
		
		Properties prop = new Properties(); //Properties 객체
		
		try {
			
			//파일 -> Properties정보 불러오기
			prop.load(
				new FileReader(
						"./src/java10_Collection/user.properties"));
			
			System.out.println( prop );
			
			System.out.println("=================");
			
			//속성 값 가져오기
			
			String user = prop.getProperty("username");
			System.out.println("USER : " + user);
			
			String pass = prop.getProperty("password");
			System.out.println("PASSWORD : " + pass);
			
			
			// 인증 , Authentication, Auth
			if( "abc".equals(user) && "123".equals(pass)) {
				System.out.println("로그인에 성공하였습니다. ");
			}else {
				System.out.println("로그인에 실패하였습니다. ");
			}
			
			//=================================
			
			user = "abc";
			pass = "123";
			
			prop.setProperty("username", user);
			prop.setProperty("password", pass);
			System.out.println(prop);
			
			
			// Properties정보 -> 파일 기록
			prop.store(
					new FileWriter("./src/java10_Collection/user.properties")
					, "user information");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// ./
		// 현재위치를 나타내는 경로
		// 자바프로그램은 현재위치를 클래스패스(Class Path)로 제공한다.
		
		// 클래스패스 : 프로그램이 실행된 위치 -> 프로젝트 폴더
		
		System.out.println("---------------------------------------");
		
		//시스템 정보 Properties 얻기
		Properties sysProp = System.getProperties();
		
		System.out.println("\n=====JAVA VERSION=====");
		System.out.println(sysProp.getProperty("java.version"));
		
		System.out.println("\n=====OS NAME=====");
		System.out.println(sysProp.getProperty("os.name"));
		
		System.out.println("\n=====USER ACCOUNT=====");
		System.out.println(sysProp.getProperty("user.name"));
		
		System.out.println("\n======================");
		System.out.println(sysProp);
	}
}
