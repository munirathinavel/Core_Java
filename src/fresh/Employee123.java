package fresh;

public class Employee123 {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(12, new StringBuffer("454"));
		Employee emp2 = emp1;
		if(emp1 == emp2) {
			System.out.println("true");
		}
				if(emp1.equals(emp2)) {
					System.out.println("true");
				}
	}

}
