package task12;

public class GamingLaptop extends Laptop {
    public void start() {
        System.out.println("GamingLaptop powering on");
        super.start();
    }
    public void notifyUser() {
        System.out.println("GamingLaptop notification alert");
    }
}
