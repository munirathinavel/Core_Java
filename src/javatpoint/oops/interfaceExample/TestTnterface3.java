package javatpoint.oops.interfaceExample;


class TestTnterface3 implements Printable, Showable {
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String args[]) {
		TestTnterface3 obj = new TestTnterface3();
		obj.print();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}
}