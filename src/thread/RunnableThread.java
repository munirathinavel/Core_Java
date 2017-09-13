package thread;

public class RunnableThread implements Runnable {
	public void run() {
		System.out.println("This is runnable thread");
	}

	public static void main(String[] args) {
		Thread runnableThread = new Thread(new RunnableThread());
		runnableThread.start();
	}
}
