package task01_BrowserHistoryTester;

public class BrowserHistory
{



    public int count = 0;
    public String[] arr1;


    public BrowserHistory(int n)
    {
        arr1 = new String[n];
        count = 0;
    }


    public void showHistory()
    {
        if (count == 0)
        {
            System.out.println("No web" +
                    " pages " +
                    "visited yet.");
        }


        if (count > 0) {
            System.out.println("Brows" +
                    "er Histor" +
                    "y: ");


            for (int i = 0; i < count; i++)


            {


                System.out.println(arr1[i]);
            }
        }
    }




    public void visitWeb(String s) {

        if (count < arr1.length)
        {
            arr1[count] = s;
            count++;


            System.out.println("Visit" +
                    "ed: " + s);
        }


        else
        {
            System.out.println("His" +
                    "tory is full. Cannot visit " + s + " from web page.");
        }


    }



    public void currentWeb() {
        if (count == 0)
        {
            System.out.println("You h" +
                    "ave not visited " +
                    "any website " +
                    "yet!");
        }




        else
        {
            System.out.println("Current" +
                    " web p" +
                    "age: " + arr1[count-1]);
        }


    }



    public void back() {


        if (count > 0) {
            count--;

            arr1[count] = null;


        }

    }

    /*          a   b    c
  count-        1   2    3
  index         0  1     2
     */


    /*

    if we want to are in count 3, and
    want to erase c, we decrease count to 2
    arr1[2] which is c == null
     */


    /*

    similar reason why we used arr1[count-1]
    to access last element
     */



}