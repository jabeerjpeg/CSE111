package task13_TravelTester;

public class Travel {

    private static int count;
    private String source;
    private String destination;
    private int time;


    public Travel(String source, String destination) {
        this.source = source;
        this.destination = destination;
        count++;
    }


    public static int getCount(){
        return count;
    }

    public String displayTravelInfo(){
        return "Source: " + this.source + "\nDestination: " + this.destination + "\nTime: " + this.time +":00";
    }

    public void setTime(int time) {
        this.time = time;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }

}
