package javatpoint.java7.features;

public class SwitchWithString {

	public static void main(String[] args) {
		String s = "Hello";

		switch (s) {
		case "Hi":
		case "Hey":
			System.out.println(s);
			break;
		case "How are you?":
			System.out.println(s);
			break;
		case "Hello":
			System.out.println(s);
			break;
		default:
			System.out.println("Nothing found");
		}
	}
}
