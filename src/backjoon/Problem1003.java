package backjoon;

import java.util.Scanner;

/*
 * 첫째 줄에 (A+B)%C, 
 * 둘째 줄에 (A%C + B%C)%C, 
 * 셋째 줄에 (A×B)%C, 
 * 넷째 줄에 (A%C × B%C)%C를 출력한다.
 */
public class Problem1003 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		scanner.close();
		System.out.println((num + num2) % num3);
		System.out.println((num % num3 + num2 % num3) % num3);
		System.out.println((num * num2) % num3);
		System.out.println((num % num3 * num2 % num3) % num3);

	}

}
