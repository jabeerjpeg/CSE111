package instance_variable.task_28;

public class MobilePhone {
    public int capacity=0;
    public String [] contact = new String[5];
    public int [] number = new int[5];
    int num;

    public void setContactCapacity(int capacity) {
        this.capacity = capacity;

    }
    public void details() {
        System.out.println("Total Contacts: "+ this.num);
        System.out.println("Contact List:");
        if(num >0) {
            for (int i = 0; i < this.num; i++) {
                System.out.println(contact[i] + ":" + number[i]);
            }
        }

    }

    public void addContact(String x, int y) {

        if(this.num <this.capacity) {
            System.out.println("The contact of " + x + " is added.");
            this.contact[num] = x;
            this.number[num] = y;
            this.num++;
        }
// num er value is 0, capacity is 5.  num <capacity hobe always  0-4  is less than 5
        else{
            System.out.println("Storage full!!!");
        }


    }

    public void makeCall( int number)
    {
        for (int i = 0; i < this.capacity; i++)
        {
            if(this.number[i] == number)
            {
                System.out.println("Calling "+this.contact[i]+" . . .");
            }

            else
            {
                System.out.println("Calling "+number+" . . .");
                break;
            }
        }


    }

}
