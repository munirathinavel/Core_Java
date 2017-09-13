package javatpoint.collections.queue;

import java.util.PriorityQueue;

class MyBook implements Comparable<MyBook> {
	int id;
	String author;
	String name;
	int price;

	public MyBook(int id, String author, String name, int price) {
		this.id = id;
		this.author = author;
		this.name = name;
		this.price = price;
	}

	public int compareTo(MyBook book) {
		if (this.id > book.id) {
			return 1;
		} else if (this.id < book.id) {
			return -1;
		} else {
			return 0;
		}
	}
}

public class PriorityQueueExample {
	public static void main(String[] args) {

		MyBook book1 = new MyBook(12, "Vel", "Be My Reader", 1500);
		MyBook book2 = new MyBook(4, "Ram", "This is Ramayanam..", 2500);
		MyBook book3 = new MyBook(100, "San", "Be My Reader", 3500);

		PriorityQueue<MyBook> priorityQueue = new PriorityQueue<>();

		priorityQueue.add(book1);
		priorityQueue.add(book2);
		priorityQueue.add(book3);

		for (MyBook myBook : priorityQueue) {
			System.out.println("ID=" + myBook.id + ", Author=" + myBook.author + ", Name=" + myBook.name + ", Price="
					+ myBook.price);
		}
	}

}
