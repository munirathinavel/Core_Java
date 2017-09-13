package javatpoint.exceptionhandling;

class Parent {
	void msg() {
		System.out.println("parent");
	}
}

class TestExceptionChild extends Parent {
	void msg() // throws IOException
	{
		System.out.println("TestExceptionChild");
	}

	public static void main(String args[]) {
		Parent p = new TestExceptionChild();
		p.msg();
	}
}

class TestExceptionChild1 extends Parent {
	void msg() throws ArithmeticException {
		System.out.println("child");
	}

	public static void main(String args[]) {
		Parent p = new TestExceptionChild1();
		p.msg();
	}
}