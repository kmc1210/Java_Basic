package ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class OjdbcEx_03 {
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
	private static PreparedStatement ps = null; //SQL수행객체
	private static ResultSet rs = null; //조회결과객체
	
	public static void main(String[] args) {
		
	//---- 드라이버 로드 -----
	
	try {
		Class.forName(DRIVER);
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	//--------------------------------------
		
//		Scanner sc = new Scanner(System.in);
//		String job = sc.nextLine();
		String job = "SALESMAN";
	
		// ----- SQL 작성 -----
//		String sql = "";
//		sql += "SELECT * FROM emp";
//		sql += " WHERE job = '" + job + "'";
//		sql += " ORDER BY empno";

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
			
			// Statement 객체는 생성 (createStatement())될 때
			// 매개변수 없음
			
			// execute 할 때 쿼리를 매개변수로 전달한다
			
			//	st = conn.createStatement();
			//  rs = st.executeQuery(sql);
			
			// ---------------------------------------------
			
			// PreparedStatement객체는 생성 (prepareStatement) 될 때
			// 쿼리를 매개변수로 사용함
			
			// execute 수행할 때 매개변수 없음
			
			// execute 전에 ?에 대한 값 채워줘야함
			
			
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, job); //?에 SALESMAN 이 'SALESMAN'으로 들어감
			
			rs = ps.executeQuery();
			// -------------------------
			
		
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
