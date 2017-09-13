package fresh;

public class TestFinally {
	public static int getSomeNumber() {
		try {
			return 2;
		} finally {
			return 1;
		}
	}

	public static void main(String[] args) {
		System.out.println("Cool");
		System.out.println(getSomeNumber());
		System.out.println(getSomeNumber1());
		m1();
	}

	public static int getSomeNumber1() {
		try {
			throw new RuntimeException();
		} finally {
			return 12;
		}
	}

	public static void m1() {
		try {
			System.out.println("This line is printed .....");
			// endless loop
			System.exit(1);
		} finally {
			System.out.println("Finally block is reached."); // won't reach
		}
	}

}
