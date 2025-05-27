package task03_CircleShapeTester;


 public class Circle extends Shape {
        public int radius;


     public Circle()
     {

     }


     public void area(){

         double area= Math.PI * this.radius * this.radius;
        System.out.printf("Area of" +
                " %s Circle: " +
                "%.2f\n",super.color, area);


     }










 }