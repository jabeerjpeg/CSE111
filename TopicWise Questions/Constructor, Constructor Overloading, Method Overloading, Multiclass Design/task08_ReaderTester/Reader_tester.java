package task08_ReaderTester;

public class Reader_tester {
    public static void main(String[] args) {
        Reader r1 = new Reader();
        Reader r2 = new Reader();

        System.out.println("1---");
        System.out.println(r1.createReader("Messi", 2));
        System.out.println(r2.createReader("Ronaldo", 3));

        System.out.println("2----");
        System.out.println(r1.readerInfo());
//        r1.readerInfo();

        System.out.println("3");
        r2.addBook("Java");
        r2.addBook("Python");
        r2.addBook("C++");

        System.out.println(r2.readerInfo());
//        r2.readerInfo();

        System.out.println("4---");
        r1.addBook("C#");
        r1.addBook("Rust");
        r1.addBook("GoLang"); // This should not be added as it exceeds the limit

        System.out.println("5==");
        r2.addBook("Python"); // Adding duplicate to see behavior

        System.out.println("6 ==========");

        System.out.println(r1.readerInfo());
//        r1.readerInfo();


    }
}