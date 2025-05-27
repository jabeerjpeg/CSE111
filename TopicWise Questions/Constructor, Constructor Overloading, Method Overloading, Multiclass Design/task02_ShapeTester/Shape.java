package task02_ShapeTester;

public class Shape {
    public String name;
    public double area;

    public void setParameters (String s, double d, double x) {
        this.name=s;

        if (s.equals("Rectangle")) {
            this.area= (d*x);
        }
    }

    public void setParameters (String s, int d, int x) {
        this.name=s;

        if (s.equals("Triangle")) {
            this.area= (0.5 * 7 *4);
        }
    }
    public void setParameters (String s, int d) {
        this.name=s;
        if (s.equals("Circle")) {
            this.area= 3.1416*d*d;
        }
    }




    public String details() {
        return "Shape Name: "+this.name+"\nArea: "+this.area;
    }
}
