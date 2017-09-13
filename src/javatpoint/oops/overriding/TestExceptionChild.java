package javatpoint.oops.overriding;

import java.io.IOException;

class Parent {
	void msg() {
		System.out.println("parent");
	}
}

class TestExceptionChild extends Parent {
	void msg() throws ArithmeticException {
		System.out.println("TestExceptionChild");
	}

	public static void main(String args[]) {
		Parent p = new TestExceptionChild();
		p.msg();
	}
}