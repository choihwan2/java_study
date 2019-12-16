package day09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

import day06.Book;

public class Test07 {
	public static void main(String[] args) {
		System.out.println("========START========");
		try (Scanner scanner = new Scanner(new File("bookdata.txt"));) {
			// Closeable 을 implement 하고 있으면 괄호안에다가 넣어서 자원반납이 자동 가능함.
			StringTokenizer st = null;
			while (scanner.hasNextLine()) {
				st = new StringTokenizer(scanner.nextLine());
				Book book = new Book(st.nextToken(), Integer.parseInt(st.nextToken()));
				System.out.println(book);
//				String[] data = scanner.nextLine().split(" ");
//				Book book = new Book(data[0], Integer.parseInt(data[1]));
//				System.out.println(book);
			}
		} catch (FileNotFoundException e) {
			System.out.println("bookdata.txt 파일 확인 해 주세요.");
		} finally {

		}

		System.out.println("=========END=========");
	}
}
