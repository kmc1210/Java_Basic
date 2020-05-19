package ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OjdbcEx_02 {
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
		private static Statement st = null; //SQL수행객체
		private static ResultSet rs = null; //조회결과객체
		
		public static void main(String[] args) {
			
			//---- 드라이버 로드 -----
			
			try {
				Class.forName(DRIVER);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			//--------------------------------------
			
			// --- SQL 작성 ---
			String sql1 = "";
			sql1 += "CREATE TABLE userTest (";
			sql1 += "	idx NUMBER CONSTRAINT pk_user_test PRIMARY KEY,";
			sql1 += "	name VARCHAR2(50) NOT NULL,";
			sql1 += "	phone VARCHAR2(50) NOT NULL )";
			
			String sql2 = "";
			sql2 += "CREATE SEQUENCE seq_usertest";
			sql2 += "	INCREMENT BY 1";
			sql2 += "	START WITH 1";
			
			//-------------------------------------
			
			try {
				// ----DB연결-----
				conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				
				//--------------
				
				
				// ------ SQL 수행 ---------------
				st = conn.createStatement(); //Statement 객체 얻기
				
				st.execute(sql1); //테이블 생성쿼리 수행
				st.execute(sql2); //시퀀스 생성 쿼리
				// -------------------------------
				
				
				
				
				// ------ 생성 후 결과 처리 ------
				
				rs =  st.executeQuery(
						"SELECT count(*) FROM tabs"
										+ " WHERE table_name = upper('usertest')");
				
				// 조회결과에서 첫번째 행 찾기
				rs.next();
				
				
				//rs.getInt("count(*)");
				if(rs.getInt(1)>0) {
					System.out.println("테이블 생성 완료");
				}else {
					System.out.println("테이블 생성 실패");
				}				
				// -------------------------------
				
				// 시퀀스 존재 여부 확인
				rs = st.executeQuery("SELECT count(*) FROM user_sequences"
						+ " WHERE sequence_name=upper('seq_usertest')");
				
				rs.next(); //조회결과에서 첫 행 찾기
				
				if( rs.getInt(1) > 0 ) {
					System.out.println("시퀀스 생성 완료");
				} else {
					System.out.println("시퀀스 생성 실패");
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if(rs!=null) 	rs.close();
					if(st!=null)	st.close();
					if(conn!=null)	conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			
			//-------------------------------------
			
		}
}
