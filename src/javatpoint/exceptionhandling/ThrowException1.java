package javatpoint.exceptionhandling;

public class ThrowException1 {

	public static void main(String[] args) {
		validate(14);
		System.out.println("This is end");
	}

	static void validate(int i) {
		if (i < 20) {
			throw new ArithmeticException("Something went wrong!");
		} else {
			System.out.println("Cool");
		}
	}

}
