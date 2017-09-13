package OODP.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

// Subject
class SubjectImpl {
	String state;
	List<IObserver> observers = new ArrayList<IObserver>();

	void attachObserver(IObserver observer) {
		observers.add(observer);
	}

	void notifyObservers() {
		for (IObserver observer : observers) {
			observer.notifyMe();
		}
	}

	void setState(String state) {
		this.state = state;
		notifyObservers();
	}
}

// Observer
interface IObserver {

	void notifyMe();
}

class Observer1 implements IObserver {
	SubjectImpl subject;

	public Observer1(SubjectImpl subject) {
		this.subject = subject;
		this.subject.attachObserver(this);
	}

	@Override
	public final void notifyMe() {
		System.out.println("This is Observer 1");
	}
}

class Observer2 implements IObserver {
	SubjectImpl subject;

	public Observer2(SubjectImpl subject) {
		this.subject = subject;
		this.subject.attachObserver(this);
	}

	@Override
	public final void notifyMe() {
		System.out.println("This is Observer 2");
	}
}

class Observer3 implements IObserver {
	SubjectImpl subject;

	public Observer3(SubjectImpl subject) {
		this.subject = subject;
		this.subject.attachObserver(this);
	}

	@Override
	public final void notifyMe() {
		System.out.println("This is Observer 3");
	}
}

public class ObserverPatternDemo {

	public static void main(String[] args) {
		SubjectImpl subject = new SubjectImpl();

		new Observer1(subject);
		new Observer2(subject);
		new Observer3(subject);

		subject.setState("State-1");
		
		subject.setState("State-2");
		
		subject.setState("State-3");
	}
}
