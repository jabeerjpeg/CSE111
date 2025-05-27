package task13;

public class EEEDept extends Department{
    public String chant = "Help.";
    public void task1(){
        System.out.println("Doing Task 1 "+ chant);
    }
    public void advising(){
        super.advising();
        System.out.println(chant);
    }
    public String toString(){
        task2();
        return chant;
    }
}
