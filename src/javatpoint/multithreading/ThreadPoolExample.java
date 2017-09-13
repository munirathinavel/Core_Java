package javatpoint.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {

	public void run() {
		System.out.println(Thread.currentThread().getName() + " Starts here..");
		display();
		System.out.println(Thread.currentThread().getName() + " Ends here..");
	}

	public void display() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadPoolExample {

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 13; i++) {
			WorkerThread worker = new WorkerThread();
			executor.submit(worker);
		}

		while (!executor.isTerminated()) {
		}

		executor.shutdown();
	}
}
