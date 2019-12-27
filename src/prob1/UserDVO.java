package prob1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.JdbcUtil;

public class UserDVO {

	public UserVO login(String id, String pw) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from users where user_id = ? and user_pw = ?";
		UserVO loginUser = null;
		try {
			con = JdbcUtil.getConnection();

			ps = con.prepareStatement(sql);
			// ? 값 세팅 작업
			ps.setString(1, id);
			ps.setString(2, pw);
			rs = ps.executeQuery(); // select
			rs.next();
			loginUser = new UserVO(rs.getString("user_id"), rs.getString("user_pw"));
			System.out.println("로그인 성공");
			// 결과값 핸들링.
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("로그인 실패");
		} finally {
			JdbcUtil.close(con, rs, ps);
		}
		return loginUser;
	}
}
