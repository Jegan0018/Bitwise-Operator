package EmployeeTask;

import java.util.Scanner;

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
		try {
			do {
				menu();
				System.out.println("Please Enter The Option : ");
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
				case 5:
					System.out.println("Exitted Succesfully");
					break;
				default:
					System.err.println("***Please Enter Valid Number***");
				}
			} while (input != 5);
		} catch (Exception e) {
			System.err.println("***Please Enter Valid Number***");
			displayInfo();
		}
	}
}
