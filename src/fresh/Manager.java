package fresh;

public class Manager {

	public static void main(String[] args) {
		
		Employee employee = new Employee(9,new StringBuffer("Gomathi"));
		System.out.println(employee.getId());
		System.out.println(employee.getBuffer());
	}
}
