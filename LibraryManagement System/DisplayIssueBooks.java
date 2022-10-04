package LibrarayManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class DisplayIssueBooks {
	public void displayIssueBooks(ArrayList<Books> arrayList,int bookId) {
		while(true) {
			System.out.println("----------------------------------------------");
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Book Id");
			try {
				bookId = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("Enter Proper Book Id");
				break;
			}
			
			for (int i = 0; i < arrayList.size(); i++) {
				Books list = (Books) arrayList.get(i);
				if (bookId == list.bookId && !(list.issueDate.equals(""))) {
					System.out.println("Book Id :" + list.bookId);
					System.out.println("Book Name :" + list.bookName);
					System.out.println("Issued Book Date :" + list.issueDate);
					System.out.println("Return Book Date :" + list.returnDate);
					System.out.println("******************");
				}
			}
			System.out.println("----------------------------------------------");
			break;
		}
	}
}
