package javatpoint.oops.thisEx;

class SuperClass {

	int b=10;

	void vennaMethod(String a) {
		// Local variable
		String vennaVariable = a;
		System.out.println("Super Class: vennaVariable==" + vennaVariable);

	}

}

class ThisConstructor extends SuperClass {
	int a; // Instance Variable
	int b= 20; // Variable Oveririding

	ThisConstructor() {
		System.out.println("hello a");
	}

	ThisConstructor(int x) {
		this();
		System.out.println(x);
	}

	// Method Overloading - Single  Class
	void vennaMethod(int a) {
		// Local variable
		int vennaVariable = a;
		System.out.println("vennaVariable==" + vennaVariable);

	}

	// Method Over-riding - SuperClass & Subclass
	void vennaMethod(String a) {
		// Local variable
		String vennaVariable = a;
		System.out.println("SubClass: vennaVariable==" + vennaVariable);

	}

	void vennaMethod(int a, int b) {
		// Local variable
		int vennaVariable = a;
		System.out.println("vennaVariable==" + vennaVariable);

	}

	void vennaMethod(String a, String b) {
		System.out.println("vennaVariable==" + a);

	}

}

class TestThis5 {
	int b; // instance variable

	public static void main(String args[]) {
		int v; // local variable
		ThisConstructor obj = new ThisConstructor(10);
		obj.a = 12;
		obj.vennaMethod(10, 120);
		obj.vennaMethod(122, 123);

		obj.vennaMethod("Hai..");
		System.out.println(obj.b);

	}
}
