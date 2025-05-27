package task04_Animal;

public class Cat extends Animal{
    public String breed;

    public Cat(String name,
               int age, String color,
               String breed)
    {

            super(name,age,color);
        this.breed = breed;


    }
    public String info()
    {

        return super.info()+ "Bre" +
                "ed: " + this.breed ;
    }



    public void makeSound()
    {
        System.out.println(this.color+ " co" +
                "lor " + this.name + " is me" +
                "owing");
    }


}
