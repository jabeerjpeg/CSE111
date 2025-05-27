package task17_LibraryTester_bookClass;

public class Book {
    public String title;
    public String author="Unknown";
    public String genre="Fiction";
    public int page;

    public void displayDetails() {
        System.out.println("Title: "+ this.title +", Author: "+ this.author +", Genre: "+ this.genre
        +", Page: "+ this.page);

    }

    public void createBook(String title) {
        this.title = title;
    }

    public void createBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void createBook(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public void customizeGenre(String genre) {
        this.genre = genre;
        System.out.println("Updated genre of \" "+ this.title  +"\" to " + genre);
    }

    public void customizePages(int page) {
        this.page = page;
        System.out.println("Updated pages of \" "+ this.title  +"\" to " + page);

    }
}
