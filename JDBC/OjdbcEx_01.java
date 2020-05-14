package ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// JDBC 사용 방법
// 1. JDBC 드라이버 로드
// 2. DB 접속(연결, Connection)
// 3. SQL 쿼리 수행
// 4. 조회된 결과 처리
// 5. 연결 종료

public class OjdbcEx_01 {
	public static void main(String[] args) {
		
		System.out.println("Hello Java");
		
		// JDBC 사용 방법
		// 1. JDBC 드라이버 로드
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		// ------ OJDBC 사용에 필요한 변수들 -------
		
		Connection conn = null; //DB연결 객체 (접속 객체)
		Statement st = null; //SQL 구문 저장 및 수행 객체
		ResultSet rs = null; //조회결과 반환 객체
		
		// -----------------------------------------
		
		
		try {
			// 2. DB 접속(연결, Connection)
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"scott",
					"tiger");
				
			// 3. SQL 쿼리 수행
			
			// 3.1 쿼리 수행객체 생성
			st = conn.createStatement();
			
			// 3.2 SQL 수행 및 결과 저장(ResultSet)
			rs = st.executeQuery("SELECT * FROM emp ORDER BY empno");
			
			// 조회된 행이 존재하는 만큼 반복하는 코드
			while( rs.next()) {
				// rs.next()를 한번 수행할 때마다 조회된 행을
				// 순차적으로 한 행씩 참조한다
				
				System.out.print( "이름: " +(rs.getString("ename") + " "));
				System.out.print( "사원번호: " +( rs.getString("empno") + " "));
				System.out.println( "직종: " + (rs.getString("job") + " "));
				System.out.print( "담당자: " + (rs.getString("mgr") + " "));
				System.out.println( "입사날짜:" + (rs.getString("hiredate") + " "));
				
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null)	rs.close();
				if(st!=null)	st.close();
				if(conn!=null)	conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		// 3. SQL 쿼리 수행
		// 4. 조회된 결과 처리
		// 5. 연결 종료
		
		
	}
}
