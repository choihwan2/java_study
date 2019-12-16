package day03;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		System.out.println("App start");
		int kor = 0, eng = 0, math = 0;
		double avg = 0, sum = 0;
		String nameString = null;

		Scanner scanner = new Scanner(System.in);
		System.out.println("성적처리를 종료하시면 quit or q/Q를 입력하세요. 계속 진행하려면 아무키나 입력하세요.");
		String msgString = scanner.nextLine();
		if (msgString.toLowerCase().equals("quit") || msgString.toLowerCase().equals("q")) {
			if (scanner != null) {
				System.out.println("App을 종료합니다.");
				scanner.close();
				scanner = null;
				return;
			}
		}
		System.out.println("이름 국어 영어 수학 점수를 입력하세요: ");
		System.out.println("ex)이름 90 90 55");
		nameString = scanner.next();
		kor = scanner.nextInt();
		eng = scanner.nextInt();
		math = scanner.nextInt();
		scanner.nextLine();

		sum = kor + eng + math;
		avg = sum / 3;

		System.out.printf("이름은 = %s%n국어 점수 = %d%n영어 점수 = %d%n수학 점수 = %d%n", nameString, kor, eng, math);
		System.out.printf("평균 점수는  %.2f%n", avg);

		if (avg >= 80) {
			System.out.println("합격입니다");
		} else {
			System.out.println("불합격입니다");
		}
		scanner.close();
		scanner = null;

		return;
	}

}
