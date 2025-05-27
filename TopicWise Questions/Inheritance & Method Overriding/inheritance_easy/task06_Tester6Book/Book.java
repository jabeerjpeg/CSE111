package task06_Tester6Book;

public class Book extends Product{
        public String isbn;
        public String publisher;


        public Book(int id, String title, int price,
                    String isbn,
                    String publisher)
        {

            super(id, title, price);
            this.isbn = isbn;
            this.publisher = publisher;
        }


        public String printDetail() {
            return super.getIdTitlePrice() + "\nISB" +
                    "N: " + isbn + " Publis" +
                    "her: " + publisher;
        }


}
