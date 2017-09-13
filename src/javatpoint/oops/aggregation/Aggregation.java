package javatpoint.oops.aggregation;

class Address {
	String country;
	String state;
	String city;
	int zip;

	public Address(String country, String state, String city, int zip) {
		this.country = country;
		this.state = state;
		this.city = city;
		this.zip = zip;
	}
}

class Employee {
	int id;
	String name;
	Address address;

	Employee(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void display() {
		System.out.println(id + " " + name);
		System.out.println(address.city + " " + address.state + " " + address.country);
	}
}

public class Aggregation {

	public static void main(String[] args) {

		Address address = new Address("India", "TN", "DPI", 635202);

		Employee employee = new Employee(1001, "Vel", address);

		employee.display();

	}
}
