package task08_ReaderTester;

public class Reader {
    public String name= "New user";
    public int capacity =0;
    public String[] arr1;
    public int count;



    public String createReader(String name, int capcaicty) {
        this.name= name;
        this.capacity = capcaicty;
        this.arr1 = new String[capcaicty];
        return "A new reader is created!";
    }




    public String readerInfo() {
        String x = "";

        if (count > 0) {
            for (int i = 0; i < count; i++) {
                x += "Book " + (i + 1) + ": " + arr1[i];
                if (i < count - 1) { // Only add a newline if it's not the last book
                    x += "\n";
                }
            }
        } else {
            x = "No books added yet";
        }

        return "Name: " + this.name + "\n" +
                "Capacity: " + this.capacity + "\n" +
                "Books:\n" + x;
    }


//
//        System.out.println("Name: "+ this.name);
//        System.out.println("Capcaicty: "+ this.capacity);
//        System.out.println("Books:");
//        if(count >0) {
//            for (int i = 0; i < count; i++) {
//                System.out.println("Book " + (i + 1) + ": " + arr1[i]);
//            }
//        }
//        else {
//            System.out.println("No books added yet");
//        }





    public void addBook(String book) {
        if(this.count < this.capacity) {
            this.arr1[this.count] = book;
            this.count++;
        }
        else {
            System.out.println("No more capacity");
        }

    }
}
