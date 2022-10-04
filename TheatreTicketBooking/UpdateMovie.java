package TheatreTicketBooking;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UpdateMovie {
	public void updateMovie(ArrayList<TicketBook> arrayList) {
		while(true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Movie Name to Update");
			String movieName = scanner.nextLine();
			Pattern namePattern1 = Pattern.compile("[a-zA-Z\\s,]+");
			if (!namePattern1.matcher(movieName).matches()) {
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
				TicketBook ticket = arrayList.get(i);
				if (screenId == ticket.screenId) {
					arrayList.get(i).movieName = movieName;
				}
			}
			break;
		}
	}
}
