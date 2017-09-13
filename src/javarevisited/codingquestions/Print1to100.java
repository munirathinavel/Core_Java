package javarevisited.codingquestions;

public class Print1to100 {

	public static void main(String[] args) {

		print(10);
	}

	static void print(int number) {
		if (number > 1) {
			print(number - 1);
		}
		System.out.println(number);
	}

}