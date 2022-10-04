package TheatreTicketBooking;

import java.util.ArrayList;
import java.util.Scanner;

public class TheatreBook {
	static boolean status = true;
	static int cost;
	static ArrayList<TicketBook> arrayList = new ArrayList<TicketBook>();
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		arrayList.add(new TicketBook("Don", 1, 200, 2));
		TheatreBook theatrebook = new TheatreBook();
		theatrebook.displayDetails();
	}

	public void menu() {
		System.out.println("Admin Ticket Booking");
		System.out.println("Press 1 to Add a Movie And Screen");
		System.out.println("Press 2 to Display the Movie Details");
		System.out.println("Press 3 to Update the Movie ");
		System.out.println("Press 4 to Book a Ticket");
		System.out.println("Press 5 to Cancel the Movie Tickets");
		System.out.println("Press 6 to Exit");
	}

	public void displayDetails() {
		Scanner scanner = new Scanner(System.in);
		int input;
		try {
			do {
				menu();
				System.out.println("Please Enter Any Of The  Option");
				input = scanner.nextInt();
				switch (input) {
				case 1:
					new AddMovieScreen().addMovieScreen(arrayList);
					break;
				case 2:
					new DisplayMovieDetails().displayMovieDetails(arrayList);
					break;
				case 3:
					new UpdateMovie().updateMovie(arrayList);
					break;
				case 4:
					new BookTicket().bookTicket(arrayList);
					break;
				case 5:
					new CancelTicket().cancelTicket(arrayList);
					break;
				default:
					System.out.println("***Please Enter Valid Number***");
				}
			} while (input != 6);
		} catch (Exception e) {
			System.out.println("***Please Enter Valid Number***");
			displayDetails();
		}
	}
}
