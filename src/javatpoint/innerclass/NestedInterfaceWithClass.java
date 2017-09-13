package javatpoint.innerclass;

class A {
	interface Message {
		void msg();
	}
}

class NestedInterfaceWithClass implements A.Message {
	public void msg() {
		System.out.println("Hello nested interface");
	}

	public static void main(String args[]) {
		A.Message message = new NestedInterfaceWithClass();// upcasting here
		message.msg();
	}
}