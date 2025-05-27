package task24_TriangleTester;

public class Triangle {
    public int side1;
    public int side2;
    public int side3;
    public int perimeter;

    public Triangle(int x, int y, int z) {
        this.side1 = x;
        this.side2 = y;
        this.side3 = z;
    }


    public void triangleDetails(){
        System.out.println("Three sides of the triangle are:"
        + side1 + ", " + side2 + ", " + side3);
        System.out.println("Perimeter: "+(side1+side2+side3));
        this.perimeter = side1 + side2 + side3;

    }








    public String printTriangleType(){
        if(this.side1==this.side2 && this.side1==this.side3
        && this.side2==this.side3){
            return "This is an Equilateral Triangle";

        }
        if(this.side1!=this.side2 && this.side1!=this.side3
                && this.side2!=this.side3){
            return "This is a Scalene Triangle";

        }
        return  "This is an Isoceles Triangle";

    }



    public void compareTrinagles(Triangle t)
    {
        if(this== t){
            System.out.println("These two triangle objects have the same address.");

        }




        else if(this.side1==t.side1 && this.side2==t.side2
        && this.side3==t.side3){
            System.out.println("Addresses are different but the sides of the triangle are equal.");
        }



        else if(this.perimeter==t.perimeter)


        {
            System.out.println("Only the perimeter" +
                    " of the triangle are equal.");

        }



        else{
            System.out.println("Addresses," +
                    " length of the sides and perimeter " +
                    "all are different.");
        }


    }

}
