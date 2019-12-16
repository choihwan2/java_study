package day09;

public class Test05 {
	public static void main(String[] args) {
		System.out.println("start");
		String msg = "-5";
		int num = 0;
		int res = 0;
		try {
			num = Integer.parseInt(msg);
			res = 1000 / num;
			int[] number = new int[num];
		} catch (NumberFormatException e) {
			System.err.println("숫자로 바꿀수 있는 문자열을 입력하세요");
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나눌수 없습니다.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		
		} finally {
			System.out.println("무조건 들어오는 곳이라 자원반납. 항상수행됨.");
		}
		System.out.println(num);
		System.out.println(res);

		System.out.println("end");
	}
}
