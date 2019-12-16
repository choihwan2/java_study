package day03;

import java.io.FileInputStream;
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) throws Exception {
		System.out.println("App start");
		int kor = 0, eng = 0, math = 0;
		double avg = 0, sum = 0;
		String nameString = null;

		Scanner scanner = new Scanner(new FileInputStream("C:/lib/score.txt"));
//		System.out.println("성적처리를 종료하시면 quit or q/Q를 입력하세요. 계속 진행하려면 아무키나 입력하세요.");
//		String msgString = scanner.nextLine();
//		if (msgString.toLowerCase().equals("quit") || msgString.toLowerCase().equals("q")) {
//			if (scanner != null) {
//				System.out.println("App을 종료합니다.");
//				scanner.close();
//				scanner = null;
//				return;
//			}
//		}
		System.out.println("이름 국어 영어 수학 점수를 입력하세요: ");
		System.out.println("ex)이름 90 90 55");

//		System.setIn(new FileInputStream("score.txt"));
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
		if (avg > 90) {
			grade = 'A';
		} else if (avg >= 80) {
			grade = 'B';
		} else if (avg >= 70) {
			grade = 'C';
		} else if (avg >= 60) {
			grade = 'E';
		} else {
			grade = 'F';
		}
		System.out.printf("당신의 등급은 %c입니다.", grade);

		scanner.close();
		scanner = null;

		return;
	}

}
