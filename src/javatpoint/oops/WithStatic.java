package javatpoint.oops;

class WithStatic {
	static int count = 0;// will get memory only once and retain its value

	WithStatic() {
		count++;
		System.out.println(count);
	}

	public static void main(String args[]) {

		WithStatic c1 = new WithStatic();
		WithStatic c2 = new WithStatic();
		WithStatic c3 = new WithStatic();

	}
}