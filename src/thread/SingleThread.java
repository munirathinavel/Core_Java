package thread;

public class SingleThread extends Thread {

	public void run() {
		System.out.println("This is Single Thread...");
	}

	public static void main(String[] args) {
		SingleThread singleThread = new SingleThread();
		singleThread.start();
	}
}


