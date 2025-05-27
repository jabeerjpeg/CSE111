package task06;

public class Car extends Vehicle
{
    public String mdl;
    public int door;
    public boolean ai;


    public Car(String b, String m, int y, int d, int w, boolean a){
        super(b, y);
        mdl = m;
        door = d;
        ai = a;
        setWheels(w);
    }

    public String toString()
    {
        System.out.print( "Car Brand: " + getBrand() );
        System.out.print(", Year: " + getYear() );
        System.out.print(", Wheels: " + getWheels() );
        System.out.print(", Model: " + mdl );
        System.out.print(", Doors: " + door );
        System.out.print(", AI: " + ai);
        return "";
    }



    public void startAutoPilot(){
        if(!ai) {
            System.out.println(this.getBrand() + ":" + mdl + " has" + " NO AutoPilot");
        }

        else {
            System.out.println(this.getBrand() + ":" + mdl + " AutoPilot Started");
        }
    }



}


