package task03_BookTester;

public class Book {
    public static int  total_books_sold;

    public static double   total_revenue;

    public double pAfterDis;

    public String name;




    public Book (String name, int d)
    {
        this.name = name;


        this.pAfterDis = disprice(d);

        this.total_revenue += pAfterDis;

        total_books_sold++;


    }

    public void bookDetails()
    {
        System.out.println("Title: " +
                ""+name);


        System.out.println("Price After " +
                "Discount: "+pAfterDis +" Tk");
    }


    public double disprice(int d)
    {
        double p=  (150 - (150 *
                (double)d/100));



        return p;
    }

}
