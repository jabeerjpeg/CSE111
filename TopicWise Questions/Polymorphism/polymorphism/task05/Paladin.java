package task05;

public class Paladin extends Warrior
{
    public void specialMove()
    {
        System.out.println(naam + " unleashes a holy strike!");
    }



    public Paladin(String name, int level)
    {
        super(name, level);
    }


}


