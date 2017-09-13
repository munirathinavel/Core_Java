package fresh.serialize;

import java.io.Serializable;

public class EmployeeObject implements Serializable {

	private static final long serialVersionUID = 1L;

	public static int count;

	int id;
	String name;

	public EmployeeObject(int id, String name, int count) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
