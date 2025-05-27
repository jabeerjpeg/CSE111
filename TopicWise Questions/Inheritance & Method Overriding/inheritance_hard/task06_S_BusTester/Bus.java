package task06_S_BusTester;

public class Bus {
    public String [] arr1;
    public int count;
    public String destination;

    public Bus(int cap, String des){
        arr1 = new String[cap];
        this.destination = des;
        System.out.println("Capacity: " + cap);
        System.out.println("Destination: " + destination);
    }


    public void addPassenger(String name, String des){
        if(count == arr1.length){
            System.out.println("Bus is full");
        }
        else if( count < arr1.length){
             if(des != this.destination){
                 System.out.println("Sorry " + name + "! The bus won't stop at " + des
                 + "\nUse another bus.");
             }
             else{
                 System.out.println(name + " is added to the bus.");
                 arr1[count]=name;
                 count++;
             }
        }

    }

    public void addPassenger(String name ){
        if(count == arr1.length){
            System.out.println("Bus is full");
        }
        else if( count < arr1.length){
            System.out.println(name + " is added to the bus.");
            System.out.println(name + " will get off at the last stop.");
            arr1[count]=name;
            count++;
        }
    }


}
