package fresh.serialize.innerClass;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

class Outer {

	int i = 10;

	void display() {
		System.out.println("This is from Outer Class");
	}

	static class StaticClass {
		int i = 20;

		void display() {
			System.out.println("This is from Static Inner Class");
		}
	}

	class InnerClass {

		int i = 30;

		void display() {
			System.out.println("This is from Inner Class");
		}
	}
}

public class InnerClassExample {

	public static void main(String[] args) {
		// initialize outer class
		Outer outer = new Outer();
		System.out.println(outer.i);
		outer.display();

		// initialize Inner Class
		Outer.StaticClass statiClass = new Outer.StaticClass();
		System.out.println(statiClass.i);
		statiClass.display();

		// initialize Inner Class
		Outer.InnerClass inner = outer.new InnerClass();
		System.out.println(inner.i);
		inner.display();

	}

}
