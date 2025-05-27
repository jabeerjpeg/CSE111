package task31_ParcelDriver;

public class Parcel {
    public String name;
    public int weight;
    public double fee;
    public int location_charge;

    public Parcel() {

    }

    public Parcel(String name){
        this.name = name;
    }

    public Parcel(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public void calcFee(String location){
        if(location.equals("Dhanmondi")){
            this.location_charge = 50;
        }
        else{
            this.location_charge = 0;
        }

        if(this.weight == 0){
            this.fee = 0.0;
        }
        this.fee=(this.weight* 20)+(this.location_charge);
    }
    public void addWeight(int weight){
        this.weight+=weight;
        System.out.println("Updated Weight: " + this.weight);
    }

    public void printDetails() {
        if(name== null){
            System.out.println("Set name first");
        }
        else{
            System.out.println("Name: " + this.name);
            System.out.println("Total Weight: "+ this.weight);
            System.out.println("Total Fee: "+ this.fee);
        }
    }



}
