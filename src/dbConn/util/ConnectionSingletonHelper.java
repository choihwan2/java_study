package dbConn.util;

import java.sql.*;
/*
	ConnectionHelper 클래스의 문제
	매번 드라이버 로드,..
	Connection 생성
	
	어차피 하나의 프로세스에서 하나만 만들어서
	재사용하면 될텐데....
	
	해결방법 > 공유자원(싱글톤)
*/

public class ConnectionSingletonHelper {
	// 하나의 프로세스에서 공통으로 사용할 수 있는 공용자원(static)

	private static Connection conn;

	private ConnectionSingletonHelper() {
	}

	public static Connection getConnection(String dsn) {
		// Connection conn = null;

		if (conn != null) {
			return conn;
		}

		try {

			if (dsn.equals("mysql")) {

				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampleDB", "kingsmile", "mysql");

			} else if (dsn.equals("oracle")) {

				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hwan", "1234");

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}

	public static void close() throws SQLException {
		if (conn != null) {
			if (!conn.isClosed()) {
				conn.close();
			}

		}
	}
}
