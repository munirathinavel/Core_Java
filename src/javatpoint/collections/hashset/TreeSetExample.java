package javatpoint.collections.hashset;

import java.util.Set;
import java.util.TreeSet;

class TreeBook implements Comparable<TreeBook> {
	int id;
	String name;
	String author;
	int price;

	public TreeBook(int id, String name, String author, int price) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}

	@Override
	public int compareTo(TreeBook t) {

		if (this.id > t.id) {
			return 1;
		} else if (this.id < t.id) {
			return -1;
		} else {
			return 0;
		}
	}

}

public class TreeSetExample {

	public static void main(String[] args) {
		TreeBook book1 = new TreeBook(100, "Complete Reference C", "ABC", 125);
		TreeBook book2 = new TreeBook(2, "Thinking in Java", "XYZ", 250);
		TreeBook book3 = new TreeBook(33, "HeadFirst Java", "PQR", 500);

		Set<TreeBook> treeSet = new TreeSet<>();
		treeSet.add(book1);
		treeSet.add(book2);
		treeSet.add(book3);

		for (TreeBook book : treeSet) {
			System.out.println(
					"Id=" + book.id + ", Author=" + book.author + ", Name=" + book.name + ", Price=" + book.price);
		}
	}
}
