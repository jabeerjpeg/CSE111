package task01_productTester;

public class Product {
    private String name= "Unknown";


    private double price= 0.0;


    private int quantity= 0;



    public Product()
    {
    }

    public Product(String name,
                   double price)
    {
            this.name = name;
            this.price = price;
        }

        public void displayInfo(){
            System.out.println("Product Name: " + this.name);
            System.out.print("Price: $" + this.price);

        }



        public void setQuantity(int
                                        quantity) {
        this.quantity = quantity;
        }




        public void displayInfo(boolean
                                        x)
        {
            System.out.println("Product Name: " +
                    "" + this.name);
            System.out.println("Price: $" +
                    this.price);


            if(quantity>0)
            {
                System.out.println("Quantity: "
                        + this.quantity);
            }

        }
        public double getPrice()
        {
                return price;
        }



        public int getQuantity()
        {
         return this.quantity;
        }



}
