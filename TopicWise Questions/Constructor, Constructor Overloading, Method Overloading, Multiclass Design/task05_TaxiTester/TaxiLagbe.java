package task05_TaxiTester;

public class TaxiLagbe {
    public String name;
    public String location;
    public int pass;
    public String[] arr1 = new String[4];
    public int fare;
    public int count;

    public void storeInfo(String x, String y) {
        this.name = x;
        this.location = y;
    }

    public void addPassenger(String x, int y) {
        if (count < 4) {
            this.fare += y;
            this.arr1[count] = x;
            this.count++;
            this.pass++;
            System.out.println("Dear " + x + "! Welcome to TaxiLagbe");
        } else {
            System.out.println("Taxi Full! No more passengers can be added");
        }
    }

    public void addPassenger(String x, int y, String z, int f) {
        if (count < 4) {
            this.fare += y;
            this.arr1[count] = x;
            this.count++;
            this.pass++;
            System.out.println("Dear " + x + "! Welcome to TaxiLagbe");
        } else {
            System.out.println("Taxi Full! No more passengers can be added");
        }
        if (count < 4) {
            this.fare += f;
            this.arr1[count] = z;
            this.count++;
            this.pass++;
            System.out.println("Dear " + z + "! Welcome to TaxiLagbe");
        } else {
            System.out.println("Taxi Full! No more passengers can be added");
        }
    }

    public void printDetails() {
        System.out.println("Taxi number: " + this.name);
        System.out.println("This taxi can cover " + this.location + " area");
        System.out.println("Total Passengers: " + this.pass);
        System.out.println("Passenger Lists:");
        if (this.pass > 0) {
            for (int i = 0; i < count; i++) {
                System.out.print(this.arr1[i] + " ");
            }
            System.out.println();
        }
        System.out.println("Total collected fare: " + this.fare +" Taka");
    }
}
