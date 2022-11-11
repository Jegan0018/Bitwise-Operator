package ContactApplication;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.util.regex.Pattern;

import Database.DatabaseConnection;

public class SearchContact {
	public void searchContact() {
		search();
	}

	private void search() {
		Scanner scanner = new Scanner(System.in);
		boolean flag;
		String name;
		try {
			do {
				System.out.println("Enter Name");
				name = scanner.nextLine();
				flag = nameValidation(name);
				if(flag == false) {
					System.err.println("***Invalid String***");
				}
			} while(flag != true);
			try {
				DatabaseConnection.getInstance().connection = DatabaseConnection.getConnection();
				String sql = "SELECT name,contactNumber,mailId  FROM contactstable";
				PreparedStatement statement = DatabaseConnection.getInstance().connection.prepareStatement(sql);
				ResultSet resultSet = statement.executeQuery();
				while (true) {
					if (resultSet.next()) {
						if(resultSet.getString("name").startsWith(name)) {
							System.out.println("-------------------------------------");
							System.out.println("Contact Name :"+resultSet.getString("name"));
							System.out.println("Contact Number :"+resultSet.getString("contactNumber"));
							System.out.println("Mail Id :"+resultSet.getString("mailId"));
							System.out.println("======================================");
						}
					} else {
						break;
					}
				}
				statement.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		} catch (Exception e) {
			System.err.println("***Please Enter Valid Number***");
			search();
		}
	}
	private boolean nameValidation(String name) {
		Pattern namePattern = Pattern.compile("[a-zA-Z\\s,]+");
		if (!namePattern.matcher(name).matches()) {
			return false;
		}
		return true;
	}
}
