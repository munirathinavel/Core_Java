package javatpoint.java8.featues.methodreference;

import java.util.function.BiFunction;

interface IConstructor {
	void constructorExample(String msg);
}

interface IMethodReference {
	void display(String msg);
}

interface IShowMsg {
	void show();
}

class ConstructorExample {
	public ConstructorExample(String msg) {
		System.out.println(msg);
	}
}

public class StaticMethodReference {

	static void display(String msg) {
		System.out.println(msg);
	}

	static void threadStatus() {
		System.out.println("Thread is running..");
	}

	int addStatic(int a, int b) {
		return a + b;
	}

	static int add(int a, int b) {
		return a + b;
	}

	static float add(float a, float b) {
		return a + b;
	}

	static double add(double a, double b) {
		return a + b;
	}

	void showMsg() {
		System.out.println("Sample Msg..");
	}

	void threadMethod() {
		System.out.println("New Thread has been started...");
	}

	public static void main(String[] args) {

		IMethodReference reference = StaticMethodReference::display;

		reference.display("Cool buddy...");

		BiFunction<Integer, Integer, Integer> addInteger = StaticMethodReference::add;
		System.out.println(addInteger.apply(123, 233));

		BiFunction<Float, Float, Float> addFloat = StaticMethodReference::add;
		System.out.println(addFloat.apply(1.4f, 2.3f));

		BiFunction<Double, Double, Double> addDouble = StaticMethodReference::add;
		System.out.println(addDouble.apply(45.0, 2.33e2));

		Thread t = new Thread(StaticMethodReference::threadStatus);

		t.start();

		StaticMethodReference methodReference = new StaticMethodReference();
		IShowMsg showMsg = methodReference::showMsg;
		showMsg.show();

		IShowMsg showMsg2 = new StaticMethodReference()::showMsg;
		showMsg2.show();

		Thread t2 = new Thread(new StaticMethodReference()::threadMethod);
		t2.start();

		BiFunction<Integer, Integer, Integer> addInstanceMethod = new StaticMethodReference()::addStatic;
		System.out.println(addInstanceMethod.apply(1212, 234234));

		IConstructor constructor = ConstructorExample::new;
		constructor.constructorExample("This is Constructor....");

		System.out.println("All Completed..");

	}
}
