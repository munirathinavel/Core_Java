package javatpoint.collections.queue;

import java.util.ArrayDeque;

public class ArrayDEQueue {

	public static void main(String[] args) {
		ArrayDeque<String> arrayDeque = new ArrayDeque<>();

		arrayDeque.add("1");
		arrayDeque.add("2");
		arrayDeque.add("3");
		arrayDeque.add("4");
		arrayDeque.offer("5");

		System.out.println("Printing the Elements:");
		for (String string : arrayDeque) {
			System.out.println(string);
		}
		System.out.println(arrayDeque.poll());
		System.out.println(arrayDeque.pop());
		System.out.println(arrayDeque.remove());
		
		System.out.println("Read:");
		System.out.println(arrayDeque.getFirst());
		System.out.println(arrayDeque.getLast());
		System.out.println(arrayDeque.element());
		System.out.println(arrayDeque.peek());
		
		System.out.println(arrayDeque.peekFirst());
		System.out.println(arrayDeque.peekLast());
		
		System.out.println("Printing the Elements:");
		for (String string : arrayDeque) {
			System.out.println(string);
		}

	}

}
