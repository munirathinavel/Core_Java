package javatpoint.java7.features;

public class MultipleExceptionExampleOld {

	public static void main(String[] args) {

		oldExceptionHandling();
		newExceptionHandling();
	}

	private static void newExceptionHandling() {

		try {
			int[] a = new int[5];
			a[5] = 30 / 0;
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static void oldExceptionHandling() {
		try {
			int[] a = new int[5];
			a[5] = 30 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
