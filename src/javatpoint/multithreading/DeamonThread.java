package javatpoint.multithreading;

public class DeamonThread extends Thread {

	public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println("This is Deamon Thread");
		} else {
			System.out.println("This is User Thread");
		}
	}

	public static void main(String[] args) {
		DeamonThread t1 = new DeamonThread();
		DeamonThread t2 = new DeamonThread();

		t1.setDaemon(true);

		t1.start();

		t2.start();

		// t2.setDaemon(true); // User Thread can not be changed to Daemon
		// Thread
	}
}
