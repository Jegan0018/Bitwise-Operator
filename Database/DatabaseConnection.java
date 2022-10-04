package Database;

import java.sql.Connection;

public class DatabaseConnection {
	private static DatabaseConnection databaseConnection;
	public static Connection connection;

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/zohoassignment", "root", "");
		} catch (Exception e1) {
			System.out.println(e1);
		}
		return connection;
	}

	private DatabaseConnection() {
	}

	public static DatabaseConnection getInstance() {
		if (databaseConnection == null) {
			databaseConnection = new DatabaseConnection();
		}
		return databaseConnection;
	}
}
