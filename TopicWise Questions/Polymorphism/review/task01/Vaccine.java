package task01;

public class Vaccine {
    private String name;
    private String country;
    private int days;

    public Vaccine(String name, String c , int d) {
        this.name = name;
        this.country = c;
        this.days = d;
    }

    public String getName() {
        return name;
    }
    public String getCountry() {
        return country;
    }
    public int getDays() {
        return days;
    }
}
