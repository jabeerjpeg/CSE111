package task26_BracuStudentTester;

public class BracuBus {
        public String location;
        public int count=0;
        public int max;
        public String pass[];



    public BracuBus(String location) {
        this.location = location;
        pass = new String[2];
        max=2;

    }
    public BracuBus(String location, int max) {
        this.location = location;
        this.max = max;
        pass = new String[max];
    }



    public void showDetails() {
        System.out.println("Bus Route" +
                ": " + this.location);
        System.out.println("Passenger Count:" +
                " " + this.count+ " (Max: "+this.max+")");
        System.out.println("Passengers " +
                "on Board:");
        if(count>0) {
            for (int i = 0; i < this.count; i++) {
                System.out.print(pass[i] + " ");

            }
            System.out.println();
        }
    }




    public void board(){
        System.out.println("No passengers");
    }



    public void board(BracuStudent st) {
        if (st.location.equals(this.location)) {
            if (st.busspass) {
                if (this.count < this.max) {
                    System.out.println(st.name + " boarded " +
                            "the bus");
                    pass[count] = st.name;
                    this.count++;
                } else {
                    System.out.println("Bus is full!");
                }
            } else {
                System.out.println("You don't have a bus pass!");
            }

        } else {
            if (st.busspass) {
                System.out.println("You got on the wron" +
                        "g bus!"); // Wrong bus with a pass
            } else {
                System.out.println("You doesn't hav" +
                        "e a bus pass!"); // Wrong bus and no pass
            }
        }
    }





    public void board(BracuStudent st, BracuStudent st1){
        board(st);
        board(st1);

    }



}
