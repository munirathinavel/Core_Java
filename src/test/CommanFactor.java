/* IMPORTANT: Multiple classes and nested static classes are supported */

//imports for BufferedReader
package test;

//import for Scanner and other utility classes
import java.util.Scanner;

public class CommanFactor {

	public static void main(String args[]) throws Exception {

		// Scanner
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();

		int count = 0;
		for (int i = 1; i < Integer.MAX_VALUE; i++) {

			if (i > a && i > b) {
				break;
			}
			if (a % i == b % i) {
				count++;
			}
		}

		System.out.println("Total Comman Factors for " + a + " &" + b + "  =" + count);
	}

}
