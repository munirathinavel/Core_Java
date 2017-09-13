package fresh;

public final class Immutable {

	private final int id;
	private final String name;

	public Immutable(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
