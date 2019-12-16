package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyApp {
	public static void main(String[] args) {
		boolean start = true;
		while (start) {
			int chooseNum = 0;
			Scanner scanner = new Scanner(System.in);
			System.out.println("원하는 메뉴 번호를 입력하세요 .. \n");
			System.out.println("1.입\t력\n");
			System.out.println("2.수\t정\n");
			System.out.println("3.삭\t제\n");
			System.out.println("4.검\t색\n");
			System.out.println("5.목록보기\n");
			System.out.println("9.종\t료\n");
			try {
				chooseNum = scanner.nextInt();
				scanner.nextLine();		
			} catch (InputMismatchException e) {
				System.out.println("정수가 아닌수를 입력하셨습니다 정수로 입력해주세요.");
			}
			switch (chooseNum) {
			case 1:
				System.out.println("입력 실행\n");
				break;
			case 2:
				System.out.println("수정 실행\n");
				break;
			case 3:
				System.out.println("삭제 실행\n");
				break;
			case 4:
				System.out.println("검색 실행\n");
				break;
			case 5:
				System.out.println("목록보기 실행\n");
				break;
			case 9:
				System.out.println("종료 실행\n");
				System.out.println("정말로 종료하시겠습니까? 원하시면 yes를 입력하세요" );
				String quit= scanner.nextLine();
				if(quit.toLowerCase().equals("yes"))
				{
					start = !start;
					scanner.close();
					scanner = null;
				}
				break;
			default:
				if(chooseNum != 0)
				System.out.println("없는 메뉴를 선택하셨습니다 다시 입력해주세요.\n");
				break;
			}
		}
	}
}
