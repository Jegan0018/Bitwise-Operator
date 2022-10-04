package EmployeeTask;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.util.regex.Pattern;

import Database.DatabaseConnection;

public class EmployeeRegister {
	public void employeeRegister() {
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Employee Name");
			String empName = scanner.nextLine();
			Pattern namePattern = Pattern.compile("[a-zA-Z\\s,]+");
			if (!namePattern.matcher(empName).matches()) {
				System.out.println("***Invalid String***");
				break;
			}
			System.out.println("Enter Employee Date Of Birth");
			String dateOfBirth = scanner.nextLine();
			Pattern dateOfBirthPattern = Pattern.compile("^\\d{2}-\\d{2}-\\d{4}$");
			if (!dateOfBirthPattern.matcher(dateOfBirth).matches()) {
				System.out.println("Invalid Date Format");
				break;
			}
			System.out.println("Enter Employee Contact Number");
			String contactNumber = scanner.nextLine();
			Pattern contactPattern = Pattern.compile("^\\d{10}$");
			if (!contactPattern.matcher(contactNumber).matches()) {
				System.out.println("***Invalid Contact Number***");
				break;
			}

			try {
				DatabaseConnection.getInstance().connection = DatabaseConnection.getConnection();

				String sql = "insert into emptasktable(empName,dateOfBirth,contactNumber)values(?,?,?)";
				PreparedStatement statement = DatabaseConnection.getInstance().connection.prepareStatement(sql);
				statement.setString(1, empName);
				statement.setString(2, dateOfBirth);
				statement.setString(3, contactNumber);
				statement.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}	
	}
}
