package ContactApplication;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import Database.DatabaseConnection;

public class AddContact {
	public void addContact(ArrayList<ContactFields> arrayList) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			String contactNumber,name,mailId;
			boolean flag;
			do {
				System.out.println("Enter Contact Number(10 Digit Number)");
				contactNumber = scanner.nextLine();
				flag = contactNumberValidation(contactNumber);
				if(flag == false) {
					System.err.println("***Invalid Contact Number***");
				}
			} while(flag != true);

			do {
				System.out.println("Enter Name");
				name = scanner.nextLine();
				flag = nameValidation(name);
				if(flag == false) {
					System.err.println("***Invalid String***");
				}
			} while(flag != true);
			
			do {
				System.out.println("Enter Email");
				mailId = scanner.nextLine();
				flag = mailIdValidation(mailId);
				if(flag == false) {
					System.err.println("***Invalid Mail Id***");
				}
			} while(flag != true);
			arrayList.add(new ContactFields(contactNumber,name,mailId));
			try {
				DatabaseConnection.getInstance().connection = DatabaseConnection.getConnection();
				String sql = "insert into contactstable(contactNumber,name,mailId)values(?,?,?)";
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
	
	private boolean contactNumberValidation(String contactNumber) {
		Pattern contactPattern = Pattern.compile("^\\d{10}$");
		if (!contactPattern.matcher(contactNumber).matches()) {
			return false;
		}
		return true;
	}

	private boolean nameValidation(String name) {
		Pattern namePattern = Pattern.compile("[a-zA-Z\\s,]+");
		if (!namePattern.matcher(name).matches()) {
			return false;
		}
		return true;
	}

	private boolean mailIdValidation(String mailId) {
		Pattern mailIdPattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
		if (!mailIdPattern.matcher(mailId).matches()) {
			return false;
		}
		return true;
	}
}
