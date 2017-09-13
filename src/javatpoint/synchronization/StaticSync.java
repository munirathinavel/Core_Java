package javatpoint.synchronization;

// This class is used to count the number from nth value based on what thread calls & passes value.
class Counter5 {

	synchronized static void startCounting(int n) {
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

public class StaticSync {
	public static void main(String[] args) {
		System.out.println("This is multi-threading with Method Sync with Anonymous Class");

		Thread t1 = new Thread() {
			public void run() {
				Counter5.startCounting(0);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				Counter5.startCounting(10);
			}
		};
		Thread t3 = new Thread() {
			public void run() {
				Counter5.startCounting(100);
			}
		};

		t1.start();
		t2.start();
		t3.start();

	}

}
