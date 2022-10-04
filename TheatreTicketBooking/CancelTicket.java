package TheatreTicketBooking;

import java.util.ArrayList;
import java.util.Scanner;

public class CancelTicket {
	static int cost;

	public void cancelTicket(ArrayList<TicketBook> arrayList) {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Screen Id");
			int screenId = 0;
			try {
				screenId = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("***Please Enter Valid Number***");
				break;
			}
			System.out.println("Enter Number of Tickets");
			int ticketCount = 0;
			try {
				ticketCount = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("***Please Enter Valid Number***");
				break;
			}
			for (int i = 0; i < arrayList.size(); i++) {
				TicketBook ticket = arrayList.get(i);
				if (screenId == ticket.screenId) {
					cost = (ticket.cost * ticketCount);
					arrayList.get(i).totalTickets = arrayList.get(i).totalTickets + ticketCount;
					if (arrayList.get(i).totalTickets >= 0) {
						System.out.println("Tickets Available" + arrayList.get(i).totalTickets);
						System.out.println("Sorry,Refund is not Available");
					} else {
						System.out.println("No Tickets Available");
					}

				}
			}
			break;
		}

	}
}
