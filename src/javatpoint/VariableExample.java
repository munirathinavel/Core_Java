package javatpoint;

public class VariableExample {

	// Instance
	int a = 10; // a is variable , 10 is value
	static String startingLocation = "Madiwala"; // static variable

	public static void main(String[] args) {

		int k = 10; // Local Variable
		// instance
		VariableExample instance1 = new VariableExample();
		System.out.println();
		System.out.println();
		System.out.println(instance1.a);
	}

	void display() {
		int i = 22; // Local Variable
	}

}
