package task06_CargoTester;

public class Cargo {
    public static double capacity=10.0;
    public int id;

    public static int idnumber;

    public String contents;

    public double weight;

    boolean load= false;


    public static double capacity()
    {
        return capacity;
    }


    public Cargo(String contents,
                 double weight){
        this.contents = contents;

        this.weight = weight;

        idnumber++;

        id=idnumber;

    }

    public void details()

    {
        System.out.println("Cargo ID: " +
                ""+id +", Contents: "+contents
        +", Weight: "+weight +", Loaded: " +
                ""+load);
    }


    public void load()
    {
        Cargo.capacity-=this.weight;
        if(Cargo.capacity<0)
        {


            System.out.println("Cannot " +
                    "load cargo, exceeds " +
                    "weight capacity.");
            Cargo.capacity+=this.weight;

        }
        else {
            load = true;
            System.out.println("Cargo " +
                    "" + id + " loaded" +
                    " for transport.");

        }
    }


//    public void load() {
//        if (!load) {
//            if (capacity >= weight) {
//                load = true;
//                capacity -= weight;
//                System.out.println("Cargo " + id + " loaded for transport.");
//            } else {
//                System.out.println("Cannot load cargo, exceeds weight capacity.");
//            }
//        }
//    }


    public void unload()
    {
        Cargo.capacity+=this.weight;

            load = false;

            System.out.println("Cargo "
                    + id + " unloaded.");
        }



//    public void unload() {
//        if (load) {
//            load = false;
//            capacity += weight;
//            System.out.println("Cargo " + id + " unloaded.");
//        }
//    }

}
