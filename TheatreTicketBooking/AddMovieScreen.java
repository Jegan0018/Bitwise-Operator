package TheatreTicketBooking;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AddMovieScreen {
	static int cost;

	public void addMovieScreen(ArrayList<TicketBook> arrayList) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Movie Name");
			String movieName = scanner.nextLine();
			Pattern namePattern = Pattern.compile("[a-zA-Z\\s,]+");
			if (!namePattern.matcher(movieName).matches()) {
				System.err.println("***Invalid String***");
				break;
			}
			System.out.println("Enter Screen Id");
			int screenId = 0;
			try {
				screenId = scanner.nextInt();
			} catch (Exception e) {
				System.err.println("***Please Enter Valid Number***");
				break;
			}

			for (int i = 0; i < arrayList.size(); i++) {
				TicketBook ticketBook = (TicketBook) arrayList.get(i);
				if (screenId != ticketBook.screenId) {
					System.out.println("Enter Cost for Movie");
					try {
						cost = scanner.nextInt();
					} catch (Exception e) {
						System.err.println("***Please Enter Valid Cost***");
						break;
					}

					System.out.println("Enter Number of Tickets");
					int totalTickets = 0;
					try {
						totalTickets = scanner.nextInt();
					} catch (Exception e) {
						System.err.println("***Please Enter Valid Number***");
						break;
					}

					arrayList.add(new TicketBook(movieName, screenId, cost, totalTickets));
					System.out.println("Data Added Succesfully");
					break;
				} else {
					System.err.println("***Screen Id Already Exists***");
					break;
				}
			}
			break;
		}
	}
}
