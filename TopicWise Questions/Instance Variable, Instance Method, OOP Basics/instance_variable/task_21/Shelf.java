package instance_variable.task_21;

public class Shelf {
    public int capacity =0;
    public int books=0;

    public void showDetails() {
    System.out.println("Shelf capacity: " + this.capacity);
        System.out.println("Number of books: " + this.books);
    }
    public void  addBooks (int i) {
        this.books+=i;
        if ( this.capacity ==0) {
            System.out.println("Zero capacity. Cannot add books.");
            this.books-=i;

        }
        else if (this.books> this.capacity){
           System.out.println("Exceeds capcity");
           this.books-=i;
        }
        else {
            System.out.println(i+ " books added to shelf");

        }

    }

}
