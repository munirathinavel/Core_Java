package javatpoint.synchronization;

// This class is used to count the number from nth value based on what thread calls & passes value.
class Counter2 {

	synchronized void startCounting(int n) {
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

class Thread10 extends Thread {
	Counter2 counter;

	public Thread10(Counter2 c) {
		counter = c;
	}

	public void run() {
		counter.startCounting(0);
	}
}

class Thread20 extends Thread {
	Counter2 counter;

	public Thread20(Counter2 c) {
		counter = c;
	}

	public void run() {
		counter.startCounting(10);
	}
}

class Thread30 extends Thread {
	Counter2 counter;

	public Thread30(Counter2 c) {
		counter = c;
	}

	public void run() {
		counter.startCounting(100);
	}
}

public class MethodSync {
	public static void main(String[] args) {
		System.out.println("This is multi-threading with Method Sync");

		Counter2 c = new Counter2();

		Thread10 t1 = new Thread10(c);
		Thread20 t2 = new Thread20(c);
		Thread30 t3 = new Thread30(c);

		t1.start();
		t2.start();
		t3.start();

	}

}
