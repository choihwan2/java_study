package ex02.jdbc;

public class Util { //한글처리
	
	public static String toKor(String str) {
		try {
			byte[] b = str.getBytes("euc-kr"); // or "UTF-8"
			return new String(b);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static String toLatin(String str) {
		try {
			byte[] b = str.getBytes(); 
			return new String(b, "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
}
