package javatpoint.oops.staticEx;

class NoStatic {
	int count = 0;// will get memory when instance is created

	NoStatic() {
		count++;
		System.out.println(count);
	}

	public static void main(String args[]) {

		NoStatic c1 = new NoStatic();
		NoStatic c2 = new NoStatic();
		NoStatic c3 = new NoStatic();

	}
}