package dbConn.util;

import java.sql.Connection;
import java.sql.DriverManager;

/*
//DB 연결 정보 반복적으로 코딩 해결
//다른 클래스에서 아래 코드를 구현하지 않도록 설계합니다.
// 1. Driver 로딩 Driver 를 메모리에 올려보자 .
// 객체 생성문.
//Class.forName("oracle.jdbc.driver.OracleDriver");
// 2. 로딩된 Driver 클래스를 이용해서 Connection요청
//con = DriverManager.getConnection(
//		"jdbc:oracle:thin:@127.0.0.1:1521:xe",
//		"hwan",
//		"1234");
 * ConnectionHelper.getConnection("mysql") or ("oracle") 이런식으로 구분
 * dsn ==> data source name
*/

public class ConnectionHelper {
	public static Connection getConnection(String dsn) {
		Connection conn = null;
		try {
			if (dsn.equals("mysql")) {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost", "hwan", "1234");
				
			} else if (dsn.equals("oracle")) {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","hwan","1234");
			} // if end
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	} // end getConnection
	
	public static Connection getConnection(String dsn, String user, String pw) {
		Connection conn = null;
		try {
			if (dsn.equals("mysql")) {
				Class.forName("com.mysql.jdbc.Driver");
				DriverManager.getConnection("jdbc:mysql://localhost", "hwan", "1234");
			} else if (dsn.equals("oracle")) {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", 
						user,
						pw);
			} // if end
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	} // end getConnection
}



/*
 * public class ConnectionHelper {
 * 
 * public static void main(String[] args) { try {
 * Class.forName("oracle.jdbc.driver.OracleDriver");
 * System.out.println("load sucess"); Connection conn =
 * DriverManager.getConnection( "jdbc:oracle:thin:@127.0.0.1:1521:xe", "hwan",
 * "1234"); System.out.println("connection sucess"); } catch
 * (ClassNotFoundException e) { System.out.println("드라이버 연결 실패"); } catch
 * (SQLException e) { System.out.println("SQL 연결 실패"); } } }
 */
