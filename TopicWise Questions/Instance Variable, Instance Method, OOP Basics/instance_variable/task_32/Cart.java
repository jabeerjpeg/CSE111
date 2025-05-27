package instance_variable.task_32;

public class Cart {
    public int cartId;
    public String [] items = new String[3];
    public double [] prices = new double[3];
    public int numOfItems;
    public double discount;
    public double totalPrice;

    public void create_cart(int n) {
        this.cartId = n;
    }

    public void addItem(String item, double quantity) {
        if(this.numOfItems < 3) {
            this.items[this.numOfItems] = item;
            this.prices[this.numOfItems] = quantity;
            this.totalPrice += quantity;
            this.numOfItems++;
            System.out.println(item +" added to cart "+this.cartId);
            System.out.println("You have "+this.numOfItems+" item(s) in your cart now ");

        }
        else {
            System.out.println("You already have 3 items on your cart");
        }
    }
    public void cartDetails() {
        System.out.println("Your cart (" + this+")");
        for(int i=0; i<this.numOfItems; i++) {
            System.out.println(this.items[i] + " - " + this.prices[i]);
        }
        System.out.println("Discount applied : " + this.discount+"%");
        System.out.println("Total price: " + this.totalPrice);

    }

    public void giveDiscount(int n) {
        this.discount =n;
        double price = (this.totalPrice * ((double)n/100));
        this.totalPrice -= price;


    }




}
