package instance_variable.task_34;

import java.util.ArrayList;

public class UberApp {
    public String name;
    public int age;
    public String phoneNumber;
    public int remainingRides;
    public ArrayList<String> rideHistory;
    public String currentLocation;

    public UberApp() {
        this.remainingRides = 3; // Default remaining rides per month
        this.rideHistory = new ArrayList<>();
    }

    public void createProfile(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public void showProfile() {
        System.out.println("Hello! This is your Profile:");
        System.out.println("Full Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Phone Number: " + this.phoneNumber);
    }

    public int remainingRides() {
        return this.remainingRides;
    }

    public void bookRide(String destination, double fare) {
        if (this.remainingRides > 0) {
            System.out.println(this.name + " has booked a ride!");
            System.out.println("Destination: " + destination);
            System.out.println("Fare: " + fare + " Taka");
            this.currentLocation = destination;
            this.rideHistory.add(destination);
            this.remainingRides--;
        } else {
            System.out.println(this.name + ", please update your plan to premium or wait till next month!");
        }
    }

    public void changeLocation(String newDestination, double additionalFare) {
        if (this.remainingRides > 0) {
            System.out.println(this.name + " has changed the destination of his current ride to " + newDestination);
            double newFare = additionalFare * 1.20; // Adding 20% change fees
            System.out.println("New fare after adding 20% change fees: " + newFare + " Taka");
            this.currentLocation = newDestination;
            this.rideHistory.add(newDestination);
        } else {
            System.out.println(this.name + ", please update your plan to premium or wait till next month!");
        }
    }

    public void ridingHistory() {
        if (this.rideHistory.isEmpty()) {
            System.out.println(this.name + ", you haven't visited anywhere this month.");
        } else {
            System.out.print(this.name + ", you have visited ");
            for (String location : this.rideHistory) {
                System.out.print(location + ", ");
            }
            System.out.println("this month.");
        }
    }

    public void resetMonth() {
        this.remainingRides = 3;
        this.rideHistory.clear();
    }
}
