package day06;

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
	private Book[] booklistBooks = null;
	private int num = 0;

	public BookMgr() {
		this.booklistBooks = new Book[10];
	}

	public BookMgr(int size) {
		this.booklistBooks = new Book[size];
	}

	public BookMgr(Book[] booklistBooks) {
		this.booklistBooks = booklistBooks;
	}

	public void addBook(Book book) {
		if (num == booklistBooks.length) {
			Book[] temp = new Book[booklistBooks.length * 2];
			System.arraycopy(booklistBooks, 0, temp, 0, booklistBooks.length);
			booklistBooks = temp;
		}
		booklistBooks[num] = book;
		num++;
	}

	public void printBookList() {
		System.out.println("=== 책 목록 ===");
		for (int i = 0; i < num; i++) {
			System.out.println(booklistBooks[i].getTitle());
		}
	}

	public void printTotalPrice() {
		int sum = 0;
		for (int i = 0; i < num; i++) {
			sum += booklistBooks[i].getPrice();
		}
		System.out.println("=== 책 가격의 총합 ===");
		System.out.print("전체 책 가격의 총합:");
		System.out.println(sum);
	}

	public void searchBook() {
		String searchText = JOptionPane.showInputDialog("검색하고자하는 책의 이름을 입력하세요");
		System.out.println("===찾고자 하는 책 목록===");
		for (int i = 0; i < num; i++) {
			if (booklistBooks[i].getTitle().toLowerCase().contains(searchText.toLowerCase())) {
				booklistBooks[i].print();
			}
		}
	}
}
