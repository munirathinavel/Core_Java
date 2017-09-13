package javatpoint.java4.features;

import java.util.Scanner;

public class AssertionEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age:");
		int age = sc.nextInt();

		assert age < 18 : "Not a valid age to code";
		System.out.println("value us " + age);
		
	}

}
