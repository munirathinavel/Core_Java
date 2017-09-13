package javatpoint.synchronization;

public class DeadlockExample {

	public static void main(String[] args) {
		System.out.println("This is deadlock example...");
		final String s1 = "Cool";
		String s2 = "hot";

		Thread t1 = new Thread() {
			public void run() {
				synchronized (s1) {
					System.out.println("T1 is lLocking S1");

					try {
						Thread.sleep(400);
					} catch (InterruptedException e) {
						System.out.println(e);
					}

					synchronized (s2) {
						System.out.println("T1 is locking S2");
					}
				}

			}
		};

		Thread t2 = new Thread() {
			public void run() {
				synchronized (s2) {
					System.out.println("T2 is lLocking S2");

					try {
						Thread.sleep(400);
					} catch (InterruptedException e) {
						System.out.println(e);
					}

					synchronized (s1) {
						System.out.println("T2 is locking S1");
					}
				}

			}
		};

		t1.start();
		t2.start();

	}

}
