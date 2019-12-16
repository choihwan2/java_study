package org.mybook;

import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		BookMgr bookMgr = new BookMgr();
		Book[] books = { new Book("Java Program", 26400), new Book("JSP Program", 26400),
				new Book("SQL Fundamentals", 26400), new Book("JDBC Program", 26400), new Book("EJB Program", 26400) };
		for (Book book : books) {
			bookMgr.addBook(book);
		}
		boolean flag = true;

		init();
		while (flag) {
			System.out.println();
			System.out.println();
			System.out.print("원하시는 메뉴의 번호를 입력하세요: ");
			Scanner scanner = new Scanner(System.in);
			int cmd = scanner.nextInt();
			scanner.nextLine();
			switch (cmd) {
			case 1:
				bookMgr.printBookList();
				break;

			case 2:
				bookMgr.searchBook();
				break;
			case 3:
				System.out.print("삭제하고싶은 도서의 제목을 입력하세요:");
				String deltitle = scanner.nextLine();
				bookMgr.deleteBook(deltitle);;
				break;
			case 4:
				String title;
				int price;
				System.out.print("추가하고 싶은 도서의 제목을 입력하세요:");
				title = scanner.nextLine();
				System.out.print("추가하고싶은 도서의 가격을 입력하세요:");
				price = scanner.nextInt();
				scanner.nextLine();
				bookMgr.clientAddBook(title, price);
				break;
			case 5:
				System.out.println("변경하고 싶은 도서의 제목을 입력하세요: ");
				String cg_title = scanner.nextLine();
				System.out.println("변경할 가격을 입력해주세요: ");
				int cg_price = scanner.nextInt();
				bookMgr.changeBookPrice(cg_title, cg_price);
				break;
			case 6:
				flag = false;
				scanner.close();
				scanner = null;
				System.out.println("종료되었습니다.");
				break;
			default:
				System.out.println("없는 메뉴를 입력하셨습니다.");
				break;
			}

		}

	}

	public static void init() {
		System.out.println("BookApp이 실행되었습니다.. 환영합니다.");
		System.out.println("원하시는 메뉴를 입력해주세요.");
		System.out.println("*************************");
		System.out.println("*     1. 책 목록보기	*");
		System.out.println("*     2. 도서 검색	*");
		System.out.println("*     3. 도서 삭제	*");
		System.out.println("*     4. 도서 추가	*");
		System.out.println("*     5. 도서 가격 변경	*");
		System.out.println("*     6. 종료 하기	*");
		System.out.println("*************************");
	}

}
