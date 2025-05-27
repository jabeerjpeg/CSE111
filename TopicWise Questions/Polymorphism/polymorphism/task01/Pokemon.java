package task01;

public class Pokemon
{
    public String name;

    public Pokemon(String n) {
        name = n;
    }

    public void attack()
    {
        System.out.println(name + " attacks with basic move!");
    }


    public void attack(String x) {
        System.out.println(name + " uses " + x + "!");
    }


    public void attack(String x, int pow) {
        System.out.println(name + " uses " + x + " " + " with power " + pow + "!");
    }
}
