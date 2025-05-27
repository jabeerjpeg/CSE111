package task08_PlayerTester;

public class Player {
    public static int total;
    public String name;
    public int num;
    public String country;
    public static String [] arr1= new String [11];
    public static int count;


    public Player(String name,
                  String country
            , int num)
    {
        this.name = name;

        arr1[count]=name;

        count++;

        this.country = country;

        this.num = num;

        total +=1;
    }

    public String player_detail()
    {
        return "Player Name: " +
                "" + this.name +
                "\nJersey Number:" +
                this.num + "\nCountry:"
                + this.country ;

    }

    public static void info()
    {
        System.out.println("Total" +
                " number of players: " + total);
        System.out.print("Players " +
                "enlisted so far: ");


        for(int i = 0; i<Player.count; i++)
        {

                System.out.print(Player.arr1[i]);
            if(i <count-1)
            {
                System.out.print(", ");
            }

        }

        System.out.println();


    }
}
