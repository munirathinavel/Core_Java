package javatpoint.oops.interfaceExample;

interface Printable1 {
	void print();

	default void msg() {
		System.out.println("default method");
	}
}

interface Showable1 extends Printable1 {
	void show();

	static int cube(int x) {
		return x * x * x;
	}
}

class TestInterface4 implements Showable1 {
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String args[]) {
		TestInterface4 obj = new TestInterface4();
		obj.print();
		obj.show();
		obj.msg();

		System.out.println(Showable1.cube(3));
	}
}