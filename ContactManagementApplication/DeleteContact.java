package ContactApplication;

import java.sql.PreparedStatement;
import java.util.Scanner;
import java.util.regex.Pattern;

import Database.DatabaseConnection;

public class DeleteContact {
	public void deleteContact() {
		delete();
	}

	private void delete() {
		Scanner scanner = new Scanner(System.in);
		String name;
		boolean flag;
		do {
			System.out.println("Enter Existing Name");
			name = scanner.nextLine();
			flag = nameValidation(name);
			if(flag == false) {
				System.err.println("***Invalid String***");
			}
		} while(flag != true);

		try {
			DatabaseConnection.getInstance().connection = DatabaseConnection.getConnection();
			String sql = "delete from contactstable where name = '"+name+"'";
			PreparedStatement statement = DatabaseConnection.getInstance().connection.prepareStatement(sql);
			statement.executeUpdate();
			System.out.println("Deleted Successfully");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private boolean nameValidation(String name) {
		Pattern namePattern = Pattern.compile("[a-zA-Z\\s,]+");
		if(!namePattern.matcher(name).matches()) {
			return false;
		}
		return true;
	}
}
