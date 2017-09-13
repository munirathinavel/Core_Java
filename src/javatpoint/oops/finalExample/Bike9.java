package javatpoint.oops.finalExample;

final class Bike01 {

	final void run() {
		System.out.println("running");
	}
}

class Bike9 // extends Bike01 // Cannot extend the final class
{
	final int speedlimit = 90;// final variable
	final int height;// blank Variable
	static final int weight;

	Bike9() { // blank final variables can be assigned by Constructor
		height = 10;
	}

	static { // Static blank final variables can be assigned by static block
		weight = 10;
	}

	// Cannot override the final method
	// void run() {
	// speedlimit = 400; // Cannot be re-assigned
	// }

	public static void main(String args[]) {
		Bike9 obj = new Bike9();
		// obj.run();
	}
}// end of class