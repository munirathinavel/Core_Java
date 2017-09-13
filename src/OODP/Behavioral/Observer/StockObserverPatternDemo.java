package OODP.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

// Subject Interface
interface Subject {
	void register(Observr observer);

	void unregister(Observr observer);

	void notifyObserver();
}

// Subject Implementation
class StockSubject implements Subject {
	List<Observr> observers;
	int ibmPrice;
	int applePrice;
	int googlePrice;

	public StockSubject() {
		observers = new ArrayList<>();
	}

	@Override
	public void register(Observr observer) {
		this.observers.add(observer);
	}

	@Override
	public void unregister(Observr observer) {
		int index = observers.indexOf(observer);
		System.out.println("Observer " + (index + 1) + " is deleted");
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for (Observr observr : observers) {
			observr.update(ibmPrice, googlePrice, applePrice);
		}
	}

	public void setIbmPrice(int ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}

	public void setApplePrice(int applePrice) {
		this.applePrice = applePrice;
		notifyObserver();
	}

	public void setGooglePrice(int googlePrice) {
		this.googlePrice = googlePrice;
		notifyObserver();
	}

}

// Observer
interface Observr {
	void update(int ibmPrice, int googlePrice, int applePrice);
}

class StockObserver implements Observr {
	Subject subject;
	static int observerTrackerId = 0;
	int observerId;

	public StockObserver(Subject subject) {
		this.subject = subject;
		this.observerId = ++observerTrackerId;
		System.out.println("New Observer Created with ID:" + this.observerId);
		this.subject.register(this);
	}

	@Override
	public void update(int ibmPrice, int googlePrice, int applePrice) {
		System.out.println("\nObserver:" + observerId + "\nibmPrice:" + ibmPrice + "\ngooglePrice:" + googlePrice
				+ "\napplePrice:" + applePrice);
	}
}

public class StockObserverPatternDemo {
	public static void main(String[] args) {
		StockSubject subject = new StockSubject();
		
		Observr observer1 = new StockObserver(subject);
		
		subject.setApplePrice(123);
		subject.setGooglePrice(10);
		subject.setIbmPrice(3456);
		
		Observr observer2 = new StockObserver(subject);
		subject.setApplePrice(75);
		subject.setGooglePrice(2323);
		subject.setIbmPrice(3456);
		
		subject.unregister(observer2);
		
		subject.setApplePrice(75);
		subject.setGooglePrice(2323);
		subject.setIbmPrice(3456);
	}

}
