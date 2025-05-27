package task06;

public class Garage
{
    public Car[] cars;
    public Bike[] bikes;
    public int cidx;
    public int bidx;


    public Garage(int c, int b) {
        cars = new Car[c];
        bikes = new Bike[b];
        System.out.println("Welcome to the Garage!");
        System.out.println("Car Capacity: " + c);
        System.out.println("Bike Capacity: " + b);

    }





    public void addVehicle(Vehicle x) {

        if(x instanceof Car) {
            if(cidx >= cars.length) {
                System.out.println("Can't add  more Cars! Capacity: " + cars.length);
            }



            else {
                cars[cidx++] = (Car) x;
                System.out.println("A " + x.getBrand() + " CAR has been added to the Garage");
            }
        }



        else if(x instanceof Bike) {
            if(bidx >= bikes.length) {
                System.out.println("Can't add more bikes! Capacity: " + bikes.length);
            }

            else {
                bikes[bidx++] = (Bike) x;
                System.out.println("A " + x.getBrand() + " BIKE has been added to the Garage");
            }
        }
    }



}

