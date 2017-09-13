package javatpoint.string;

import java.util.StringTokenizer;

public class Simple {
	public static void main(String args[]) {
		StringTokenizer st = new StringTokenizer("my name is vel", " ");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}