package javatpoint.exceptionhandling;

import java.io.*;


class Testthrows3 {
	public static void main(String args[]) throws IOException {// declare
																// exception
		M m = new M();
		m.method();

		System.out.println("normal flow...");
	}
}