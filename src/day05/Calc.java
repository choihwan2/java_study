package day05;

public class Calc {

	public static int add(int... a) { //가변인자 처리 인자가 몇개가 오던 상관없음 내부적으로 배열처리가 됨.
		//가변인자는 언제나 앞에 와야함 ex) add(int...a , char c) 가능 위치 바뀌면 불가능
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	// 메소드 오버로딩 = 같은 메소드의 이름이지만 매개변수가 다름.
	public static double add(double a, double b) {
		return a + b;
	}

}
