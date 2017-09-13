package javatpoint.oops.inheritance;

// Parent / Super Class
class Employee {
	float salary = 60000;
}

// Child / Sub class
class Programmer extends Employee {
	int bonus = 15000;

	public static void main(String args[]) {
		Programmer gomathi = new Programmer();
		System.out.println("Programmer salary is:" + gomathi.salary);
		System.out.println("Bonus of Programmer is:" + gomathi.bonus);
	}
}