package instance_variable.task_09;

public class CellPhone {
    public String model = "unknown";
    public int numOfCon;
    public String [] name_num = new String [3];

    public void printDetails() {
        System.out.println("Phone Model "+ this.model);
        System.out.println("Contacts Stored "+ this.numOfCon);
        if (numOfCon > 0) {
            System.out.println("Stored Contacts: ");
            for (int i = 0; i < numOfCon; i++) {
                System.out.println( name_num[i]);
            }
        }


    }

    public void storeContact(String x) {
        if (numOfCon < 3) {
            this.name_num[this.numOfCon++] = x;
            System.out.println("Contact stored");
        }
        else {
            System.out.println("Memory full. New contact can't be stored.");
        }
    }
}


// System.out.println("");