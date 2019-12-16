package day08;

import java.util.Scanner;

public class Problem10872 {
	public static void main(String[] args) {
		Scanner aScanner = new Scanner(System.in);
		int num = aScanner.nextInt();

		aScanner.close();
		System.out.println(factorial(num));
	}
	
	static int factorial(int number) {
		if (number == 1) {
			return 1;
		}else {
			return number * factorial(number -1);
		}
	}

}
