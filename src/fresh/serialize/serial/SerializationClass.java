package fresh.serialize.serial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationClass {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.lastName = "Chinnasamy";

		try {
			FileOutputStream fileOut = new FileOutputStream("./employeeFinal.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(emp);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in ./employeeFinal.txt file");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}