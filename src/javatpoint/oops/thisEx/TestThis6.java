package javatpoint.oops.thisEx;

class ThisConstructor2 {
	ThisConstructor2() throws RuntimeException   {
		
		System.out.println("hello a");
	}

	ThisConstructor2(int x) throws ArithmeticException {
		this();
		int y = 12/0;
		System.out.println(x);
	}
}

class TestThis6 {
	public static void main(String args[]) {
		ThisConstructor2 a = new ThisConstructor2();
	}
}