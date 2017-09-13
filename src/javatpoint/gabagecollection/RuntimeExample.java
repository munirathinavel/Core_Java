package javatpoint.gabagecollection;

public class RuntimeExample {

	int i ;
	String s;

	public static void main(String[] args) {

		System.out.println("availableProcessors:" + Runtime.getRuntime().availableProcessors());
		System.out.println("freeMemory:" + Runtime.getRuntime().freeMemory());
		System.out.println("totalMemory:" + Runtime.getRuntime().totalMemory());
		System.out.println("maxMemory:" + Runtime.getRuntime().maxMemory());
		/*
		 * try { Runtime.getRuntime().exec("notepad"); } catch (IOException e) {
		 * // TODO Auto-generated catch block e.printStackTrace(); }
		 */

		for (int i = 0; i < 1000000; i++) {
			new RuntimeExample();
		}
		System.out.println("After memory allocation...");
		System.out.println("freeMemory:" + Runtime.getRuntime().freeMemory());
		System.out.println("totalMemory:" + Runtime.getRuntime().totalMemory());
		System.out.println("maxMemory:" + Runtime.getRuntime().maxMemory());

		System.gc();

		System.out.println("After Garbage Collection...");
		System.out.println("freeMemory:" + Runtime.getRuntime().freeMemory());
		System.out.println("totalMemory:" + Runtime.getRuntime().totalMemory());
		System.out.println("maxMemory:" + Runtime.getRuntime().maxMemory());
	}
}
