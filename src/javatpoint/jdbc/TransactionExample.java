package javatpoint.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionExample {

	public static void main(String[] args) {

		try {
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
					"postgres");
			conn.setAutoCommit(false);
			
			Statement s = conn.createStatement();
		
			s.execute("insert into public.emp5(id, name, age) values (2001, 'vel', 123)");
			s.execute("insert into public.emp5(id, name, age) values (2002, 'vel', 123)");
			
			conn.commit();
			conn.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		} 
	}
}
