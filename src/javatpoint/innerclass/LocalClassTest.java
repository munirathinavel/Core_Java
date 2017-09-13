package javatpoint.innerclass;

public class LocalClassTest {

	int i = 10;

	void display() {
		int j = 15;
		class LocalClass {
			void msg() {
				System.out.println("This is local class with i=" + i + ", j=" + j);
			}
		}

		LocalClass local = new LocalClass();

		local.msg();
	}

	public static void main(String[] args) {

		LocalClassTest classTest = new LocalClassTest();
		classTest.display();
	}
}
