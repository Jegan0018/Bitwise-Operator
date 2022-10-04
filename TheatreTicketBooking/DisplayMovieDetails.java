package TheatreTicketBooking;

import java.util.ArrayList;

public class DisplayMovieDetails {
	public void displayMovieDetails(ArrayList<TicketBook> arrayList) {
		System.out.println("---------------------------------------------------");
		for (int i = 0; i < arrayList.size(); i++) {
			TicketBook ticketBook = (TicketBook) arrayList.get(i);
			System.out.println("Movie Name :" + ticketBook.movieName);
			System.out.println("Screen Id :" + ticketBook.screenId);
			System.out.println("Movie Cost :" + ticketBook.cost);
			System.out.println("Total Tickets :" + ticketBook.totalTickets);
			System.out.println("****************************");
		}
		System.out.println("---------------------------------------------------");
	}
}
