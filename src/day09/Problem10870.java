package day09;

import java.util.Scanner;

public class Problem10870 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println(f(num));
		scanner.close();

	}

	static int f(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1 || n == 2) {
			return 1;
		} else {
			return f(n - 1) + f(n - 2);
		}
	}
}
