package day02;

public class Test01 {
	// 클래스의 구성요소
	//Data(변수) + 기능(필수 = method )
	// 클래스안에 있는 변수는 멤버 변수.
	// 메인함수안에 있는 변수는 지역 변수.
	
	public static void main(String[] args) {
		// Data  , 지역변수 , 초기화 해야 사용 가능
		
		int i = 900;
		double f = 99.9;
		char c = 'A';
		boolean b = true;
		
		String name = "홍길동";
		
		
		System.out.printf("%d %f %c %b %n", i , f, c ,b);
		System.out.printf("%s %s %s %s %n", i , f, c ,b);
		System.out.printf("i = %d f = %.2f c= %c b= %b %n", i , f, c ,b);
		
		System.out.println(name);
		
	}

}
