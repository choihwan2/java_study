package day02;

public class Test06 {
	public static void main(String[] args) {

		int x = 2;
		int abc = x > 3 ? x : -x;

		System.out.println(abc);
		int score = 99;
		String resultString = score > 70 ? "축하한다" : "다시해라";
		System.out.println(resultString);
		System.out.println("------------");
		char ch = '!';
		char r = (ch >= 'a' && ch <= 'z') ? (char) (ch - 32) : ch;
		System.out.println(r);
	}
}
