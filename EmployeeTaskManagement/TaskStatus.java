package EmployeeTask;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Database.DatabaseConnection;

public class TaskStatus {
	public void taskStatus() {
		try {
			String status, task;
			DatabaseConnection.getInstance().connection = DatabaseConnection.getConnection();
			String sql = "SELECT empId,empName,taskName,issueTaskDate,dueTaskDate,status FROM emptasktable ";
			PreparedStatement statement = DatabaseConnection.getInstance().connection.prepareStatement(sql);
			ResultSet resultset = statement.executeQuery();
			while (resultset.next()) {
				if (resultset.getInt("status") == 0) {
					status = "Task In Progress";
				} else {
					status = "Task Completed";
				}
				if (resultset.getString("taskName").equals("")) {
					task = "Task is Not Assigned Yet";
					System.out.println("Employee Id :" + resultset.getString("empId"));
					System.out.println("Employee Name :" + resultset.getString("empName"));
					System.out.println("Task Name :" + task);
					System.out.println("Issue Task Date :" + task);
					System.out.println("Due Task Date :" + task);
					System.out.println("Status :" + status);
				} else {
					System.out.println("Employee Id :" + resultset.getString("empId"));
					System.out.println("Employee Name :" + resultset.getString("empName"));
					System.out.println("Task Name :" + resultset.getString("taskName"));
					System.out.println("Issue Task Date :" + resultset.getString("issueTaskDate"));
					System.out.println("Due Task Date :" + resultset.getString("dueTaskDate"));
					System.out.println("Status :" + status);
				}
				System.out.println("-------------------------------------");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
