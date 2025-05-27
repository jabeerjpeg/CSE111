package task14_Cinemex;

public class CinemexTicket extends MovieTicket {

    private static int totalTickets = 0;
    private String genre;
    private String status = "Not P" +
            "aid";
    public static int count;




    public CinemexTicket(String movie,
                         String showtime,
                         String genre, String date) {
        super(movie, date, showtime, 0.0);
        totalTickets++;
        this.genre = genre;
        super.seat = seatTypes[count];
        super.setPrice(seatPrices[count]);
        count++;
    }

    public CinemexTicket(String movie,
                         String showtime,
                         String genre,
                         String date,
                         String seat)
    {


        this(movie,showtime,genre,date);
        super.seat = seat;
    }


    public void calculateTicketPrice()
    {
        String[] arr1 = super.showtime.split(":");

        int x = Integer.parseInt(arr1[0]);

        if (x >= 18 && x <= 23)
        {
            double y = (15.0 / 100) *
                    super.getPrice();
            super.setPrice(super.getPrice() + y);


        }

        System.out.println("Ticket" +
                " price is calcula" +
                "ted successful" +
                "ly.") ;
    }

    private String generateTicketID()
    {
        return super.getMovie() + "-" + super.seat.charAt(0) + "-" + totalTickets;
    }

    public String confirmPayment() {
        if (status.equals("P" +
                "aid")) {
            return "Ticket pri" +
                    "ce is already paid!";
        }
        status = "Paid";
        return "Payment S" +
                "uccessful.";
    }

    public static int getTotalTickets()
    {
        return totalTickets;
    }


    public String toString() {
        return "Tick" +
                "et ID: " + generateTicketID() +
                "\n" + super.toString() + "\nGe" +
                "nre: "
                + genre +
                "\nSeat Type: " + super.seat + "\nPrice(tk): " + super.getPrice() +
                "\nStatu" +
                "s: " + status;
    }
}


