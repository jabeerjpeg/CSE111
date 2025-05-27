package instance_variable.task_18;

public class Cat {
    public String color= "White";
    public String action= "sitting";
    public void printCat() {
        System.out.println(this.color + " cat is " + this.action);
    }
}
