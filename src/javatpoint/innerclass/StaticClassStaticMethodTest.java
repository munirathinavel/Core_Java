package javatpoint.innerclass;

class StaticClassStaticMethodTest {
	static int data;
	static {
		data = 50;
	}

	static class Inner {
		static void msg() {
			System.out.println("data is " + data);
		}
	}

	public static void main(String args[]) {
		StaticClassStaticMethodTest.Inner.msg();// no need to create the
												// instance of static
		// nested class
	}
}