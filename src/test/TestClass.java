package test;
/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.util.Arrays;
import java.util.Scanner;

class TestClass {
	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		int N = Integer.parseInt(s.next());
		int a[] = new int[N];
		int sum = 0;
		for (int i = 0; i < N; i++) {
			a[i] = s.nextInt();
			sum = sum + a[i];
		}

		Arrays.sort(a);

		int updateSum = 0;
		int updateNum = 1;
		for (int i = 0; i < a.length && updateSum <= sum; i++) {
			updateNum = a[i];
			updateSum = updateNum * a.length;
		}

		System.out.println(updateNum);
		s.close();
	}
}
