package EmployeeTask;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.util.regex.Pattern;

import Database.DatabaseConnection;

public class RemoveTask {
	public void removeTask() {
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Employee Id");
			int id = 0;
			try {
				id = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("***Please Enter Valid Number***");
				break;
			}
			scanner.nextLine();
			System.out.println("Enter Task Name");
			String taskName = scanner.nextLine();
			Pattern taskPattern = Pattern.compile("[a-zA-Z\\s,]+");
			if (!taskPattern.matcher(taskName).matches()) {
				System.out.println("***Invalid String***");
				break;
			}
			try {
				Connection connection = DatabaseConnection.getConnection();
				String sql = "Update emptasktable set status = 1 where empId='" + id + "' AND status = 0";
				PreparedStatement statement = connection.prepareStatement(sql);
				statement.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}
	}
}
