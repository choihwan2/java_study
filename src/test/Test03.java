package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import util.JdbcUtil;

public class Test03 {

	public static void main(String[] args) {
		System.out.println("JDBC TEST");

		String sql = "select * from emp where deptno = ?";

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		// Select 결과값을 받아주는게 ReulstSet
		// Select 는 Row Column 으로 나오기에 ResultSet으로 받아야한다.
		// insert delete update 는 정수가 즉 int 로 받아야 한다.

		try {
			//1,2를 util 쪽에서 해준다.
			con = JdbcUtil.getConnection();
			// 3. 생성된 Connection으로부터 Statement생성
			ps = con.prepareStatement(sql);
			
			String deptnoString = JOptionPane.showInputDialog("deptno");
			 
			// ? 값 세팅
			ps.setInt(1, Integer.parseInt(deptnoString));
			

			// 4. 생성된 Statement를 이용해서 sql 수행
			rs = ps.executeQuery();

			// 5. 결과 처리(ResultSet, int)
			while (rs.next()) {
				System.out.print(rs.getInt("empno") + " ");
				System.out.print(rs.getString("ename") + " ");
				System.out.print(rs.getString("job") + " ");
				System.out.print(rs.getString("mgr") + " ");
				System.out.print(rs.getString("sal") + " ");
				System.out.print(rs.getDate("hiredate") + " ");
				System.out.print(rs.getString("comm") + " ");
				System.out.print(rs.getInt("deptno") + " ");
				System.out.println("\n-----------------------");
			}

//			System.out.println(con);
		} catch (Exception e) {
			// 6. 예외처리
			System.out.println(e);
		} finally {
			// 7. 자원정리(connection, statement, resultSet)
			JdbcUtil.close(con, rs, ps);
		}

		System.out.println("JDBC TEST END");
	}

}
