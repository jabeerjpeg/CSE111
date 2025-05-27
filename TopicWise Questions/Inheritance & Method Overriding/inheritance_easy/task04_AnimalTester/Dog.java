package task04_AnimalTester;

public class Dog extends Animal

{


    public String name;



    public Dog() {
        System.out.println("The" +
                " dog says" +
                " hello!");
    }


    public String getName()
    {
        return this.name;
    }




    public void details()
    {
        super.details();
    }




    public void updateSound(String s)
    {
        super.sound= s;
    }




}
