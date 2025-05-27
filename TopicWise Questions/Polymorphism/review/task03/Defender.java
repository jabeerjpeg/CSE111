package task03;

public class Defender extends Football {
    private int tackles;
    private int interceptions;

    public Defender(String name, int age, int stamina, int tackles, int interceptions) {
        super(name, age, stamina);
        this.tackles = tackles;
        this.interceptions = interceptions;
    }


    public void display() {
        super.display();
        System.out.println("Tackles: " + tackles);
        System.out.println("Interceptions: " + interceptions);
    }


    public void calculatePerformance() {
        if (tackles == 0) {
            System.out.println("Performance: 0.0");
        } else {
            double performance = (double) interceptions / tackles;
            System.out.printf("Performance: %.3f\n", performance);
        }
    }
}
