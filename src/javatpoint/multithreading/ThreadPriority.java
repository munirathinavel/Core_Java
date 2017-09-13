package javatpoint.multithreading;

public class ThreadPriority extends Thread {

	public void run() {
		System.out.println("Thread Name=" + Thread.currentThread().getName());
		System.out.println("Thread Priority=" + Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		ThreadPriority t1 = new ThreadPriority();
		t1.setName("t1");
		t1.setPriority(Thread.MAX_PRIORITY);

		ThreadPriority t2 = new ThreadPriority();
		t2.setName("t2");
		t2.setPriority(Thread.MIN_PRIORITY);

		ThreadPriority t3 = new ThreadPriority();
		t3.setName("t3");
		t3.setPriority(Thread.NORM_PRIORITY);

		t1.start();

		t2.start();

		t3.start();
	}
}
