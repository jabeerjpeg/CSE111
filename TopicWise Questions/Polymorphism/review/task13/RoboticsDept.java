package task13;

public class RoboticsDept extends EEEDept{
    public String chant = "New Department woohoo!";
    public void task2(){
        System.out.println("Doing Task 2 "+ chant);
    }
    public void advising(){
        super.advising();
        task1();
        System.out.println(chant);
    }
}
