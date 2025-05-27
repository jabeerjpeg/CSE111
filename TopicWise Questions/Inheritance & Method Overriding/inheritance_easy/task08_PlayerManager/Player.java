package task08_PlayerManager;

public class Player extends SportsPerson{
    public int goal;
    public int games;
    public double ratio;
    public int earnings;


    public Player(String team,
                  String name,
                  String role,


                  int goal , int game)

    {
        super(team, name, role);
        this.goal = goal;
        this.games = game;
        this.earnings = (goal*1000)+ (games*10);


    }

    public void calculateRatio()



    {
        this.ratio = (double)this.goal / this.games;
    }




    public void printDetails()



    {
        System.out.println(super.getNameTeam()+ "\nTeam " +
                "Role: " + super.role+
                "\nTotal Goal: " + goal + ", " +
                "Total Played: " + games);
        System.out.printf("Goal Ratio: " +
                "%.2f\n" , ratio);
        System.out.println("Match " +
                "Earnings: " + earnings+"K");


    }




}
