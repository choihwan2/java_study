package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JdbcUtil;
import vo.DeptVO;

public class DeptDAO {
	public void insertDept(String dname, String loc) {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;

		String sql = "insert into dept (deptno, dname, loc) "
				+ "values ((select nvl(max(deptno),0) + 1 from dept),?,?)";
		try {
			con = JdbcUtil.getConnection();

			ps = con.prepareStatement(sql);
			// ? 값 세팅 작업
			ps.setString(1, dname);
			ps.setString(2, loc);

			row = ps.executeUpdate(); // dml 구문

			// 결과값 핸들링.

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			JdbcUtil.close(con, rs, ps);
		}
	}

	public void deleteDept(int deptno) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;

		String sql = "delete from dept where deptno = ?";

		try {
			con = JdbcUtil.getConnection();

			ps = con.prepareStatement(sql);
			// ? 값 세팅 작업
			ps.setInt(1, deptno);
			row = ps.executeUpdate(); // dml 구문
			
			// 결과값 핸들링.

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			JdbcUtil.close(con, rs, ps);
		}
	}

	public List<DeptVO> deptList() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<DeptVO> list = new ArrayList<DeptVO>();
		String sql = "select * from dept";

		try {
			con = JdbcUtil.getConnection();

			ps = con.prepareStatement(sql);
			// ? 값 세팅 작업

			rs = ps.executeQuery(); // select
			while (rs.next()) {
				DeptVO vo = new DeptVO(rs.getInt("deptno"), rs.getString("dname"), rs.getString("loc"));
				list.add(vo);
			}
			// 결과값 핸들링.

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			JdbcUtil.close(con, rs, ps);
		}
		return list;
	}
}
