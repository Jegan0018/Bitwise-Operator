package ContactApplication;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import Database.DatabaseConnection;

public class SearchContact {
	public void searchContact() {
		search();
	}

	private void search() {
		Scanner scanner = new Scanner(System.in);
		try {
			DatabaseConnection.getInstance().connection = DatabaseConnection.getConnection();
			String sql = "SELECT id,name FROM contacttable Order By name Asc";
			PreparedStatement statement = DatabaseConnection.getInstance().connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			System.out.println("Id \t"+" : "+"\tName");
			System.out.println("----------------------------");
			while (resultSet.next()) {
				System.out.println(resultSet.getString("id")+"\t : \t"+resultSet.getString("name"));
				System.out.println("----------------------------");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Press 1 to See Contact Details and 2 to Main Menu");
		try {
			int userInput = scanner.nextInt();
			switch (userInput) {
			case 1:
				System.out.println("Please Enter the Id you want to Search");
				int id = 0;
				try {
					id = scanner.nextInt();
				} catch (Exception e) {
					System.err.println("***Please Enter Valid Number***");
					search();
				}
				try {
					DatabaseConnection.getInstance().connection = DatabaseConnection.getConnection();
					String sql = "SELECT name,contactNumber,mailId  FROM contacttable where id='" + id + "'";
					PreparedStatement statement = DatabaseConnection.getInstance().connection.prepareStatement(sql);
					ResultSet resultSet = statement.executeQuery();
					while (true) {
						if (resultSet.next()) {
							System.out.println("-------------------------------------");
							System.out.println(resultSet.getString("name"));
							System.out.println(resultSet.getString("contactNumber"));
							System.out.println(resultSet.getString("mailId"));
							System.out.println("======================================");
							break;
						}
					}
					statement.close();
				} catch (Exception e) {
					System.out.println(e);
				}
				break;
			case 2:
				break;
			}
		} catch (Exception e) {
			System.err.println("***Please Enter Valid Number***");
			search();
		}
	}
}
