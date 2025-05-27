package task16_ShapeTester;

public class Circle extends Shape {
    public int radius;

    public void area(){
        double area= (3.1416 *  this.radius * (double)this.radius);
        System.out.println("Area of "+ this.color+ " Circle " + area);
    }
}
