package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test01 {

	public static void main(String[] args) {
		System.out.println("JDBC TEST");

		// 원래는 밖에서 관리해줘야할 자원들
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String driver = "oracle.jdbc.OracleDriver";
		String user = "SCOTT";
		String pw = "TIGER";

		String sql = "select * from dept";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		// Select 결과값을 받아주는게 ReulstSet
		// Select 는 Row Column 으로 나오기에 ResultSet으로 받아야한다.
		// insert delete update 는 정수가 즉 int 로 받아야 한다.

		try {
			// 1. Driver 로딩 Driver 를 메모리에 올려보자.
			// 객체 생성문.
			Class.forName(driver);
			// 2. 로딩된 Driver 클래스를 이용해서 Connection요청
			con = DriverManager.getConnection(url, user, pw);

			// 3. 생성된 Connection으로부터 Statement생성
			ps = con.prepareStatement(sql);

			// 4. 생성된 Statement를 이용해서 sql 수행
			rs = ps.executeQuery();

			// 5. 결과 처리(ResultSet, int)
			while (rs.next()) {
				System.out.print(rs.getString("deptno") + " ");
				System.out.print(rs.getString("dname") + " ");
				System.out.println(rs.getString("loc") + " ");
				System.out.println();
			}

//			System.out.println(con);
		} catch (Exception e) {
			// 6. 예외처리
			System.out.println(e);
		} finally {
			// 7. 자원정리(connection, statement, resultSet)
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

		System.out.println("JDBC TEST END");
	}

}
