package task13;

public class SoftwareDept extends CSEDept{
    public String chant = "Software is fun!";

    public String toString(){
        advising();
        return chant;
    }
    public void task1(){
        System.out.println("Doing Task 1 "+ chant);
        task2();
    }
}

