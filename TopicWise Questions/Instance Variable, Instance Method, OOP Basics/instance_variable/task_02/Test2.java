package instance_variable.task_02;

public class Test2 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("Radius of circle is "+ c1.radius);
        double area= c1.radius * Math.PI * c1.radius;   //double ta check dio
        System.out.println("The area of circle is "+ area);
        double perimeter = c1.radius * 2 * Math.PI;
        System.out.println("The circumference of the circle is "+ perimeter);

    }
}
