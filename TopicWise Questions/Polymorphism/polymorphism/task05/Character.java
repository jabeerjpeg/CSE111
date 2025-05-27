package task05;

public class Character
{
    public String naam;
    public int lvl;


    public Character(String n, int l) {
        naam = n;
        lvl = l;
    }


    public boolean equals(Object x)
    {
        if (x instanceof Character) {

            Character a = (Character) x;

            return this.naam.equals(a.naam) && this.lvl == a.lvl;
        }

        if (this == x) {
            return true;
        }

        return false;
    }



    public void specialMove()
    {
        System.out.println("Character uses a generic move.");
    }

}


