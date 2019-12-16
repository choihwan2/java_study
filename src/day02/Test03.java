package day02;

public class Test03 {

	public static void main(String[] args) {
		int pw = 0; 
		System.out.println(pw);
		pw = "  hello1234".trim().length();
		String pw2 = "  hello1234".trim().toUpperCase();
		System.out.println(pw);
		System.out.println(pw2);
		System.out.println(pw > 8);
		pw = 0;
		
		System.out.println("-------------------------");
		String msg = null;
		System.out.println(msg);
		msg = "Hello JAVA bururu";
		System.out.println(msg);
		msg = null;
		
		String msg2 = msg;
		System.out.println(msg2);
		
	}
}
