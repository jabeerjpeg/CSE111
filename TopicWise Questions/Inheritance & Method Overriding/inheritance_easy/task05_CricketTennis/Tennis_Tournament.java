package task05_CricketTennis;

public class Tennis_Tournament extends Tournament {
    public int num;


    public Tennis_Tournament(String name,
                             int num) {
        super.setName(name);
        this.num = num;
    }


    public String detail(){
        return "Tennis Tournament" +
                " Name: "
                + super.getName() + "\nNumber" +
                " of Players: " +this.num;

    }


}
