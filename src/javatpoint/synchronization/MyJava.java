package javatpoint.synchronization;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyJava {
	public static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
	private static Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
	private static Matcher matcher = null;

	public static void main(String[] args) {

		String value = "kate.o'b'rien@durham.ac.uk";
		matcher = pattern.matcher(value);
		boolean isValiEmail = matcher.matches();
		System.out.println("Matching value for email {" + value + "} is = " + isValiEmail);
		System.nanoTime();
		System.currentTimeMillis();
		
		
		Integer i = new Integer(0);
		Boolean b = new Boolean(true);
		Good:

		Integer i1 = Integer.valueOf(0);
		Boolean b1 = Boolean.valueOf(true); // or Boolean.TRUE
	}
}
