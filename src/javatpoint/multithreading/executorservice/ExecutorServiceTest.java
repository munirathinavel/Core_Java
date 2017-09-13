package javatpoint.multithreading.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTest {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(3);

		Runnable task = new Runnable() {

			@Override
			public void run() {
				
				try {
					Thread.sleep(6000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("This is runnable");
			}
		};

		for (int i = 0; i < 3; i++) {
			executorService.execute(task);
		}

		executorService.shutdown();
		
		while (!executorService.isTerminated()) {

		}

		System.out.println("All thread execution is completed..");

	}
}
