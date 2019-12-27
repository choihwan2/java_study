package app;

import dao.DeptDAO;
import vo.DeptVO;

public class Application {

	public static void main(String[] args) {
		DeptDAO dao = new DeptDAO();
//		sdao.insertDept("EDU", "Social");
		
		for (DeptVO data : dao.deptList()) {
			System.out.printf("%d | %-12s | %s %n", data.getDeptno(), data.getDname(), data.getLoc());
		}
		System.out.println("END");
	}

}
