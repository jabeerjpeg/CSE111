package task02_CustomerServiceTester;

public class CustomerService
{
        public String [] arr1;


        public int count;


        public int id;



    public CustomerService(int n)

    {
        count=0;
        arr1 = new String[n];
    }


    public void addCustomer(String name)
    {
        if(count<arr1.length)
        {

            arr1[count] = name;
            count++;


            System.out.println("Add" +
                    "ed: "+name);
        }



        else
        {
            System.out.println("Queue " +
                    "is full. Cannot" +
                    " add " + name);
        }
    }
    public void serveCustomer()
    {
        if(count==0) {
            System.out.println("No " +
                    "customers to serve");
        }

        else {

            System.out.println("Serving" +
                    " "+arr1[0]);

            for(int i=0;i<count-1;i++)
            {
                arr1[i]=arr1[i+1];


            }


            arr1[count-1]=null;

            count--;



        }




    }


/*

WHEN YOU SERVE CUSTOMERS,

    a   b   c  d  e
 i  0   1   2  3  4
 c  1   2   3  4  5


 we iterate from 0 to count-1  which is 4  ( 5 dile out of bounds)
 arr1[i] = arr1[i+1]
 arr1[count-1] = null;   arr1[4]= null
 count--  makes it from 4





 */
}
