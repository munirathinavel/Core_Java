package javatpoint.java5.features;

public class VarArgsExample {

	static void printValues(int... values) {
		for (int i : values) {
			System.out.println(i);
		}
	}

	static void printValues(int i, String... values) {
		System.out.println("i=" + i);
		for (String s : values) {
			System.out.println(s);
		}
	}

	static void debugPrint(String... strings) {
		for (String string : strings) {
			System.out.println(string);
		}
	}

	public static void main(String[] args) {
		printValues(1, 2, 3);
		printValues(1, 2, 3, 4, 5, 6, 7, 8, 9);

		printValues(3, "s1", "s2", "s3");
		printValues(5, "s1", "s2", "s3", "s4", "s5");

		debugPrint("this", "2323", "asdasd", "sdasd");

	}
}
