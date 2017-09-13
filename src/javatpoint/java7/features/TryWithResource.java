package javatpoint.java7.features;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TryWithResource {

	public static void main(String[] args) {

		try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
				"postgres"); Statement s = conn.createStatement();) {
			Class.forName("org.postgresql.Driver");
			conn.setAutoCommit(false);

			s.execute("insert into public.emp5(id, name, age) values (2001, 'vel', 123)");
			s.execute("insert into public.emp5(id, name, age) values (2002, 'vel', 123)");

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}

		System.out.println("Resources closed succesfully..");
	}
}
