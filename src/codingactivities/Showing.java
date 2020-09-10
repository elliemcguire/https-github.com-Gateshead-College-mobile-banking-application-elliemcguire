package codingactivities;

public class Showing {
    public String film;
    public int screen;
    public int seat;
    public int numberOfTickets;
    public boolean vip;

    public Showing(String film, int screen, int seat, int numberOfTickets, boolean vip) {
        this.film = film;
        this.screen = screen;
        this.seat = seat;
        this.numberOfTickets = numberOfTickets;
        this.vip = vip;
    }
}
