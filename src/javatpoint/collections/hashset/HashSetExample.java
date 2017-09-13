package javatpoint.collections.hashset;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

class Book {
	String name;
	String author;
	int price;

	public Book(String name, String author, int price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}

}

public class HashSetExample {

	public static void main(String[] args) {
		Book book1 = new Book("Complete Reference C", "ABC", 125);
		Book book2 = new Book("Thinking in Java", "XYZ", 250);
		Book book3 = new Book("HeadFirst Java", "PQR", 500);
		Set<Book> books = Collections.synchronizedSet(new HashSet<>());
		books.add(book1);
		books.add(book2);
		books.add(book3);

		for (Book book : books) {
			System.out.println("Author=" + book.author + ", Name=" + book.name + ", Price=" + book.price);
		}
		
		Set<Book> linkedHashSet = Collections.synchronizedSet(new LinkedHashSet<>());
		linkedHashSet.add(book1);
		linkedHashSet.add(book2);
		linkedHashSet.add(book3);

		for (Book book : linkedHashSet) {
			System.out.println("Author=" + book.author + ", Name=" + book.name + ", Price=" + book.price);
		}
	}
}
