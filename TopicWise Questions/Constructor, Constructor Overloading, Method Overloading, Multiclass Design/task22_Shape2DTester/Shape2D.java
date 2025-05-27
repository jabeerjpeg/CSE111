package task22_Shape2DTester;

public class Shape2D {
    public double area1;
    public String shape;
    public int count;

    public Shape2D() {
        this.shape="Square";
        System.out.println("A " + this.shape+ " has been created with length: 5") ;
        this.area1= 25.0;
    }

    public Shape2D(int length, int length2) {
        this.shape="Rectangle";
        System.out.println("A " + this.shape+ " has been created with length: " + length + " and breadth: " + length2);
        this.area1= (double) length*length2;
    }
    public Shape2D(int length, int length2, String shape) {
        this.shape=shape;
        System.out.println("A " + this.shape+ " has been created with length: " + length + " and base: " + length2);
        this.area1= 0.5* length*length2;
    }
    public Shape2D(int l, int l2, int l3) {
        this.shape="Triangle";
        System.out.println("A " + this.shape+ " has been created with the following sides: " + l + ", " + l2 + ", " + l3);
        int s=  (l + l2 + l3) / 2;
        this.area1= (double) Math.sqrt(s*(s-l)*(s-l2)*(s-l3));
    }
    public void area(){
        if(this.shape.equals("Triangle")){
            System.out.printf("The area of the Triangle is: %.2f\n", this.area1);
        }
        else {
            System.out.println("The area of " + this.shape + " is: " + this.area1);
        }

    }
}
