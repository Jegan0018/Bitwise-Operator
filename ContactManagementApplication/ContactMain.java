package ContactApplication;

import java.util.Scanner;

public class ContactMain {
	public static void main(String[] args) {
		ContactMain contact = new ContactMain();
		contact.displayInfo();
	}

	private void menu() {
		System.out.println("------------Contact Application------------");
		System.out.println("Press 1 to Add a New Contact");
		System.out.println("Press 2 to List all Contacts");
		System.out.println("Press 3 to Edit a Contact");
		System.out.println("Press 4 to Delete a Contact");
		System.out.println("Press 5 to Search a Contact");
		System.out.println("Press 6 to Exit");
	}

	public void displayInfo() {
		Scanner scanner = new Scanner(System.in);
		int input;
		try {
			do {
				menu();
				input = scanner.nextInt();
				switch (input) {
				case 1:
					new AddContact().addContact();
					break;
				case 2:
					new ListContacts().listContacts();
					break;
				case 3:
					new EditContact().editContact();
					break;
				case 4:
					new DeleteContact().deleteContact();
					break;
				case 5:
					new SearchContact().searchContact();
					break;
				default:
					System.out.println("***Please Enter Valid Number***");
				}
			} while (input != 6);
		} catch (Exception e) {
			System.err.println("***Please Enter Valid Number***");
		}
	}
}
