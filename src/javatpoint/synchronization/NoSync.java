package javatpoint.synchronization;

// This class is used to count the number from nth value based on what thread calls & passes value.
class Counter {

	void startCounting(int n) {
		for (int i = 0; i < 5; i++) {
			System.out.println(i + n);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread1 extends Thread {
	Counter counter;

	public Thread1(Counter c) {
		counter = c;
	}

	public void run() {
		counter.startCounting(0);
	}
}

class Thread2 extends Thread {
	Counter counter;

	public Thread2(Counter c) {
		counter = c;
	}

	public void run() {
		counter.startCounting(10);
	}
}

class Thread3 extends Thread {
	Counter counter;

	public Thread3(Counter c) {
		counter = c;
	}

	public void run() {
		counter.startCounting(100);
	}
}

public class NoSync {
	public static void main(String[] args) {
		System.out.println("This is multi-threading with no sync");

		Counter c = new Counter();

		Thread1 t1 = new Thread1(c);
		Thread2 t2 = new Thread2(c);
		Thread3 t3 = new Thread3(c);

		t1.start();
		t2.start();
		t3.start();

	}

}
