package javatpoint.innerclass;

interface Showable {
	int i = 5;

	void show();

	interface Message {
		void msg();
	}
}

public class NestedInterfaceTest implements Showable.Message {
	public void msg() {
		System.out.println("This is nested interface with interface");
	}

	public static void main(String[] args) {
		Showable.Message message = new NestedInterfaceTest();
		message.msg();
	}
}
