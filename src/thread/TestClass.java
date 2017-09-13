package thread;
/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility  classes
import java.util.*;

class TestClass {
	public static void main(String args[]) throws Exception {
		// Scanner
		Scanner s = new Scanner(System.in);
		int N = Integer.parseInt(s.next());
		int a[] = new int[N];
		int sum = 0;
		if (N < 1 || N > 10) {
			return;
		}
		for (int i = 0; i < N; i++) {

			a[i] = s.nextInt();
			sum = sum + a[i];
		}

		for (int i = 0; i < a.length; i++) {

			for (int j = 1; j <= a[i]; j++) {

				if (j % 3 == 0 && j % 5 == 0) {
					System.out.println("FizzBuzz");

				} else if (j % 3 == 0) {
					System.out.println("Fizz");

				} else if (j % 5 == 0) {
					System.out.println("Buzz");

				} else {
					System.out.println(j);
				}
			}
		}
	}
}
