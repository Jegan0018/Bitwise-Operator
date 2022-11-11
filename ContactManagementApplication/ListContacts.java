package ContactApplication;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Database.DatabaseConnection;

public class ListContacts {
	public void listContacts(ArrayList<ContactFields> arrayList) {
		try {
			DatabaseConnection.getInstance().connection = DatabaseConnection.getConnection();
			String sql = "SELECT id,name,contactNumber,mailId FROM contactstable Order By name Asc";
			PreparedStatement statement = DatabaseConnection.getInstance().connection.prepareStatement(sql);
			ResultSet resultset = statement.executeQuery();
			if (arrayList.size() == 0) {
				while (resultset.next()) {
					arrayList.add(new ContactFields(resultset.getString("contactNumber"),resultset.getString("name"),resultset.getString("mailId")));
				}
			} else {
				arrayList.removeAll(arrayList);
				while (resultset.next()) {
					arrayList.add(new ContactFields(resultset.getString("contactNumber"),resultset.getString("name"),resultset.getString("mailId")));
				}
			}
			for(int index=0;index<arrayList.size();index++) {
				ContactFields object=arrayList.get(index);
				System.out.println("Contact Name :" + object.getName());
				System.out.println("Contact Number:" + object.getContactNumber());
				System.out.println("Mail Id :" + object.getMailId());
				System.out.println("-------------------------------------");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
