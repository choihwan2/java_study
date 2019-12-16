package day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;


public class Test06 {
	public static void main(String[] args) {
		Set<Book> booklist = new HashSet<Book>();
		Scanner scanner = new Scanner(System.in);
		
		//등록
		booklist.add(new Book("java",500));
		booklist.add(new Book("Sql",1500));
		booklist.add(new Book("jsp",5000));
		booklist.add(new Book("java",500));
		
		//출력
		Iterator<Book> it = booklist.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book);
		}
		
		//검색
		String searchText = JOptionPane.showInputDialog("찾고자 하는 책 이름을 입력하세요");
		it = booklist.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			if (book.title.toLowerCase().contains(searchText)) {
				System.out.println(book);
			}
		}
		//삭제
		String deleteText = scanner.nextLine();
		it = booklist.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			if (book.getTitle().toLowerCase().trim().equals(deleteText.toLowerCase().trim())) {
				it.remove();
			}
		}
		
		it = booklist.iterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			System.out.println(book);
		}
		scanner.close();
		scanner = null;
	}

}

class Book {
	String title;
	int price;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
	

}
