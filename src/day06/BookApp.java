package day06;

public class BookApp {

	public static void main(String[] args) {
		BookMgr bookMgr = new BookMgr(3);
		Book[] books = { new Book("Java Program", 26400), new Book("JSP Program", 26400),
				new Book("SQL Fundamentals", 26400), new Book("JDBC Program", 26400), new Book("EJB Program", 26400)
		};
		for (Book book : books) {
			bookMgr.addBook(book);
		}
		bookMgr.printBookList();
		System.out.println();
		bookMgr.printTotalPrice();
		bookMgr.searchBook();
		
	}

}
