package javatpoint.exceptionhandling;

class Parent2 {
	void msg() throws Exception {
		System.out.println("parent");
	}
}

class TestExceptionChild4 extends Parent2 {
	void msg() throws ArithmeticException {
		System.out.println("child");
	}

	public static void main(String args[]) {
		Parent2 p = new TestExceptionChild4();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}