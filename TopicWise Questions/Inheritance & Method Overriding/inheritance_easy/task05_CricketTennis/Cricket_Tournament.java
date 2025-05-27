package task05_CricketTennis;

public class Cricket_Tournament extends Tournament {
    public int num=0;

    public String type = "No type";

    public Cricket_Tournament() {

    }

    public Cricket_Tournament(String name,
                              int num,
                              String type) {
        super.setName(name);
        this.num = num;
        this.type = type;



    }

    public String detail(){
        return "Cricket Tournament Name: "
                + super.getName() + "\nNumber " +
                "of Teams: " +this.num
                + "\nType: " + this.type;
    }


}
