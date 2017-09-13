package javatpoint.collections.queue;

import java.util.PriorityQueue;

public class PriorityQueueSimple {
	public static void main(String[] args) {

		PriorityQueue<String> priorityQueue = new PriorityQueue<>();

		priorityQueue.add("A1");
		priorityQueue.add("A2");
		priorityQueue.add("A3");
		priorityQueue.add("A4");
		priorityQueue.add("A5");
		priorityQueue.offer("A6");

		System.out.println("\n Printing Values...");
		for (String myBook : priorityQueue) {
			System.out.println(myBook);
		}
		System.out.println("\n");
		System.out.println(priorityQueue.peek());
		
		System.out.println(priorityQueue.element());
		
		System.out.println("\n Printing Values...");
		
		for (String myBook : priorityQueue) {
			System.out.println(myBook);
		}
		System.out.println("\n");
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue.remove());
		
		System.out.println("\n Printing Values...");
		for (String myBook : priorityQueue) {
			System.out.println(myBook);
		}
	}

}
