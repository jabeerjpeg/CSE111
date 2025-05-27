package task04_LibraryTester;

public class Library {
    public int capacity;
    public int num;
    public String[] arr1;


    public void printDetail() {
        System.out.println("Maximum Capacity: " + this.capacity);
        System.out.println("Total Books: " + this.num);
        System.out.println("Book list:");
        for (int i = 0; i < this.num; i++) {
            System.out.println(this.arr1[i]);
        }
    }

    public void setBookCapacity(int n) {
        this.capacity = n;
        this.arr1 = new String[n];
    }

    public void addBook(String book) {

        if (this.num < this.capacity) {
            this.arr1[this.num] = book;
            this.num++;
            System.out.println("Book '" + book + "' added to the library");
        }

        else {
            System.out.println("Exceeds maximum capacity. You can't add more than " + this.capacity + " books");
        }

    }
}
