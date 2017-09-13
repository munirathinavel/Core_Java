package javatpoint.java8.featues.functionalInterface;

interface I1 {
	static void a1() {
		System.out.println("This is static Method");
	}

	default void m2() {
		System.out.println("This is default Method");
	}
}

@FunctionalInterface
interface IFunctionalInterface extends I1 {
	void showMessage();
}

@FunctionalInterface`
interface IFunctionalInterface2 {
	void msg2(String msg);
}

class FunctionalClass implements IFunctionalInterface, IFunctionalInterface2 {
	public void showMessage() {
		System.out.println("Hey.. This is method.");
	}

	public void msg2(String msg) {
		System.out.println(msg);
	}
}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		IFunctionalInterface functionalInterface = new FunctionalClass();
		functionalInterface.showMessage();
		functionalInterface.m2();
		
		I1.a1();
		
		

		IFunctionalInterface2 functionalInterface2 = new FunctionalClass();
		functionalInterface2.msg2("This is msg2");

	}
}
