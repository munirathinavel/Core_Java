package javatpoint.gabagecollection;

public class GarbageCollectionExample {
	int i;

	public GarbageCollectionExample(int i) {
		this.i = i;
	}

	public void finalize() {
		System.out.println("This is gabage collection... Finalize Method with i=" + i);
	}

	public static void main(String[] args) {
		GarbageCollectionExample g1 = new GarbageCollectionExample(1);
		GarbageCollectionExample g2 = new GarbageCollectionExample(2);
		g1 = null;
		GarbageCollectionExample g3 = new GarbageCollectionExample(3);
		g3 = g2;

		System.gc();
	}

}
