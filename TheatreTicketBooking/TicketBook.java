package TheatreTicketBooking;

public class TicketBook {
	String movieName;
	int screenId;
	int cost, totalTickets;

	public TicketBook(String movieName, int screenId, int cost, int totalTickets) {
		this.movieName = movieName;
		this.screenId = screenId;
		this.cost = cost;
		this.totalTickets = totalTickets;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getScreenId() {
		return screenId;
	}

	public void setScreenName(int screenId) {
		this.screenId = screenId;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getTotalTickets() {
		return totalTickets;
	}

	public void setTotalTickets(int totalTickets) {
		this.totalTickets = totalTickets;
	}

}
