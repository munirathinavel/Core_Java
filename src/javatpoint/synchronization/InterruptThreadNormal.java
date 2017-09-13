package javatpoint.synchronization;

public class InterruptThreadNormal extends Thread {

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
		InterruptThreadNormal t1 = new InterruptThreadNormal();
		t1.start();
		try {
			// As we are sleeping for more than the Thread (1000), Thread lock
			// is released. So, no exception.
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t1.interrupt();
	}
}
