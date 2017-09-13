package javatpoint.synchronization;

class Sample {

	void interruptMethod() {

		synchronized (this) {
			if (Thread.interrupted()) {
				System.out.println("Thread is interrupted.." + Thread.currentThread().getName());
			} else {
				System.out.println("Thread is not interrupted.." + Thread.currentThread().getName());
			}

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (Thread.interrupted()) {
				System.out.println("Thread is interrupted..2" + Thread.currentThread().getName());
			} else {
				System.out.println("Thread is not interrupted..2" + Thread.currentThread().getName());
			}
		}

	}
}

public class InterruptedMethod extends Thread {
	Sample s;

	public InterruptedMethod(Sample s) {
		this.s = s;
	}

	public void run() {
		s.interruptMethod();
	}

	public static void main(String[] args) {
		Sample s = new Sample();
		InterruptedMethod t1 = new InterruptedMethod(s);
		t1.start();
		InterruptedMethod t2 = new InterruptedMethod(s);
		t2.start();

		InterruptedMethod t3 = new InterruptedMethod(s);
		t3.start();
		t3.interrupt();

		InterruptedMethod t4 = new InterruptedMethod(s);
		t4.start();
		t4.interrupt();
	}
}
