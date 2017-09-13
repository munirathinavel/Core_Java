package javatpoint.innerclass;

interface Nexus {
	void method();
}

public class AnonymousInterfaceInnerClassTest {

	public static void main(String[] args) {
		Nexus mobile = new Nexus() {

			@Override
			public void method() {
				System.out.println("This is Anonymous inner interface implementation..");
			}
		};
		mobile.method();
	}
}
