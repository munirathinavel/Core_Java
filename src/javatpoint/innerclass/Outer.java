package javatpoint.innerclass;

class Outer {
	private int foo = 0;

	static class Inner implements Runnable {
		private final Outer this$0;

		public Inner(Outer outer) {
			this$0 = outer;
		}

		public void run() {
			this$0.foo++;
		}
	}

	public Runnable newFooIncrementer() {
		return new Inner(this);
	}
}
