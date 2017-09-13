package fresh;

class OOM {
	static final int SIZE = 2 * 1024 * 1024;

	public static void main(String[] a) {
		while (true) {
			int[] i = new int[SIZE];
			System.out.println(i);
		}
		
	}
}