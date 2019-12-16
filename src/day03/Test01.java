package day03;

public class Test01 {

	public static void main(String[] args) {
		// == 와 equals() 메소드의 구분 사용
		// 기본형의 값을 비교할때는 == 사용
		// 객체를 비교할때는 equals 함수 사용.

		int i = 90, j = 90, k = 99;
		System.out.printf("i == j = %b i == k %b i != k = %b %n", i == j, i == k, i != k);

		
		String s1 = new String("java");
		String s2 = new String("java");
		
		String s3 = "java";
		String s4 = "java";

		System.out.printf("s1.equals(s2) == %b%n", s1.equals(s2));
		System.out.printf("s3.equals(s4) == %b%n", s3.equals(s4));
		System.out.printf("s1.equals(s3) == %b%n", s1.equals(s3));
		
		System.out.printf("s1 == s2 = %b %ns3 == s4 %b %ns1 == s3 = %b%n", s1 == s2, s3 == s4, s1 == s3);
		
	}

}
