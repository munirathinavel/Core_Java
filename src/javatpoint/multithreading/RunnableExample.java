package javatpoint.multithreading;

class MyRunnable implements Runnable {
	public void run() {
		System.out.println("This is thread implemented through runnable");
	}
}

public class RunnableExample {

	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread myThread = new Thread(myRunnable);
		myThread.start();
	}

}
