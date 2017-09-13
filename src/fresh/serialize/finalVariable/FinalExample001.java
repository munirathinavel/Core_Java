package fresh.serialize.finalVariable;

class FinalVariable {

	int i = 10;
	final int j = 10;
	static final int k = 20;

	int i1;
	final int j1;
	static final int k1;

	public FinalVariable(int i1, int j1, int k1) {
		this.i1 = i1;
		this.j1 = j1;
	}

	static {
		k1 = 120;
	}
}

class FinalMethod {
	public final void m1() {
		System.out.println("This is final method");
	}

}

class FinalMethodSubClass extends FinalMethod {
	/*public void m1() {
		System.out.println("This is final method");
	}
*/}

public class FinalExample001 {

	public static void main(String[] args) {
		FinalVariable outer = new FinalVariable(100, 200, 300);
		System.out.println(outer.i);
		System.out.println(outer.j);
		System.out.println(outer.k);

		System.out.println(outer.i1);
		System.out.println(outer.j1);
		System.out.println(FinalVariable.k1);

	}
}
