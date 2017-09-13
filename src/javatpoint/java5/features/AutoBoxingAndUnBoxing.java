package javatpoint.java5.features;

public class AutoBoxingAndUnBoxing {

	static void m1(int i1) {
		System.out.println("int");
	}

	static void m1(Integer i1) {
		System.out.println("Integer");
	}

	static void m2(int i1, int i2) {
		System.out.println("int");
	}

	static void m2(int... ints) {
		System.out.println("int...");
	}

	static void m3(Integer i1, Integer i2) {
		System.out.println("integer");
	}

	static void m3(Integer... integers) {
		System.out.println("integers...");
	}

	/*
	 * static void m4(long i1) { System.out.println("long"); }
	 */

	/*
	 * static void m4(Long i1) { System.out.println("long"); }
	 */

	public static void main(String[] args) {

		// Unboxing
		Integer i1 = new Integer(10);
		int i2 = i1;

		// Boxing
		int i3 = 121;
		Integer i4 = new Integer(i3);
		Integer i5 = i3;

		Integer i6 = new Integer(123);
		if (i6 > 100) {
			System.out.println(i6);
		}

		// Widening beats boxing
		short s1 = 12;
		m1(s1);

		// Widening beats varargs
		short s2 = 123;
		m2(s1, s2);

		// Boxing beats varargs
		m3(123, 122);

		// Widening and Boxing -- Compiler Error
		// m4(12);
	}
}
