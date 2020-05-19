package ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

import dto.Emp;

	
	public class OjdbcEx_04 {
		//OJDBC 드라이버 로드
		private static final String DRIVER
		="oracle.jdbc.driver.OracleDriver";
		
		//DB연결 정보
		private static final String URL
		= "jdbc:oracle:thin:@localhost:1521:xe";
		
		private static final String USERNAME = "scott";
		private static final String PASSWORD = "tiger";
		
		//OJDBC 객체
		private static Connection conn = null; //DB연결객체
		private static PreparedStatement ps = null; //SQL수행객체
		private static ResultSet rs = null; //조회결과객체
		
		public static void main(String[] args) {
			
		//전체 조회 결과를 저장할 리스트	
		List<Emp> list = new ArrayList<>();	
			
		//---- 드라이버 로드 -----
		
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//--------------------------------------
			
			// ----- SQL 작성 -----
			String sql = "";
			sql += "SELECT * FROM emp";
			sql += " WHERE job = ?";
			sql += " ORDER BY empno";
			// --------------------
			
			try {
				// ----DB연결-----
				conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				
				//--------------
				
				// ----- SQL 수행 객체 -----
				
				ps = conn.prepareStatement(sql);
				
				ps.setString(1, "SALESMAN"); 
				
				rs = ps.executeQuery();
				// -------------------------

				
				// ---- 결과 처리 ----
				
				while( rs.next()) { // 모든 데이터(행)를 반복
					
					// 새로운 빈 emp 객체 생성
					Emp emp  = new Emp();
					
					//ResultSet에서 Emp 객체에 데이터 담기
					emp.setEmpno( rs.getInt("empno"));
					emp.setEname( rs.getString("ename"));
					emp.setJob( rs.getString("job"));
					emp.setMgr( rs.getInt("mgr"));
					emp.setHiredate( rs.getDate("hiredate"));
					emp.setSal( rs.getDouble("sal"));
					emp.setComm( rs.getDouble("comm"));
					emp.setDeptno( rs.getInt("deptno"));
					
					//DTO를 list에 담기
					list.add(emp);
					
				}
				// --------------------------------
				
				for(Emp e: list) {
					
					System.out.println(e);
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					//  ------ 자원 해제 ---------
					if(rs!= null) 	rs.close();
					if(ps!= null) 	ps.close();
					if(conn!=null)  conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			
		}
}
