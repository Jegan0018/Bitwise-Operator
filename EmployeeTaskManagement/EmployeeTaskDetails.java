package EmployeeTask;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.util.regex.Pattern;
import Database.DatabaseConnection;

public class EmployeeTaskDetails {
	public static void main(String[] args) {
		EmployeeTaskDetails details = new EmployeeTaskDetails();
		details.displayInfo();
	}

	public void menu() {
		System.out.println("------------Employee Task Management-------------");
		System.out.println("Press 1 to Register Employee");
		System.out.println("Press 2 to Task Status of Employees");
		System.out.println("Press 3 to Assign Task to Employee");
		System.out.println("Press 4 to Remove Task to Employee");
		System.out.println("Press 5 to Exit");
	}

	private void displayInfo() {
		Scanner scanner = new Scanner(System.in);
		int input;
		do {
			menu();
			input = scanner.nextInt();
			switch (input) {
			case 1:
				new EmployeeRegister().employeeRegister();
				break;
			case 2:
				new TaskStatus().taskStatus();
				break;
			case 3:
				new AssignTask().assignTask();
				break;
			case 4:
				new RemoveTask().removeTask();
				break;
			default:
				System.out.println("***Please Enter Valid Number***");
			}
		} while (input != 5);

	}
}
