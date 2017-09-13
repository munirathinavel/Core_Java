package javatpoint.regEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean found = false;
		while (true) {
			System.out.println("Enter RegEx Pattern:");
			Pattern p = Pattern.compile(sc.nextLine());
			System.out.println("Enter Matching Input String:");
			Matcher m = p.matcher(sc.nextLine());

			while (m.find()) {
				System.out.println("Match Found is " + m.group() + " with start:" + m.start() + " and end:" + m.end());
				found = true;
			}

			if (!found) {
				System.out.println("Match not found!");
			}
		}
	}
}
