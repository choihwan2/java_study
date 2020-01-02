package dbConn.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
	DB 연결 정보 반복적으로 코딩 해결
	다른 클래스에서 아래 코드 구현을 하지 않도록 설계
	//1. Driver클래스를 로딩
	Class.forName("oracle.jdbc.driver.OracleDriver");
	//2. 로딩된 Driver클래스를 이용해서 Connection요청(url, user, pwd)
	conn = DriverManager.getConnection(
			"jdbc:oracle:thin:@localhost:1521:xe", 
			"kingsmile", "oracle");
   	이런식으로 사용
   	ConnectionHelper.getConnection("mysql") or ("oracle")
   	dsn ==> data source name
*/

//*
public class ConnectionHelper2 {
	public static Connection getConnection(String dsn) {
		Connection conn = null;
		
		try {
			if( dsn.equals("mysql") ) {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/sampleDB", 
						"kingsmile", "mysql");
				
			} else if( dsn.equals("oracle")) {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:xe", 
						"kingsmile", "oracle");
			} //if end
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}		
	} //end getConnection()
} //end ConnectionHelper class

//*/


/*
public class ConnectionHelper {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("load success!!");
			
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"kingsmil", "oracle");
			System.out.println("connection success!!");
			
			
			 } catch (ClassNotFoundException e) {
//				 System.out.println("드라이브 로드 실패"); //사용자 메세지
//				 System.out.println(e.getMessage());
//				 e.printStackTrace(); 
			 } catch (	SQLException e){
//				 System.out.println("SQL 연결 실패");
//				 System.out.println(e.getMessage());
//				 e.printStackTrace();
				 System.out.println(e.getStackTrace());
			 }

//		} catch (Exception e) {
//			System.out.println("");
//			e.printStackTrace();
//		}

	}
}
*/