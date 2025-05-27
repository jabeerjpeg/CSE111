package task05_TesterBorrowerClass;



public class Borrower{
    public static int book_count [] = {3, 3, 3};
    public static String book_name [] = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};
    public String name;
    public String [] arr1= new String [3];
    public int count;


    public void borrowBook(String nm)
    {
        boolean found =
                false;
        for(int i=0;i<book_name.length ;i++)
        {


            if (book_name[i].equals(nm))
            {
                if (book_count[i] > 0)
                {

                    found = true;
                    Borrower.book_count[i]--;


                    this.arr1[count] = nm;



                    count++;



                }
            }
        }

        if(!found)
        {
            System.out.println("This " +
                    "book is not " +
                    "available");

        }


    }

    public static int remainingBooks(String nm)
    {
        int idx=-1;


        for(int i=0;i<book_name.length;i++)
        {
            if(book_name[i].equals(nm))
            {
                idx=i;
            }

        }


        return
                book_count[idx];
    }

    public Borrower(String nm)


    {
        this.name=nm;
    }

    public static void bookStatus()
    {
        System.out.println("Available Books: ");
        for(int i = 0; i < book_count.length; i++)
        {
            System.out.println(book_name[i]+":" +
                    " "+
                    book_count[i]);
        }
    }

    public void borrowerDetails()
    {
        System.out.println("Name:" +
                " "+name);
        System.out.println("Books " +
                "Borrowed:");


        for(int i = 0; i < count; i++)
        {
            System.out.println(arr1[i]);
        }


    }



}


