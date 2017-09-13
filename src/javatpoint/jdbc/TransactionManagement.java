package javatpoint.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionManagement {
	public static void main(String[] args) {

		try {
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
					"postgres");
			PreparedStatement preparedStatement = conn.prepareStatement("insert into public.emp5(id, name, age) values(?,?,?)");

			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter values to insert.. Press commit to commit the all records... (Input Order: Id, Name, Age)");
			while (true) {
				System.out.println("Enter Id:");
				int id = Integer.parseInt(bufferedReader.readLine());
				System.out.println("Enter Name:");
				String name = bufferedReader.readLine();
				System.out.println("Enter Age:");
				int age = Integer.parseInt(bufferedReader.readLine());
				
				conn.setAutoCommit(false);
				preparedStatement.setInt(1, id);
				preparedStatement.setString(2, name);
				preparedStatement.setInt(3, age);
				
				preparedStatement.execute();
				
				System.out.println("Do you want to commit or rollback?");
				String commitStr = bufferedReader.readLine();
				
				if("commit".equalsIgnoreCase(commitStr)) {
					conn.commit();
					System.out.println("Transaction committed Successfully..");
				} else if("rollback".equalsIgnoreCase(commitStr)) {
					conn.rollback();
					System.out.println("Transaction rolledback Successfully..");
				}
				
				System.out.println("Do you want to continue? (y/n)");
				String input = bufferedReader.readLine();
				if("n".equalsIgnoreCase(input)){
					break;
				}
			}
			conn.commit();
			conn.close();
			System.out.println("Operation Completed..");
		} catch (ClassNotFoundException | SQLException | IOException e) {
			System.out.println(e);
		}

	}
}
