package fresh.serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
 
public class SerializationClass {
 
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.firstName = "Munirathinavel";
		emp.lastName = "Chinnasamy";
		emp.companyName = "ABC";
		emp.email ="vel@cool.com";
		//Below part needs to be removed in case address field is made final
		emp.address = "St Johns";
		emp.companyCEO = "XYZ";
 
		try {
			FileOutputStream fileOut = new FileOutputStream("./employee.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(emp);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in ./employee.txt file");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}