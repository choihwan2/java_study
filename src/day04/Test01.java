package day04;

import java.io.FileInputStream;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) throws Exception {
		System.out.println("App start");
		int kor = 0, eng = 0, math = 0;
		double avg = 0, sum = 0;
		String nameString = null;

		Scanner scanner = new Scanner(new FileInputStream("C:/lib/score.txt"), "UTF-8");

		nameString = scanner.next();
		kor = scanner.nextInt();
		eng = scanner.nextInt();
		math = scanner.nextInt();
		scanner.nextLine();

		sum = kor + eng + math;
		avg = sum / 3;

		System.out.printf("이름은 = %s%n국어 점수 = %d%n영어 점수 = %d%n수학 점수 = %d%n", nameString, kor, eng, math);
		System.out.printf("평균 점수는  %.2f%n", avg);

		// 학점 처리 A B C D E F

		char grade = 'F';
//		if (avg > 90) {
//			grade = 'A';
//		} else if (avg >= 80) {
//			grade = 'B';
//		} else if (avg >= 70) {
//			grade = 'C';
//		} else if (avg >= 60) {
//			grade = 'E';
//		} else {
//			grade = 'F';
//		}

		switch ((int) avg / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		System.out.printf("당신의 등급은 %c입니다.%n", grade);
		scanner.close();
		scanner = null;
		switch (grade) {
		case 'A':
			System.out.println("축하합니다 열심히 하셨군요");
			break;
		case 'B':
			System.out.println("B지만 좀만 더 힘내요!!");
			break;
		case 'C':
			System.out.println("보통 정도만 해도 괜찮을까요?");
			break;
		case 'D':
			System.out.println("문제가 있습니다.");
			break;
		case 'F':
			System.out.println("심각하군요 포기한건가요?");
			break;
		default:
			System.out.println("대체 무슨짓을 한거에요!");
			break;
		}

		return;
	}

}
