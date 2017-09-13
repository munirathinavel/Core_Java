package javatpoint.oops.thisEx;

class A006 {
	A006 getA() {
		return this;
	}

	void msg() {
		System.out.println("Hello java");
	}
}

class ReturnThisInMethod {
	public static void main(String args[]) {
		new A006().getA().msg();
	}
}