package javatpoint.multithreading;

class MyThread extends Thread {
	public void run() {
		System.out.println("This is my sample thread..");
	}
}

public class ThreadExample {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
	}
}
