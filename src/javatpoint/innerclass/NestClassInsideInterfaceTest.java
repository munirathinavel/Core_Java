package javatpoint.innerclass;

interface OuterInterface {

	int i = 10;

	static void staticMethod() {
	}

	void nonStaticMethod();

	class NestedClass {
		int j = 20;

		void method() {
			System.out.println("j=" + this.j + ", i =" + i);
			staticMethod();
		}
	}
}

public class NestClassInsideInterfaceTest {

	public static void main(String[] args) {

		OuterInterface.NestedClass nestedClass = new OuterInterface.NestedClass();
		nestedClass.method();
	}
}