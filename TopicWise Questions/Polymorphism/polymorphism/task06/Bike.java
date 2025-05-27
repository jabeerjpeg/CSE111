package task06;

public class Bike extends Vehicle {
    public String mdl;
    public boolean side;


    public void doAWheelie()
    {
        if(!side) {
            System.out.println(getBrand() + ":" + mdl + " is doing Wheelie!!");
        }
        else
        {
            System.out.println("Wheelie Failed. " + getBrand() + ":" + mdl + " has SideCar");
        }
    }


    public Bike(String b, String m, int y, int w, boolean s){
        super(b, y);
        mdl = m;
        side = s;
        setWheels(w);
    }


    public String toString()
    {
        System.out.print( "Bike" + " Brand: " + getBrand());
        System.out.print(", " + "Year: " + getYear());
        System.out.print(", " + "Wheels: " + getWheels());
        System.out.print(", " + "Model: " + mdl );
        System.out.print(", SideCar: " + side);
        return "";
    }
}
