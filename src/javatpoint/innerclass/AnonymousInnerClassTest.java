package javatpoint.innerclass;

abstract class Computer {
	abstract void abstractMethod();
}

public class AnonymousInnerClassTest {

	public static void main(String[] args) {

		Computer computer = new Computer() {

			@Override
			void abstractMethod() {
				System.out.println("This is anonymous inner class method implementation...");
			}
		};

		computer.abstractMethod();
	}

}
