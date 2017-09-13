package codingame;

import java.util.Arrays;

class A {

	static boolean exists(int[] ints, int k) {
		return  Arrays.binarySearch(ints, k) >= 0;
	}

	static boolean exists1(int[] ints, int k) {

		for (int i : ints) {
			if (i == k) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int a[] = new int[1000000];
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}
		long startTime = System.nanoTime();
		System.out.println(exists(a, a.length + 123123434));
		long endTime = System.nanoTime();
		System.out.println(endTime - startTime);

		startTime = System.nanoTime();
		Arrays.binarySearch(a, a.length - 1);
		endTime = System.nanoTime();
		System.out.println(endTime - startTime);

	}

}