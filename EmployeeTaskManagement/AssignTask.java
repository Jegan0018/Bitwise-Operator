package EmployeeTask;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.util.regex.Pattern;

import Database.DatabaseConnection;

public class AssignTask {
	public void assignTask() {
		while (true) {
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
			System.out.println("Enter Employee Task Issue Date");
			String issueTaskDate = scanner.nextLine();
			Pattern issueTaskDatePattern = Pattern.compile("^\\d{2}-\\d{2}-\\d{4}$");
			if (!issueTaskDatePattern.matcher(issueTaskDate).matches()) {
				System.out.println("Invalid Date Format");
				break;
			}
			System.out.println("Enter Employee Task Due Date");
			String dueTaskDate = scanner.nextLine();
			Pattern dueTaskDatePattern = Pattern.compile("^\\d{2}-\\d{2}-\\d{4}$");
			if (!dueTaskDatePattern.matcher(dueTaskDate).matches()) {
				System.out.println("***Invalid Date Format***");
				break;
			}
			try {
				Connection connection = DatabaseConnection.getConnection();
				String sql = "Update emptasktable set taskName=?,issueTaskDate=?,dueTaskDate=?,status=0 where empId='" + id + "' ";
				PreparedStatement statement = connection.prepareStatement(sql);
				statement.setString(1, taskName);
				statement.setString(2, issueTaskDate);
				statement.setString(3, dueTaskDate);
				statement.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		}
	}
}
