package TheatreTicketBooking;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BookTicket {
	static int cost;

	public void bookTicket(ArrayList<TicketBook> arrayList) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Screen Id");
			int screenId = 0;
			try {
				screenId = scanner.nextInt();
			} catch (Exception e) {
				System.err.println("***Please Enter Valid Number***");
				break;
			}
			scanner.nextLine();
			System.out.println("Enter Movie Name");
			String movieName = scanner.nextLine();
			Pattern namePattern2 = Pattern.compile("[a-zA-Z\\s,]+");
			if (!namePattern2.matcher(movieName).matches()) {
				System.err.println("***Invalid String***");
				break;
			}
			System.out.println("---------------------------------------------------");
			for (int i = 0; i < arrayList.size(); i++) {
				TicketBook ticketBook = arrayList.get(i);
				if (screenId == ticketBook.screenId) {
					System.out.println("Movie Name :" + ticketBook.movieName);
					System.out.println("Screen Id :" + ticketBook.screenId);
					System.out.println("Movie Cost :" + ticketBook.cost);
					System.out.println("Total Tickets Available :" + ticketBook.totalTickets);
					System.out.println("**********************");
				}
			}
			System.out.println("---------------------------------------------------");
			System.out.println("Press 1 to Book Tickets and 2 to Exit");
			try {
				int userInput = scanner.nextInt();
				switch (userInput) {
				case 1:
					System.out.println("Enter Number of Tickets");
					int ticketCount = scanner.nextInt();
					for (int i = 0; i < arrayList.size(); i++) {
						TicketBook ticket = arrayList.get(i);
						if (screenId == ticket.screenId) {
							cost = ticket.cost * ticketCount;
							arrayList.get(i).totalTickets = arrayList.get(i).totalTickets - ticketCount;
							if (arrayList.get(i).totalTickets >= 0) {
								System.out.println("Tickets Available :" + arrayList.get(i).totalTickets);
								System.out.println("Cost " + cost);
							} else {
								arrayList.get(i).totalTickets = 0;
								System.out.println("Sorry,House Full...No Tickets Available");
							}

						}

					}
					break;
				}
			} catch (Exception e) {
				System.err.println("***Please Enter Valid Number***");
			}
			break;
		}

	}
}
