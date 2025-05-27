package task04_CircleTester;

public class Circle {
    private double radius;
    public static int count;


    public Circle(int r)
    {
        this.radius =
                r;
        Circle.count
                +=1;
    }

    public double getRadius()
    {
        return this.radius;
    }



    public double setRadius(int r)
    {
        this.radius = r;
        return radius;
    }



    public double area()
    {
        return Math.PI*this.radius*
                this.radius;
    }



}
