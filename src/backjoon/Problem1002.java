package backjoon;

import java.util.Scanner;

public class Problem1002 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int num2 = scanner.nextInt();
		scanner.close();
		System.out.println(num + num2);
		System.out.println(num - num2);
		System.out.println(num * num2);
		System.out.println(num / num2);
		System.out.println(num % num2);
		
	}

}
