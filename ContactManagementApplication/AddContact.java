package ContactApplication;

import java.sql.PreparedStatement;
import java.util.Scanner;
import java.util.regex.Pattern;
import Database.DatabaseConnection;

public class AddContact {
	public void addContact() {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Contact Number");
			String contactNumber = scanner.nextLine();
			Pattern contactPattern = Pattern.compile("^\\d{10}$");
			if (!contactPattern.matcher(contactNumber).matches()) {
				System.err.println("***Invalid Contact Number***");
				break;
			}
			System.out.println("Enter Name");
			String name = scanner.nextLine();
			Pattern pattern = Pattern.compile("[a-zA-Z\\s,]+");
			if (!pattern.matcher(name).matches()) {
				System.err.println("***Invalid String***");
				break;
			}
			System.out.println("Enter Email");
			String mailId = scanner.nextLine();
			Pattern mailIdpattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
			if (!mailIdpattern.matcher(mailId).matches()) {
				System.err.println("***Invalid Mail Id***");
				break;
			}
			try {
				DatabaseConnection.getInstance().connection = DatabaseConnection.getConnection();
				String sql = "insert into contacttable(contactNumber,name,mailId)values(?,?,?)";
				PreparedStatement statement = DatabaseConnection.getInstance().connection.prepareStatement(sql);
				statement.setString(1, contactNumber);
				statement.setString(2, name);
				statement.setString(3, mailId);
				statement.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}
	}
}
