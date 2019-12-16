package day03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		String nameString = null;
		int kor = 0;
		int math = 0;

		Scanner nameScanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요: ");
		nameString = nameScanner.nextLine();
		System.out.println("국어 점수를 입력하시요: ");
		kor = Integer.parseInt(nameScanner.nextLine());
		System.out.println("수학 점수를 입력하시요: ");
		math = nameScanner.nextInt();
		nameScanner.nextLine(); // nextInt 에서 읽어드린 정수값 뒤에 있는 enter키를 가져감.

		System.out.printf("당신의 이름은 %s 이군요 허허허%n그리고 당신의 국어 점수는 : %d 이고 수학은 : %d%n평균이 %d군요.%nc", nameString, kor, math,
				(kor + math) / 2);
		System.out.println((kor + math) / 2 > 90 ? "성공한 인생이군요. 당신은 합격입니다" : "패배한 녀석 돌아가 안바꿔줘");
		nameScanner.close();		//자원반납
		nameScanner = null;			//gc의 대상
		return;
	}
}
