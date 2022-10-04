package ContactApplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Database.DatabaseConnection;

public class ListContacts {
	public void listContacts() {
		list();
	}

	private void list() {
		try {
			DatabaseConnection.getInstance().connection = DatabaseConnection.getConnection();
			String sql = "SELECT id,name,contactNumber,mailId FROM contacttable Order By name Asc";
			PreparedStatement statement = DatabaseConnection.getInstance().connection.prepareStatement(sql);
			ResultSet resultset = statement.executeQuery();
			while (resultset.next()) {
				System.out.println("Contact Name :" + resultset.getString("name"));
				System.out.println("Contact Id :" + resultset.getString("id"));
				System.out.println("Contact Number:" + resultset.getString("contactNumber"));
				System.out.println("Mail Id :" + resultset.getString("mailId"));
				System.out.println("-------------------------------------");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
