package task07_CartTester;

public class Cart {
    public String [] arr1 = new String [3];
    public double [] arr2 = new double [3];
    public int count;
    public double discount;
    public double price;
    public int cartID;


    public void addItem(String item, double price)   {
        if(this.count <=2) {
            this.arr1[this.count] = item;
            this.arr2[this.count] = price;
            this.count++;
            System.out.println(item + " added to cart " + this.cartID);
            System.out.println("You have " + count + " item(s) in your cart now. ");
            this.price += price;
        }
        else {
            System.out.println("You already has 3 items in your cart ");
        }

    }
    public void addItem( double price,  String item)   {
        addItem(item, price);

    }

    public void create_cart(int n) {
        this.cartID = n;

    }




    public void cartDetails() {
        System.out.println("Your cart(c"  + this.cartID + ")");
        for (int i = 0; i < this.count; i++) {
            System.out.println(arr1[i] + " - " + arr2[i]);
        }
        System.out.println("Discount Applied: " + this.discount +"%");
        System.out.println("Total price: " + this.price );



    }

    public void giveDiscount(int n) {
        double x= (n/100.0)* this.price;
        this.price = this.price -x;
        this.discount=(double) n;
    }



}
