package fresh;

public class PrimeNumber {

	public static void main(String[] args) {

		int n = 7;
		boolean isPrimeNumber = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				isPrimeNumber = false;
				break;
			}
		}
		System.out.println(isPrimeNumber);
	}

}
