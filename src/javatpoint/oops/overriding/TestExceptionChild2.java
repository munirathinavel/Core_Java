package javatpoint.oops.overriding;

class Parent1 {
	void msg() throws Exception {
		System.out.println("Parent1");
	}
}

class TestExceptionChild2 extends Parent1 {
	void msg() throws ArithmeticException {
		System.out.println("child");
	}

	public static void main(String args[]) {
		Parent1 p = new TestExceptionChild2();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}