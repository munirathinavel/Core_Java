package javatpoint.multithreading;

public class ThreadJoinExample1 extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
			System.out.println(i + " " + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {

		ThreadJoinExample1 t1 = new ThreadJoinExample1();
		ThreadJoinExample1 t2 = new ThreadJoinExample1();
		ThreadJoinExample1 t3 = new ThreadJoinExample1();
		ThreadJoinExample1 t4 = new ThreadJoinExample1();

		t1.start();

		t2.start();

		t3.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		t4.start();
	}
}
