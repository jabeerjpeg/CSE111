package task08_PlayerManager;

public class Manager extends SportsPerson {
    public int win;

    public int earn;


    public Manager(String team,



                   String name,
                   String role,

                   int win) {

        super(team, name, role);
        this.win = win;
        this.earn= win*1000;
    }




    public void printDetails() {
        System.out.println(getNameTeam()+"\nTeam Role: "+ super.role
                + "\nTotal Win: " + win
        + "\nMatch Earning: "+ this.earn+"K");
    }
}
