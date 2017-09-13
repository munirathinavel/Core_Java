\
package javatpoint.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectToPostgesDB {

	public static void main(String[] args) {

		try {
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
					"postgres");
			Statement statement = conn.createStatement();

			// createStatement(statement);

			// insertStatement(statement);

			// selectStatement(statement);

			// createPrepatedStatement(conn);

			insertPrepatedStatement(conn);

			storeImage(conn);

			statement.close();
			conn.close();
		} catch (ClassNotFoundException | SQLException | IOException e) {
			e.printStackTrace();
		}
	}

	private static void storeImage(Connection conn) throws SQLException, IOException {

		PreparedStatement ps = conn.prepareStatement("create table public.IMGTABLE(NAME character(4000),PHOTO bytea)");

		System.out.println("Creating Table");
		boolean result1 = ps.execute();
		System.out.println("Table Created with name Emp is" + result1);

		// Insert an image

		PreparedStatement ps1 = conn.prepareCall("insert into public.imgtable values(?,?)");

		ps1.setString(1, "My Picture");

		//ByteArrayInputStream fileInputStream = new ByteArrayInputStream("D:\\My Docz\\DSC_0649.jpg");
		//ps1.setBytes(2, fileInputStream.);

	//	int i = ps1.executeUpdate();

		//System.out.println("Record Affected" + i);
	}

	private static void createPrepatedStatement(Connection conn) throws SQLException {
		PreparedStatement ps = conn
				.prepareStatement("create table public.emp6(id integer ,name character(40),age integer)");

		System.out.println("Creating Table");
		boolean result1 = ps.execute();
		System.out.println("Table Created with name Emp is" + result1);
	}

	private static void insertPrepatedStatement(Connection conn) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("insert into public.emp6(id, name, age) values (?, ?, ?)");

		System.out.println("Inserting into Table");
		ps.setInt(1, 201);
		ps.setString(2, "Ram");
		ps.setInt(3, 86);

		boolean result1 = ps.execute();
		System.out.println("Data inserted with current total count is: " + selectPreparedStatement(conn));
	}

	private static int selectPreparedStatement(Connection conn) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("select count(*) from public.emp6");

		System.out.println("Count from Table Emp6");

		ResultSet result1 = ps.executeQuery();
		int count = 0;
		ResultSetMetaData metaData = result1.getMetaData();
		System.out.println("metaData.getColumnCount()=" + metaData.getColumnCount());
		DatabaseMetaData dbMetaData = conn.getMetaData();
		System.out.println("dbMetaData.getURL()==>>" + dbMetaData.getURL());

		while (result1.next()) {
			count = result1.getInt(1);
			System.out.println("Count of Customer table is " + count);

		}
		System.out.println("Data inserted with current total count is: " + result1);
		return count;
	}

	// Statement..

	private static void selectStatement(Statement statement) throws SQLException {
		System.out.println("Reading Count into Table Emp");
		ResultSet resultSet = statement.executeQuery("select count(*) from public.emp5");
		while (resultSet.next()) {
			System.out.println("Count of Customer table is " + resultSet.getString(1));
		}
	}

	private static void insertStatement(Statement statement) throws SQLException {
		System.out.println("Inserting Values into Table Emp");
		boolean result = statement.execute("insert into public.emp5(id, name, age) values (1001, 'vel', 123)");
		System.out.println("Table Created with name Emp is" + result);
	}

	private static void createStatement(Statement statement) throws SQLException {
		System.out.println("Creating Table");
		boolean result1 = statement.execute("create table public.emp5(id integer ,name character(40),age integer)");
		System.out.println("Table Created with name Emp is" + result1);
	}

}
