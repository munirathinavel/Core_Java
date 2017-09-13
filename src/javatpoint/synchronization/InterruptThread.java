package javatpoint.synchronization;

public class InterruptThread extends Thread {

	public void run() {
		System.out.println("This is interrupted thread example...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			throw new RuntimeException(e.getMessage());
		}
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
		InterruptThread t1 = new InterruptThread();
		t1.start();

		t1.interrupt();
	}
}
