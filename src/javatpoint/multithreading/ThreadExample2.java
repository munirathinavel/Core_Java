package javatpoint.multithreading;

class MyThread2 extends Thread {
	public void run() {
		System.out.println("This is my sample thread..");
	}
}

public class ThreadExample2 {

	public static void main(String[] args) {
		MyThread2 myThread = new MyThread2();
		myThread.start();
		
		MyThread2 myThread2 = new MyThread2();
		myThread2.start();
		myThread2.start();
	}
}
