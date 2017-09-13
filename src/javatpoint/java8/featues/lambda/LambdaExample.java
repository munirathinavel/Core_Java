package javatpoint.java8.featues.lambda;

class Addition implements Add2Numbers {

	public int add2Num(int a, int b) {
		int c = a + b;
		return c;
	}
}

public class LambdaExample {

	public static void main(String[] args) {

		Add2Numbers addTwoNumbers = new Addition();
		int sum = addTwoNumbers.add2Num(10, 15);
		System.out.println(sum);

		// Labmda Expressions
		Add2Numbers add2 = (a, b) -> a + b;

		System.out.println(add2.add2Num(10, 15));

		System.out.println(add2.add2Num(100, 1015));

		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("Moodittu iru...");
			}
		};

		Thread t1 = new Thread(r1);
		t1.start();
		
		Runnable r2 = () -> System.out.println("Marethiyaa iru");
		Thread t2 = new Thread(r2);
		
		t2.start();

	}
}

interface Add2Numbers {
	int add2Num(int a, int b);
}
