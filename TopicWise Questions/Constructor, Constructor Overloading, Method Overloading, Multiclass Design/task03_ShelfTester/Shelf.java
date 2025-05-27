package task03_ShelfTester;

public class Shelf {
    public int capacity;
    public int num;

    public void showDetails(){
        System.out.println("Shelf Capacity: " + capacity);
        System.out.println("Number of books: " + num);
    }

    public void addBooks(int n){
        this.num += n;
        if(this.capacity ==0 ){
            System.out.println("Zero capacity. Cannot add books." );
            this.num -=n;
        }
        else if(this.capacity > this.num){
            System.out.println(n+ " books added to shelf" );

        }
        else if(this.capacity < this.num){
            System.out.println("Exceeds capacity");
            this.num -=n;

        }

    }
}
