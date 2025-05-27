package task15_CustomerTester;

public class Customer {
    public String name;
    String[] arr1;
    int[] arr2;
    public int count=0;
    public int prices;

    public void createCustomer(String name) {
        this.name = name;
        arr1 = new String[4];
        arr2 = new int[4];
        count = 0;
    }

    public void showCart() {
        System.out.println("Customer: " + this.name);
        if(count > 0) {
            for (int i = 0; i < count; i++) {
                System.out.println("Item: " + arr1[i] + " Price: " + arr2[i]);
            }
        }
    }

    public void addItem(String item, int p) {
        if (count < arr1.length) {
            this.arr1[this.count] = item;
            this.arr2[this.count] = p;
            this.count++;
            this.prices += p;
            System.out.println(item + " added to cart " );
        } else {
            System.out.println("Cart is full");
        }
    }
    public void addItem(String item1 , int p1, String item2, int p2) {
        if (count < arr1.length-1) {
            this.arr1[this.count] = item1;
            this.arr2[this.count] = p1;
            this.count++;
            this.prices += p1;
            this.arr1[this.count] = item2;
            this.arr2[this.count] = p2;
            this.count++;
            this.prices += p2;
            System.out.println(item1 + " and"+ item2 +" added to cart " );
        } else {
            System.out.println("Cart is full");
        }
    }
    public void calculatePrice() {
        System.out.println("Total: " + this.prices);
    }
}
