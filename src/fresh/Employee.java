package fresh;

public final class Employee {
	final int id;
	final StringBuffer buffer;

	public Employee(int id, StringBuffer buffer) {
		this.id = id;
		this.buffer = buffer;
	}

	public int getId() {
		return id;
	}

	public StringBuffer getBuffer() {
		return buffer;
	}

}

