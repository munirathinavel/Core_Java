package javatpoint.exceptionhandling;

class Parent4 {
	void msg() throws Exception {
		System.out.println("parent");
	}
}

class TestExceptionChild3 extends Parent4 {
	void msg() throws Exception {
		System.out.println("child");
	}

	public static void main(String args[]) {
		Parent4 p = new TestExceptionChild3();
		try {
			p.msg();
		} catch (Exception e) {
		}
	}
}