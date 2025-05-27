package task03_CheckingACC;

public class CheckingAccount extends Account
{


    public static int count;

    public CheckingAccount()
    {
        super(0.0);
        count++;
    }




    public CheckingAccount(double n)
    {



        super(n);
        count++;
    }
}
