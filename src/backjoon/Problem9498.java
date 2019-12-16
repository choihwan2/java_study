package backjoon;

import java.util.Scanner;

public class Problem9498 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score =  scanner.nextInt();
		char grade = 'F';
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.printf("%c", grade);
		scanner.close();
		scanner = null;
		return;
	}

}
