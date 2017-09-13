package javatpoint.innerclass;

public class MemberInnerClassTest {

	int i = 10;

	void display() {
		System.out.println("This is outer class method..");
	}

	static void staticMethod() {
		System.out.println("This is outer class static method..");
	}

	class MemberInnerClass {
		int j = 10;

		void innerClassMethod() {
			// Accessing member from outer class
			System.out.println("This is member inner class with i=" + i);
			// Accessing method from outer class
			display();

			// Accessing Static Method
			staticMethod();

			// Accessing Outer Class fields & Methods
			MemberInnerClassTest classTest = new MemberInnerClassTest();
			classTest.display();
			classTest.staticMethod();
		}
	}

	public static void main(String[] args) {
		MemberInnerClassTest classTest = new MemberInnerClassTest();
		MemberInnerClass innerClass = classTest.new MemberInnerClass();
		innerClass.innerClassMethod();
	}
}
