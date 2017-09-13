package javatpoint.synchronization;

public class InterruptThreadNormal2 extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		InterruptThreadNormal2 t1 = new InterruptThreadNormal2();
		t1.start();
		t1.interrupt();
	}
}
