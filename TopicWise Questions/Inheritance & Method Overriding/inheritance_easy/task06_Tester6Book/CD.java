package task06_Tester6Book;

public class CD extends Product {
        public String band;

        public String genre;

        public int min;



    public CD(int id, String title,
              int price,
              String band,
              int min, String genre) {

        super(id, title,price);
        this.band = band;
        this.genre = genre;
        this.min = min;

    }

    public String printDetail() {
        return super.getIdTitlePrice() + "\nBand: " + band + " Duratio" +
                "n: " + min + " minutes G" +
                "enre: " + genre  ;
    }
}
