package javatpoint.synchronization;

public class InterruptThreadHandleException extends Thread {

	public void run() {
		System.out.println("This is interrupted thread example...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Thread is running..");
	}

	public static void main(String[] args) {
		InterruptThreadHandleException t1 = new InterruptThreadHandleException();
		t1.start();

		t1.interrupt();
	}
}
