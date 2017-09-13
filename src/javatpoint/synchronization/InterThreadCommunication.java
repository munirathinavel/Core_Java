package javatpoint.synchronization;

class Customer {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("Withdrawing amount..");
		if (this.amount < amount) {
			System.out.println("Less Balance.. Waiting for deposit..");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.amount -= amount;
		System.out.println("Withdrawal completed..");
	}

	synchronized void deposit(int amount) {
		System.out.println("Depositing the amount..");
		this.amount += amount;
		notify();
		System.out.println("Deposit completed..");
	}
}

public class InterThreadCommunication {
	public static void main(String[] args) {
		Customer customer = new Customer();

		new Thread() {
			public void run() {
				customer.withdraw(20000);
			}
		}.start();

		new Thread() {
			public void run() {
				customer.deposit(15000);
			}
		}.start();
	}

}
