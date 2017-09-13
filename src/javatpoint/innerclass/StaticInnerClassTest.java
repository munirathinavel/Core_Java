package javatpoint.innerclass;

class StaticInnerClassTest {
	static int data = 30;

	static class Inner {
		void msg() {
			System.out.println("data is " + data);
		}
	}

	public static void main(String args[]) {
		StaticInnerClassTest.Inner obj = new StaticInnerClassTest.Inner();
		obj.msg();
	}
}