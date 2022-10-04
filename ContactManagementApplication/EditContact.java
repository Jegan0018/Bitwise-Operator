package ContactApplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.util.regex.Pattern;
import Database.DatabaseConnection;

public class EditContact {
	public void editContact() {
		edit();
	}

	private void edit() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the Id you want to Update");
		int id = 0;
		try {
			id = scanner.nextInt();
		} catch (Exception e) {
			System.err.println("***Enter Proper Id***");
			edit();
		}
		scanner.nextLine();
		System.out.println("Please Enter the Name");
		String name = scanner.nextLine();
		Pattern pattern1 = Pattern.compile("[a-zA-Z\\s,]+");
		if (!pattern1.matcher(name).matches()) {
			System.err.println("***Invalid String***");
			edit();
		}
		System.out.println("Enter Contact Number");
		String contactNumber = scanner.nextLine();
		Pattern contactPattern1 = Pattern.compile("^\\d{10}$");
		if (!contactPattern1.matcher(contactNumber).matches()) {
			System.err.println("***Invalid Contact Number***");
			edit();
		}
		System.out.println("Enter Email");
		String mailId = scanner.nextLine();
		Pattern mailIdpattern1 = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
		if (!mailIdpattern1.matcher(mailId).matches()) {
			System.err.println("***Invalid Mail Id***");
			edit();
		}
		try {
			DatabaseConnection.getInstance().connection = DatabaseConnection.getConnection();
			String sql = "Update contacttable set contactNumber=?,name=?,mailId=? where id='" + id + "' ";
			PreparedStatement statement = DatabaseConnection.getInstance().connection.prepareStatement(sql);
			statement.setString(1, contactNumber);
			statement.setString(2, name);
			statement.setString(3, mailId);
			statement.executeUpdate();
		} catch (Exception e1) {
			System.out.println(e1);
		}
	}
}
