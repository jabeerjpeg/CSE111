package task34_BookTester;

public class Book {
    public String title;
    public String author;
    public int price;

    public Book(String title){
        this.title = title;
    }
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    public Book(String title, String author, int price ){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void setDetails(String author, int price){
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        if (title != null) {
            System.out.print("Title: " + title);
        }
        if (author != null) {
            System.out.print(", Author: " + author);
        }
        if (price > 0) {
            System.out.print(", Price: " + price);
        }
        System.out.println();
    }

        public void setDetails(int price){
            this.price = price;
        }




    }


