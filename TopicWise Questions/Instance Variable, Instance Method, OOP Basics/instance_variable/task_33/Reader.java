package instance_variable.task_33;

public class Reader {

    public String name = "New user";
    public int capacity;
    public String[] books;
    int num;

    public void createReader(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.books = new String[capacity];
        this.num = 0;
    }

    public void readerInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Capacity: " + this.capacity);
        System.out.println("Books: ");

        if (num > 0) {
            for (int i = 0; i < this.num; i++) {
                System.out.println("Book " + (i + 1) + ": " + this.books[i]);
            }
        } else {
            System.out.println("No books added yet");
        }
    }

    public void addBook(String book) {
        if (this.num < this.capacity) {
            this.books[this.num] = book;
            this.num++;
        } else {
            System.out.println("No more space for new book");
        }
    }

    public void increaseCapacity(int n) {
        String[] newBooks = new String[n];
        for (int i = 0; i < this.num; i++) {
            newBooks[i] = this.books[i];
        }
        this.books = newBooks;
        this.capacity = n;
        System.out.println(this.name + "'s capacity increased to " + this.capacity);
    }


}
