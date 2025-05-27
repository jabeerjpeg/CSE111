package task32_TeamTester;

public class Team {
    public String name;
    public Player [] arr1= new Player[5];
    public int count;
    public Team(){

    }
    public Team(String name){
        this.name = name;
    }

    public void updateName(String name){
        this.name=name;
    }

    public void addPlayer(Player name){
        this.arr1[this.count++]= name;
    }

    public void printDetail(){
        System.out.println("Team: "+ this.name);
        System.out.println("List of players: ");
        for(int i=0;i<this.count;i++){
            System.out.println("Name: " + this.arr1[i].name);
            System.out.println("Age: " + this.arr1[i].age+", Total Matches: " + this.arr1[i].matches);
        }

    }

}
