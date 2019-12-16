package org.mybook;

public class BookMapTest {

	public static void main(String[] args) {
		BookMap bookMap = new BookMap();
		bookMap.addBookMap(new Book("어린왕자", 30000));
		bookMap.addBookMap(new Book("다큰왕자", 50000));
		bookMap.addBookMap(new Book("바보왕자", 3000));
		
		bookMap.printAllBook();

	}

}
