package javatpoint.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableStatementExample {

	public static void main(String[] args) {

		try {
			Class.forName("org.postgresql.Driver");

			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
					"postgres");

			CallableStatement callState = conn.prepareCall("{ call get_producttitles(2017)}");
			boolean result = callState.execute();
			
			System.out.println("result===>>" + result);

		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
