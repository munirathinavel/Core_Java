package javatpoint.multithreading;

class MyThread1 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
}

public class ThreadSleepExample extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	} 
	public static void main(String[] args) {
		ThreadSleepExample myThread1 = new ThreadSleepExample();
		myThread1.start();
		
		ThreadSleepExample myThread2 = new ThreadSleepExample();
		myThread2.start();
	}
}
