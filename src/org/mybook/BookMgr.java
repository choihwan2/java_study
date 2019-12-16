package org.mybook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

/*
 * 
BookMgr 클래스의 제약조건 
1. 책(Book) 객체 여러 개를 저장할 수 있는 책 목록(booklist)이라는 배열을 멤버변수로 가져야 한다. 
2. 책 목록(booklist)이라는 배열 변수를 초기화하는 생성자 메서드를 작성해야 한다. 
4. Book 객체를 booklist에 등록하는 addBook(Book book) 메서드를 작성하세요
5. 책 목록을 화면에 출력하는 printBookList() 메서드가 있어야 한다. 
6. 모든 책 가격의 합을 출력하는 printTotalPrice() 메서드가 있어야 한다. 

 */
public class BookMgr {
	List<Book> bookList;
	Iterator<Book> it;;

	public BookMgr() {
		this.bookList = new ArrayList<Book>();
		this.it = bookList.iterator();
	}

	public void printBookList() {
		System.out.println("=== 책 목록 ===");
		it = bookList.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book);
		}
	}

	public void addBook(Book book) {
		bookList.add(book);
	}

	public void printTotalPrice() {
		System.out.println("=== 책 가격의 총합 ===");
		System.out.print("전체 책 가격의 총합:");
		int sum = 0;
		it = bookList.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			sum += book.getPrice();
		}
		System.out.println(sum);
	}

	public void searchBook() {
		String searchText = JOptionPane.showInputDialog("검색하고자하는 책의 이름을 입력하세요");
		System.out.println("===찾고자 하는 책 목록===");
		it = bookList.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			if (book.getTitle().toLowerCase().trim().contains(searchText)) {
				System.out.println(book);
			}
		}
	}

	public void deleteBook(String title) {
		it = bookList.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			if (book.getTitle().toLowerCase().trim().equals(title.toLowerCase().trim())) {
				bookList.remove(book);
				System.out.println(book.getTitle() + "의 이름을 가진 책을 삭제했습니다.");
				break;
			}
		}
	}

	public void clientAddBook(String title, int price) {
		bookList.add(new Book(title, price));
		System.out.println(title + "의 도서가 " + price + "의 가격으로 추가되었습니다.");
	}

	public void changeBookPrice(String title, int price) {
		it = bookList.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			if (book.getTitle().toLowerCase().trim().equals(title.toLowerCase().trim())) {
				book.setPrice(price);
				System.out.println(book.getTitle() + "의 가격이 " + price + "로 변경 되었습니다.");
				break;
			}
		}
	}
}
