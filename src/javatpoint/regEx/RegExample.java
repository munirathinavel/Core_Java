package javatpoint.regEx;

import java.util.regex.Pattern;

public class RegExample {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("[^abc]*", "1tertert"));
		System.out.println(Pattern.matches("[a-zA-Z]", "d"));
		System.out.println(Pattern.matches("[a-z&&[def]]", "f"));
		System.out.println(Pattern.matches("[a-z&&[def]]", "h"));
		System.out.println(Pattern.matches("[a-z&&[^bc]]", "r"));
		System.out.println(Pattern.matches("[a-z&&[^bc]]", "b"));
		System.out.println(Pattern.matches("[a-z&&[^m-p]]", "s"));
		System.out.println(Pattern.matches("[a-z&&[^m-p]]", "m"));
		System.out.println(Pattern.matches(".", "."));
		System.out.println(Pattern.matches(".*", "2342sfdasd"));
		System.out.println(Pattern.matches(".+", "2342sfdasd"));
		System.out.println(Pattern.matches("6?", "6"));
		System.out.println(Pattern.matches("6+", "666"));
		System.out.println(Pattern.matches("6*", "6"));
		System.out.println(Pattern.matches("6+", ""));
		System.out.println(Pattern.matches("6*", ""));
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]{7}", "2342sfd"));
		System.out.println(Pattern.matches("[567]{1}[0-9]{6}", "5123456"));
	}

}
