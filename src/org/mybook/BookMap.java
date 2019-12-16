package org.mybook;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BookMap {
	Map<Integer, Book> bookMap;

	public BookMap() {
		bookMap = new HashMap<Integer, Book>();
	}

	public BookMap(Map<Integer, Book> bookMap) {
		super();
		this.bookMap = bookMap;
	}

	public void addBookMap(Book book) {
		bookMap.put(book.hashCode(), book);
	}

	public void printAllBook() {
		Set<Integer> keys = bookMap.keySet();
		Iterator<Integer> it = keys.iterator();
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			System.out.println(bookMap.get(integer));
		}
	}

}
