package javatpoint.synchronization;

class Reentrant {
	synchronized void m1() {
		System.out.println("This is m1");

		m2();
	}

	synchronized void m2() {
		System.out.println("This is m2");
	}
}

public class ReentrantExample {

	public static void main(String[] args) {

		Reentrant reentrant = new Reentrant();

		Thread t1 = new Thread() {
			public void run() {
				reentrant.m1();
			}
		};
		t1.start();
	}

}
