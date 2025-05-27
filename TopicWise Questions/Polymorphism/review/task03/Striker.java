package task03;

public class Striker extends Football {
    private int goals;
    private int shotsOnTarget;

    public Striker(String name, int age, int stamina, int goals, int shotsOnTarget) {
        super(name, age, stamina);
        this.goals = goals;
        this.shotsOnTarget = shotsOnTarget;
    }


    public void display() {
        super.display();
        System.out.println("Goals: " + goals);
        System.out.println("Shots on target: " + shotsOnTarget);
    }


    public void calculatePerformance() {
        if (shotsOnTarget == 0) {
            System.out.println("Performance: 0.0");
        } else {
            double performance = (double) goals / shotsOnTarget;
            System.out.printf("Performance: %.3f\n", performance);
        }
    }
}
