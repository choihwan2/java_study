package day03;

public class Test06 {

	public static void main(String[] args) {

		// 반복처리
		// 초기값설정
		for (int i = 0; i < 4; i++) { // i 는 블락변수 for 안에서만 사용.
			System.out.println("hello java" + i);
		}
		System.out.println("-----------------");
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
			System.out.print(i);
		}
		System.out.println();
		System.out.println(sum);
		System.out.println("-----------------------------");
		String msgString = "hello mother";
		
		for(int i = msgString.length() - 1; i >= 0; i--) {
			System.out.print(msgString.charAt(i));
		}
		
	}

}
