package ContactApplication;

import java.sql.PreparedStatement;
import java.util.Scanner;
import Database.DatabaseConnection;

public class DeleteContact {
	public void deleteContact() {
		delete();
	}

	private void delete() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the Id you want to Delete");
		int id = 0;
		try {
			id = scanner.nextInt();
		} catch (Exception e) {
			System.err.println("***Please Enter Valid Number***");
			delete();
		}

		try {
			DatabaseConnection.getInstance().connection = DatabaseConnection.getConnection();
			String sql = "delete from contacttable where id = '"+id+"'";
			PreparedStatement statement = DatabaseConnection.getInstance().connection.prepareStatement(sql);
			statement.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
