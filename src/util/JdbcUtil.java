package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcUtil {

	
	public static Connection getConnection() {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String driver = "oracle.jdbc.OracleDriver";
		String user = "SCOTT";
		String pw = "TIGER";
		
		Connection con = null;
		
		try {
			// 1. Driver 로딩 Driver 를 메모리에 올려보자 .
			// 객체 생성문.
			Class.forName(driver);
			// 2. 로딩된 Driver 클래스를 이용해서 Connection요청
			con = DriverManager.getConnection(url, user, pw);

		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
	
	//Connection 들은 빠른 시간에 사용하고 꼭 반납해야함. 아니면 서버에 부하가 걸린다.
	//vo record 객체를 만들자.
	public static void close(Connection con, ResultSet rs, Statement ps) {
		try {
			if (rs != null)
				rs.close();
			if (ps != null)
				ps.close();
			if (con != null)
				con.close();
		} catch (Exception e2) {
			System.out.println(e2);
		}
	}
}
