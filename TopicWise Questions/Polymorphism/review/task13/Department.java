package task13;

public class Department{
    public String chant = "I love my Department!";

    public void task1(){
        System.out.println(chant);
    }

    public void task2(){
        task1();
        System.out.println("Doing Task 2 "+ chant);
    }

    public void advising(){
        System.out.println("Advising is Pain.");
    }

    public String toString(){
        advising();
        return chant;
    }
}
