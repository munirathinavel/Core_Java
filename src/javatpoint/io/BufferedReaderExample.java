package javatpoint.io;

import java.io.*;

public class BufferedReaderExample {
	public static void main(String args[]) throws Exception {
		FileReader fr = new FileReader("D:\\testout.txt");
		BufferedReader br = new BufferedReader(fr);

		int i;
		while ((i = br.read()) != -1) {
			System.out.print((char) i);
		}
		br.close();
		fr.close();

		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br1 = new BufferedReader(r);
		System.out.println("Enter your name");
		String name = br1.readLine();
		System.out.println("Welcome " + name);
	}
}