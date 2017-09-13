package fresh.serialize;

import java.io.Serializable;

public class SerializeObject {

	public static void main(String[] args) {

		EmployeeObject emp1 = new EmployeeObject(1001, "Vel");

		EmployeeObject emp2 = emp1;
		System.out.println("emp1 == emp2:" + (emp1 == emp2));
		System.out.println("emp1.equals(emp2)" + (emp1.equals(emp2)));

		String s1 = new String("Cool");
		String s2 = s1;
		String s3 = "Cool";
		String s4 = s3.intern();
		String s5 = s1.intern();

		System.out.println(s1 == s2); // true
		System.out.println(s1 == s3); // false
		System.out.println(s3 == s4); // true
		System.out.println(s4 == s4); // true
		System.out.println(s1 == s5); // false
	}

}

